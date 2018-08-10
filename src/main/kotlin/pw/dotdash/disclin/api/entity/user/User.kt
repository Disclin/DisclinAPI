package pw.dotdash.disclin.api.entity.user

import pw.dotdash.disclin.api.builder.MessageBuilder
import pw.dotdash.disclin.api.entity.Entity
import pw.dotdash.disclin.api.entity.Identifiable
import pw.dotdash.disclin.api.entity.Mentionable
import pw.dotdash.disclin.api.entity.channel.direct.DirectTextChannel
import pw.dotdash.disclin.api.entity.message.Embed
import pw.dotdash.disclin.api.entity.message.Message
import pw.dotdash.disclin.api.entity.message.MessageReceiver

interface User : Identifiable, Mentionable, Entity, MessageReceiver {

    val name: String

    val discriminator: String

    val avatar: String?

    val bot: Boolean

    val mfaEnabled: Boolean

    val activity: Activity?

    override val asMention: String
        get() = "<@$id>"

    suspend fun openChannel(): DirectTextChannel

    override suspend fun sendMessage(content: String): Message = openChannel().sendMessage(content)

    override suspend fun sendMessage(embed: Embed): Message = openChannel().sendMessage(embed)

    override suspend fun sendMessage(init: suspend MessageBuilder.() -> Unit): Message = openChannel().sendMessage(init)

    override suspend fun sendTyping() = openChannel().sendTyping()
}