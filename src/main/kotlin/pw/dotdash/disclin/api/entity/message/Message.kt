package pw.dotdash.disclin.api.entity.message

import pw.dotdash.disclin.api.entity.Identifiable
import pw.dotdash.disclin.api.entity.Mentionable
import pw.dotdash.disclin.api.entity.Snowflake
import pw.dotdash.disclin.api.entity.channel.TextChannel
import pw.dotdash.disclin.api.entity.channel.direct.DirectTextChannel
import pw.dotdash.disclin.api.entity.channel.guild.GuildCategory
import pw.dotdash.disclin.api.entity.channel.guild.GuildTextChannel
import pw.dotdash.disclin.api.entity.guild.Guild
import pw.dotdash.disclin.api.entity.guild.Invite
import pw.dotdash.disclin.api.entity.guild.Member
import pw.dotdash.disclin.api.entity.guild.Role
import pw.dotdash.disclin.api.entity.user.User
import java.time.Instant

interface Message : Identifiable {

    companion object

    /**
     * The [Guild] this message was sent in, or null if not sent in one.
     */
    val guild: Guild?

    /**
     * The [TextChannel] this message was sent in.
     */
    val channel: TextChannel

    /**
     * The [GuildTextChannel] this message was sent in, or null if not sent in a [Guild].
     */
    val guildChannel: GuildTextChannel?

    /**
     * The [DirectTextChannel] this message was sent in, or null if not sent to a [User].
     */
    val directChannel: DirectTextChannel?

    /**
     * The [GuildCategory] this message was sent in, or null if not sent in a [Guild].
     */
    val category: GuildCategory? get() = guildChannel?.parent

    /**
     * The [author][User] of this message.
     */
    val author: User

    /**
     * The [author][User] of this message as a [Member], or null if this message is not from a [Guild].
     */
    val authorMember: Member?

    /**
     * The raw textual content of this message.
     */
    val content: String

    /**
     * The [Instant] when this message was created.
     */
    val timestamp: Instant

    /**
     * The [Instant] when this message was last edited, or null if this message hasn't been edited.
     */
    val editedTimestamp: Instant?

    /**
     * Whether this message has been edited.
     */
    val isEdited: Boolean get() = editedTimestamp != null

    /**
     * Whether this message triggers Text-To-Speech
     */
    val isTTS: Boolean

    /**
     * Whether this message mentions everyone with @everyone or @here.
     */
    val mentionsEveryone: Boolean

    /**
     * The list of [users][User] mentioned in this message.
     */
    val userMentions: List<User>

    /**
     * The list of [roles][Role] mentioned in this message.
     */
    val roleMentions: List<Role>

    /**
     * The list of [guild channels][GuildTextChannel] mentioned in this message.
     */
    val channelMentions: List<GuildTextChannel>

    /**
     * The list of [files attached][Attachment] to this message.
     */
    val attachments: List<Attachment>

    /**
     * The list of [reactions][Reaction] on this message.
     */
    val reactions: List<Reaction>

    /**
     * The list of [invites][Invite] in this message.
     */
    val invites: List<Invite>

    val nonce: Snowflake?

    /**
     * Whether this message has been pinned in its [parent channel][TextChannel].
     */
    val isPinned: Boolean

    /**
     * Whether this message was sent by a [pw.dotdash.disclin.api.entity.webhook.Webhook], and not by a [User]
     */
    val isFromWebhook: Boolean

    /**
     * The [type][MessageType] of this message.
     */
    val type: MessageType

    val activity: MessageActivity?

    val application: MessageApplication?

    suspend fun editMessage(newContent: CharSequence)

    suspend fun editMessage(newEmbed: Embed)

    suspend fun editMessage(newMessage: Message)

    /**
     * Adds this message to the [channel's][TextChannel] pinned message list.
     */
    suspend fun pin()

    /**
     * Removes this message from the [channel's][TextChannel] pinned message list.
     */
    suspend fun unpin()

    /**
     * Adds your [Reaction] to this message with the provided [emoji][Emoji].
     */
    suspend fun addReaction(emoji: Emoji)

    /**
     * Adds your [Reaction] to this message with the provided [unicode][String].
     */
    suspend fun addReaction(unicode: String)

    /**
     * Removes your [Reaction] to this message with the provided [emoji][Emoji].
     */
    suspend fun removeReaction(emoji: Emoji)

    /**
     * Removes all [reactions][Reaction] from this message.
     */
    suspend fun clearReactions()

    /**
     * Deletes this message.
     */
    suspend fun delete()

    //                                                     //
    // -------------------- Operators -------------------- //
    //                                                     //

    operator fun contains(mentionable: Mentionable): Boolean

    /**
     * Adds your [Reaction] to this message with the provided [emoji][Emoji].
     */
    suspend operator fun plusAssign(emoji: Emoji)

    /**
     * Removes your [Reaction] to this message with the provided [emoji][Emoji].
     */
    suspend operator fun minusAssign(emoji: Emoji)
}