package pw.dotdash.disclin.api.event.channel.guild

import pw.dotdash.disclin.api.entity.channel.guild.GuildChannel
import pw.dotdash.disclin.api.event.channel.ChannelEvent

interface GuildChannelEvent : ChannelEvent {

    override val channel: GuildChannel
}