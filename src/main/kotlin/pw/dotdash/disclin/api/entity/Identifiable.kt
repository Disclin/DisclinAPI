package pw.dotdash.disclin.api.entity

import java.time.Instant

interface Identifiable {

    val id: Snowflake

    val idLong: Long get() = id.toLong()

    val createdAt: Instant get() = id.createdAt
}