package pw.dotdash.disclin.api.entity.guild

import pw.dotdash.disclin.api.entity.user.User

interface Ban {

    val user: User

    val reason: String
}