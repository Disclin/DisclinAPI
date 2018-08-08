package pw.dotdash.disclin.api.event.channel.guild.text

import pw.dotdash.disclin.api.entity.channel.guild.GuildTextChannel
import pw.dotdash.disclin.api.event.channel.guild.GuildChannelEvent

interface GuildTextChannelEvent : GuildChannelEvent {

    override val channel: GuildTextChannel
}