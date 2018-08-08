package pw.dotdash.disclin.api.event.channel.guild.category

import pw.dotdash.disclin.api.entity.channel.guild.GuildCategory
import pw.dotdash.disclin.api.event.channel.guild.GuildChannelEvent

interface GuildCategoryEvent : GuildChannelEvent {

    override val channel: GuildCategory
}