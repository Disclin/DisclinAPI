package pw.dotdash.disclin.api.event.channel

import pw.dotdash.disclin.api.entity.channel.Channel
import pw.dotdash.disclin.api.event.Event

interface ChannelEvent : Event {

    val channel: Channel
}