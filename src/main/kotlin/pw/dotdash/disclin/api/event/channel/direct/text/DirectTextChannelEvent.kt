package pw.dotdash.disclin.api.event.channel.direct.text

import pw.dotdash.disclin.api.entity.channel.direct.DirectTextChannel
import pw.dotdash.disclin.api.event.channel.direct.DirectChannelEvent

interface DirectTextChannelEvent : DirectChannelEvent {

    override val channel: DirectTextChannel
}