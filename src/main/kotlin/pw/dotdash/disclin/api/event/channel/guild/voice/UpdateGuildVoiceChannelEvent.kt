package pw.dotdash.disclin.api.event.channel.guild.voice

import pw.dotdash.disclin.api.event.channel.guild.UpdateGuildChannelEvent

interface UpdateGuildVoiceChannelEvent : UpdateGuildChannelEvent, GuildVoiceChannelEvent {

    interface Name : UpdateGuildChannelEvent.Name, UpdateGuildVoiceChannelEvent

    interface Permissions : UpdateGuildChannelEvent.Permissions, UpdateGuildVoiceChannelEvent

    interface Position : UpdateGuildChannelEvent.Position, UpdateGuildVoiceChannelEvent

    interface Parent : UpdateGuildChannelEvent.Parent, UpdateGuildVoiceChannelEvent

    interface Bitrate : UpdateGuildVoiceChannelEvent {

        val oldBitrate: Int

        val newBitrate: Int
    }

    interface UserLimit : UpdateGuildVoiceChannelEvent {

        val oldUserLimit: Int

        val newUserLimit: Int
    }
}