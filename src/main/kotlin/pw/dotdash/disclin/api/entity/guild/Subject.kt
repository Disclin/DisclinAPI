package pw.dotdash.disclin.api.entity.guild

import pw.dotdash.disclin.api.entity.Identifiable

interface Subject : Identifiable, GuildEntity {

    suspend operator fun plus(permission: Permission): Subject

    suspend operator fun minus(permission: Permission): Subject

    operator fun contains(permission: Permission): Boolean

    operator fun iterator(): Iterator<Permission>
}