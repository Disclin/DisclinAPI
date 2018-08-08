package pw.dotdash.disclin.api.entity.channel.direct

import pw.dotdash.disclin.api.entity.channel.Channel
import pw.dotdash.disclin.api.entity.user.User

interface DirectChannel : Channel {

    val recipient: User
}