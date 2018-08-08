package pw.dotdash.disclin.api.event.message.direct

import pw.dotdash.disclin.api.entity.channel.direct.DirectTextChannel
import pw.dotdash.disclin.api.entity.user.User
import pw.dotdash.disclin.api.event.message.MessageEvent

interface DirectMessageEvent : MessageEvent {

    override val channel: DirectTextChannel

    val recipient: User get() = channel.recipient
}