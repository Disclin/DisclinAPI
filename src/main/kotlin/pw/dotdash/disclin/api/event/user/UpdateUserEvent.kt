package pw.dotdash.disclin.api.event.user

import pw.dotdash.disclin.api.entity.user.UserStatus
import pw.dotdash.disclin.api.entity.user.Activity as UserActivity

interface UpdateUserEvent : UserEvent {

    interface Activity : UpdateUserEvent {

        val oldActivity: UserActivity

        val newActivity: UserActivity
    }

    interface Avatar : UpdateUserEvent {

        val oldAvatar: String?

        val newAvatar: String?
    }

    interface Discriminator : UpdateUserEvent {

        val oldDiscriminator: String

        val newDiscriminator: String
    }

    interface Name : UpdateUserEvent {

        val oldName: String

        val newName: String
    }

    interface Status : UpdateUserEvent {

        val oldStatus: UserStatus

        val newStatus: UserStatus
    }
}