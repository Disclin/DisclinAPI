package pw.dotdash.disclin.api.event.reaction.direct

import pw.dotdash.disclin.api.entity.channel.direct.DirectTextChannel
import pw.dotdash.disclin.api.entity.user.User
import pw.dotdash.disclin.api.event.reaction.ReactionEvent

interface DirectReactionEvent : ReactionEvent {

    override val channel: DirectTextChannel

    val recipient: User get() = channel.recipient
}