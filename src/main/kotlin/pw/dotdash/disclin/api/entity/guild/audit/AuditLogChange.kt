package pw.dotdash.disclin.api.entity.guild.audit

interface AuditLogChange {

    val newValue: Any?

    val oldValue: Any?

    val key: String
}