package pw.dotdash.disclin.api.entity.webhook

import pw.dotdash.disclin.api.entity.Entity
import pw.dotdash.disclin.api.entity.Identifiable
import pw.dotdash.disclin.api.entity.channel.TextChannel
import pw.dotdash.disclin.api.entity.guild.Guild
import pw.dotdash.disclin.api.entity.user.User

interface Webhook : Identifiable, Entity {

    val guild: Guild?

    val channel: TextChannel

    val user: User?

    val name: String?

    val avatar: String?

    val token: String

    suspend fun edit(name: String? = this.name,
                     avatar: String? = this.avatar,
                     channel: TextChannel = this.channel): Webhook

    suspend fun delete(reason: String? = null): Unit = disclin.deleteWebhook(this.id)
}