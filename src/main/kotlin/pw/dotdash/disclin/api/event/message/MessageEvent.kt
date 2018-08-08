package pw.dotdash.disclin.api.event.message

import pw.dotdash.disclin.api.entity.channel.TextChannel
import pw.dotdash.disclin.api.entity.guild.Member
import pw.dotdash.disclin.api.entity.message.Message
import pw.dotdash.disclin.api.entity.user.User
import pw.dotdash.disclin.api.event.Event

interface MessageEvent : Event {

    val author: User

    val authorMember: Member?

    val channel: TextChannel

    val message: Message
}