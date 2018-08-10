package pw.dotdash.disclin.api.event.guild.webhook

import pw.dotdash.disclin.api.entity.webhook.Webhook
import pw.dotdash.disclin.api.event.guild.GuildEvent

interface WebhookEvent : GuildEvent {

    val webhook: Webhook
}