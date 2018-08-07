package pw.dotdash.disclin.api.entity.channel.direct

import pw.dotdash.disclin.api.entity.user.User

interface DirectChannel {

    val recipient: User
}