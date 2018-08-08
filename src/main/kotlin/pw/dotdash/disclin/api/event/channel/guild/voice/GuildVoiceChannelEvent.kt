package pw.dotdash.disclin.api.event.channel.guild.voice

import pw.dotdash.disclin.api.entity.channel.guild.GuildVoiceChannel
import pw.dotdash.disclin.api.event.channel.guild.GuildChannelEvent

interface GuildVoiceChannelEvent : GuildChannelEvent {

    override val channel: GuildVoiceChannel
}