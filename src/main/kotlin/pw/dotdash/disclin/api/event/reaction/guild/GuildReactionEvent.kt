package pw.dotdash.disclin.api.event.reaction.guild

import pw.dotdash.disclin.api.entity.channel.guild.GuildTextChannel
import pw.dotdash.disclin.api.entity.guild.Guild
import pw.dotdash.disclin.api.entity.guild.Member
import pw.dotdash.disclin.api.event.reaction.ReactionEvent

interface GuildReactionEvent : ReactionEvent {

    val guild: Guild

    override val channel: GuildTextChannel

    val member: Member?
}