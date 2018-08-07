package pw.dotdash.disclin.api.entity.guild.audit

import pw.dotdash.disclin.api.entity.Identifiable
import pw.dotdash.disclin.api.entity.Snowflake

interface AuditLogEntry : Identifiable {

    val targetId: String?

    val changes: List<AuditLogChange>

    val userId: Snowflake

    val type: AuditLogEntryType

    val reason: String?

    fun getChangeByKey(key: AuditLogChangeKey): AuditLogChange
}