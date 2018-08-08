package pw.dotdash.disclin.api.entity.message

import pw.dotdash.disclin.api.entity.Entity
import pw.dotdash.disclin.api.entity.Identifiable
import pw.dotdash.disclin.api.entity.channel.TextChannel
import pw.dotdash.disclin.api.entity.channel.direct.DirectTextChannel
import pw.dotdash.disclin.api.entity.channel.guild.GuildTextChannel
import pw.dotdash.disclin.api.entity.guild.Guild
import pw.dotdash.disclin.api.entity.user.User

interface Reaction : Entity {

    /**
     * The [Guild] this reaction was used in, or null if not sent in one.
     */
    val guild: Guild?

    /**
     * The [TextChannel] this reaction was used in.
     */
    val channel: TextChannel

    /**
     * The [GuildTextChannel] this reaction was used in, or null if it is not from a [Guild].
     */
    val guildChannel: GuildTextChannel? get() = channel as? GuildTextChannel

    /**
     * The [DirectTextChannel] this reaction was used in, or null if it not from a [DM][User].
     */
    val directChannel: DirectTextChannel? get() = channel as? DirectTextChannel

    val count: Int

    val hasMe: Boolean

    val emoji: Emote

    suspend fun listUsers(amount: Int = 100): List<User>

    /**
     * Removes this reaction from the [Message].
     */
    suspend fun remove()

    /**
     * Removes this reaction from the provided [User] from the [Message].
     *
     * @param user The user to remove for
     */
    suspend fun remove(user: User)

    interface Emote : Identifiable {

        val name: String

        val emoji: Emoji?
    }
}