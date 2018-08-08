package pw.dotdash.disclin.api.event.guild.ban

import pw.dotdash.disclin.api.entity.user.User
import pw.dotdash.disclin.api.event.guild.GuildEvent

interface GuildBanEvent : GuildEvent {

    val user: User
}