package pw.dotdash.disclin.api.event.guild.member

import pw.dotdash.disclin.api.entity.guild.Member
import pw.dotdash.disclin.api.event.guild.GuildEvent

interface MemberEvent : GuildEvent {

    val member: Member
}