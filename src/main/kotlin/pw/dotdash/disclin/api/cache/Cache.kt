package pw.dotdash.disclin.api.cache

interface Cache<K : Any, V : Any> {

    suspend fun get(key: K): V?

    suspend fun getValues(): Collection<V>

    suspend fun set(key: K, value: V)

    suspend fun invalidate(key: K)

    suspend fun invalidateAll(vararg keys: K)

    suspend fun invalidateAll()

    infix fun compose(other: Cache<K, V>): ComposedCache<K, V> = ComposedCache(this, other)

    operator fun plus(other: Cache<K, V>): ComposedCache<K, V> = compose(other)
}