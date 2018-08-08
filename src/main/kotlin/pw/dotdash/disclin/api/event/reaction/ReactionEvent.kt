package pw.dotdash.disclin.api.event.reaction

import pw.dotdash.disclin.api.entity.channel.TextChannel
import pw.dotdash.disclin.api.entity.message.Reaction
import pw.dotdash.disclin.api.entity.user.User
import pw.dotdash.disclin.api.event.Event

interface ReactionEvent : Event {

    val channel: TextChannel

    val user: User

    val reaction: Reaction
}