package pw.dotdash.disclin.api.event.channel.guild.category

import pw.dotdash.disclin.api.event.channel.guild.UpdateGuildChannelEvent

interface UpdateGuildCategoryEvent : UpdateGuildChannelEvent, GuildCategoryEvent {

    interface Name : UpdateGuildChannelEvent.Name, UpdateGuildCategoryEvent

    interface Permissions : UpdateGuildChannelEvent.Permissions, UpdateGuildCategoryEvent

    interface Position : UpdateGuildChannelEvent.Position, UpdateGuildCategoryEvent
}