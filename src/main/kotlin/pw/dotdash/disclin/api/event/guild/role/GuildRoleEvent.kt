package pw.dotdash.disclin.api.event.guild.role

import pw.dotdash.disclin.api.entity.guild.Role
import pw.dotdash.disclin.api.event.guild.GuildEvent

interface GuildRoleEvent : GuildEvent {

    val role: Role
}