package pw.dotdash.disclin.api.event.channel.guild.text

import pw.dotdash.disclin.api.event.channel.guild.UpdateGuildChannelEvent

interface UpdateGuildTextChannelEvent : UpdateGuildChannelEvent, GuildTextChannelEvent {

    interface Name : UpdateGuildChannelEvent.Name, UpdateGuildTextChannelEvent

    interface Permissions : UpdateGuildChannelEvent.Permissions, UpdateGuildTextChannelEvent

    interface Position : UpdateGuildChannelEvent.Position, UpdateGuildTextChannelEvent

    interface Parent : UpdateGuildChannelEvent.Parent, UpdateGuildTextChannelEvent

    interface NSFW : UpdateGuildTextChannelEvent {

        val oldNSFW: Boolean

        val newNSFW: Boolean
    }

    interface Topic : UpdateGuildTextChannelEvent {

        val oldTopic: String

        val newTopic: String
    }
}