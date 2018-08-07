package pw.dotdash.disclin.api.entity.user

import pw.dotdash.disclin.api.entity.Identifiable
import pw.dotdash.disclin.api.entity.Mentionable
import pw.dotdash.disclin.api.entity.channel.DirectTextChannel
import pw.dotdash.disclin.api.entity.message.MessageReceiver

interface User : Identifiable, Mentionable, MessageReceiver {

    val name: String

    val discriminator: String

    val avatar: String?

    val bot: Boolean

    val mfaEnabled: Boolean

    val activity: Activity?

    override val asMention: String
        get() = "<@$id>"

    suspend fun openChannel(): DirectTextChannel
}