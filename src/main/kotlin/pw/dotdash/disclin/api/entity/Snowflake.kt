package pw.dotdash.disclin.api.entity

import java.time.Instant

typealias Snowflake = String

val Snowflake.createdAt: Instant get() = Instant.ofEpochMilli((this.toLong() ushr 22) + 1420070400000)