package pw.dotdash.disclin.api.entity.channel

import pw.dotdash.disclin.api.editor.GuildTextChannelEditor
import pw.dotdash.disclin.api.entity.Mentionable
import pw.dotdash.disclin.api.entity.webhook.Webhook

interface GuildTextChannel : Mentionable, GuildChannel, TextChannel {

    val topic: String?

    override val asMention: String
        get() = "<#$id>"

    suspend fun createWebhook(name: String, avatar: String? = null): Webhook

    suspend fun listWebhooks(): List<Webhook>

    suspend fun edit(fn: suspend GuildTextChannelEditor.() -> Unit)
}