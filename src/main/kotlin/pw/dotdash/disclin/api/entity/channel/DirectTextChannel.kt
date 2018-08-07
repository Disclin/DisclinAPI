package pw.dotdash.disclin.api.entity.channel

import pw.dotdash.disclin.api.entity.user.User

interface DirectTextChannel : TextChannel {

    val recipient: User
}