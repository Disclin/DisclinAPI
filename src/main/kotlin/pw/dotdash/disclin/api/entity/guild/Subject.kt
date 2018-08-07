package pw.dotdash.disclin.api.entity.guild

import pw.dotdash.disclin.api.entity.Identifiable

interface Subject : Identifiable, GuildEntity {

    operator fun plusAssign(permission: Permission)

    operator fun remAssign(permission: Permission)

    operator fun contains(permission: Permission): Boolean

    operator fun iterator(): Iterator<Permission>
}