package pw.dotdash.disclin.api.entity.guild.audit

import pw.dotdash.disclin.api.entity.user.User
import pw.dotdash.disclin.api.entity.webhook.Webhook

interface AuditLog {

    val webhooks: List<Webhook>

    val users: List<User>
}