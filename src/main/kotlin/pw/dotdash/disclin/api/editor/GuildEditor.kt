package pw.dotdash.disclin.api.editor

import pw.dotdash.disclin.api.entity.channel.GuildTextChannel
import pw.dotdash.disclin.api.entity.channel.GuildVoiceChannel
import pw.dotdash.disclin.api.entity.guild.*

interface GuildEditor {

    /**
     * The name of the [pw.dotdash.disclin.api.entity.guild.Guild].
     * Must be 2-100 characters.
     */
    var name: String

    /**
     * The voice region of the [pw.dotdash.disclin.api.entity.guild.Guild].
     */
    var region: Region

    /**
     * The base64 128x128 jpeg image for the [pw.dotdash.disclin.api.entity.guild.Guild] icon.
     */
    var icon: String?

    /**
     * The base64 128x128 jpeg image for the [pw.dotdash.disclin.api.entity.guild.Guild] splash (VIP only).
     */
    var splash: String?

    /**
     * The [Member] to transfer [pw.dotdash.disclin.api.entity.guild.Guild] ownership to.
     * The current user must be owner.
     */
    var owner: Member

    /**
     * The [VerificationLevel] of the [pw.dotdash.disclin.api.entity.guild.Guild].
     */
    var verificationLevel: VerificationLevel

    /**
     * The [default message notification level][NotificationLevel] of the [pw.dotdash.disclin.api.entity.guild.Guild].
     */
    var notificationLevel: NotificationLevel

    /**
     * The [explicit content filter level][ContentFilterLevel] of the [pw.dotdash.disclin.api.entity.guild.Guild].
     */
    var contentFilterLevel: ContentFilterLevel

    /**
     * The [GuildVoiceChannel] to which AFK chatters are sent.
     */
    var afkChannel: GuildVoiceChannel?

    /**
     * How long to wait before AFK chatters are sent to [afkChannel].
     */
    var afkTimeout: AFKTimeout

    /**
     * The [GuildTextChannel] to which system messages are sent.
     */
    var systemChannel: GuildTextChannel?
}