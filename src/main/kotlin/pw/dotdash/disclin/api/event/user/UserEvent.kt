package pw.dotdash.disclin.api.event.user

import pw.dotdash.disclin.api.entity.user.User
import pw.dotdash.disclin.api.event.Event

interface UserEvent : Event {

    val user: User
}