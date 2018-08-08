package pw.dotdash.disclin.api.event.guild

import pw.dotdash.disclin.api.entity.guild.Guild
import pw.dotdash.disclin.api.event.Event

interface GuildEvent : Event {

    val guild: Guild
}