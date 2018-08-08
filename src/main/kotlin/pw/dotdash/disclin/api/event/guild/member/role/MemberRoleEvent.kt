package pw.dotdash.disclin.api.event.guild.member.role

import pw.dotdash.disclin.api.entity.guild.Role
import pw.dotdash.disclin.api.event.guild.member.MemberEvent

interface MemberRoleEvent : MemberEvent {

    val role: Role
}