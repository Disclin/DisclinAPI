package pw.dotdash.disclin.api.entity.channel

import pw.dotdash.disclin.api.entity.Identifiable

interface Channel : Identifiable {

    val name: String

    val type: ChannelType
}