package pw.dotdash.disclin.api.builder

import pw.dotdash.disclin.api.entity.guild.*

interface GuildBuilder {

    var name: String

    var icon: String?

    var region: Region

    var afkTimeout: AFKTimeout

    var verificationLevel: VerificationLevel

    var notificationLevel: NotificationLevel

    var contentFilterLevel: ContentFilterLevel

    var mfaLevel: MFALevel
}