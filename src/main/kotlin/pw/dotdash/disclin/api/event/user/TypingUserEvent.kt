package pw.dotdash.disclin.api.event.user

import pw.dotdash.disclin.api.entity.channel.TextChannel
import pw.dotdash.disclin.api.entity.channel.direct.DirectTextChannel
import pw.dotdash.disclin.api.entity.channel.guild.GuildTextChannel
import pw.dotdash.disclin.api.entity.guild.Guild
import pw.dotdash.disclin.api.entity.guild.Member

interface TypingUserEvent : UserEvent {

    val channel: TextChannel

    val guildChannel: GuildTextChannel? get() = channel as? GuildTextChannel

    val directChannel: DirectTextChannel? get() = channel as? DirectTextChannel

    val guild: Guild?

    val member: Member?
}