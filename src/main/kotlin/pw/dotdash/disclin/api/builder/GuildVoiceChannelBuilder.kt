package pw.dotdash.disclin.api.builder

import pw.dotdash.disclin.api.entity.channel.guild.GuildCategory
import pw.dotdash.disclin.api.entity.guild.Permission
import pw.dotdash.disclin.api.entity.guild.Subject

interface GuildVoiceChannelBuilder {

    var reason: String?

    var name: String

    var bitrate: Int?

    var userLimit: Int?

    var category: GuildCategory?

    infix fun Subject.allow(permission: Permission)

    infix fun Subject.allow(permissions: Collection<Permission>)

    infix fun Subject.deny(permission: Permission)

    infix fun Subject.deny(permissions: Collection<Permission>)
}