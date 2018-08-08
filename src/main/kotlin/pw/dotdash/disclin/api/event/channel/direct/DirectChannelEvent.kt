package pw.dotdash.disclin.api.event.channel.direct

import pw.dotdash.disclin.api.entity.channel.direct.DirectChannel
import pw.dotdash.disclin.api.event.channel.ChannelEvent

interface DirectChannelEvent : ChannelEvent {

    override val channel: DirectChannel
}