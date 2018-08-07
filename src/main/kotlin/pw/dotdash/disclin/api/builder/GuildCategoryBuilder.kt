package pw.dotdash.disclin.api.builder

import pw.dotdash.disclin.api.entity.guild.Permission
import pw.dotdash.disclin.api.entity.guild.Subject

interface GuildCategoryBuilder {

    var reason: String?

    var name: String

    infix fun Subject.allow(permission: Permission)

    infix fun Subject.allow(permissions: Collection<Permission>)

    infix fun Subject.deny(permission: Permission)

    infix fun Subject.deny(permissions: Collection<Permission>)
}