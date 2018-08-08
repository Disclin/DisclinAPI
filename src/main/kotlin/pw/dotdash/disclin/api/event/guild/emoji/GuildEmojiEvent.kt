package pw.dotdash.disclin.api.event.guild.emoji

import pw.dotdash.disclin.api.entity.message.Emoji
import pw.dotdash.disclin.api.event.guild.GuildEvent

interface GuildEmojiEvent : GuildEvent {

    val emoji: Emoji
}