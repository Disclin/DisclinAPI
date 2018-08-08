package pw.dotdash.disclin.api.entity.guild

import pw.dotdash.disclin.api.entity.Mentionable
import pw.dotdash.disclin.api.entity.channel.guild.GuildVoiceChannel
import pw.dotdash.disclin.api.entity.user.User
import java.time.Instant

interface Member : Subject, Mentionable {

    val user: User

    val nick: String?

    val name: String get() = nick ?: user.name

    val roles: List<Role>

    val joinedAt: Instant

    val isDeafened: Boolean

    val isMuted: Boolean

    val isOwner: Boolean get() = guild.owner == this

    override val asMention: String
        get() = "<@!$id>"

    suspend fun edit(nick: String? = this.nick,
                     deafened: Boolean = this.isDeafened,
                     muted: Boolean = this.isMuted,
                     roles: List<Role> = this.roles)

    /**
     * Adds the provided [Role] to this member.
     *
     * @param role The provided role
     */
    suspend operator fun plusAssign(role: Role)

    /**
     * Adds the provided [Role]s to this member.
     *
     * @param roles The provided roles
     */
    suspend operator fun plusAssign(roles: Collection<Role>) {
        for (role in roles) {
            this.plusAssign(role)
        }
    }

    /**
     * Removes the provided [Role] from this member.
     *
     * @param role The provided role
     */
    suspend operator fun remAssign(role: Role)

    /**
     * Removes the provided [Role]s from this member.
     *
     * @param roles The provided roles
     */
    suspend operator fun remAssign(roles: Collection<Role>) {
        for (role in roles) {
            this.remAssign(role)
        }
    }

    /**
     * Transforms this member's roles based on the provided function.
     *
     * @param fn The provided function
     */
    suspend fun transformRoles(fn: suspend (List<Role>) -> List<Role>)

    /**
     * Moves this member to the provided [GuildVoiceChannel].
     *
     * @param channel The provided voice channel
     */
    suspend fun move(channel: GuildVoiceChannel)

    /**
     * Kicks this member from the [Guild], with optionally provided [reason].
     *
     * @param reason The provided reason, default null
     */
    suspend fun kick(reason: String? = null)

    /**
     * Bans this member from the [Guild], with optionally provided [days of messages to delete][deleteMessageDays]
     * and [reason].
     *
     * @param deleteMessageDays The provided days of messages to delete, default 0 (No messages deleted)
     * @param reason The provided reason, default null
     */
    suspend fun ban(deleteMessageDays: Int = 0, reason: String? = null)

    /**
     * Transfers ownership of the [Guild] to this member.
     */
    suspend fun transferOwnership()
}