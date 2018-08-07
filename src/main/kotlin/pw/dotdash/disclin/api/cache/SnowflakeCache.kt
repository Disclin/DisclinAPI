package pw.dotdash.disclin.api.cache

import pw.dotdash.disclin.api.entity.Snowflake

typealias SnowflakeCache<V> = Cache<Snowflake, V>

typealias SnowflakeMapCache<V> = MapCache<Snowflake, V>
typealias SnowflakeFetcher<V> = Fetcher<Snowflake, V>