package pw.dotdash.disclin.api.event.message.guild

import pw.dotdash.disclin.api.entity.channel.guild.GuildTextChannel
import pw.dotdash.disclin.api.entity.guild.Guild
import pw.dotdash.disclin.api.event.message.MessageEvent

interface GuildMessageEvent : MessageEvent {

    val guild: Guild

    override val channel: GuildTextChannel
}