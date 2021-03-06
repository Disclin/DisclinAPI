package pw.dotdash.disclin.api.cache

interface Fetcher<K : Any, V : Any> : Cache<K, V> {

    override suspend fun set(key: K, value: V) {}

    override suspend fun invalidate(key: K) {}

    override suspend fun invalidateAll(vararg keys: K) {}

    override suspend fun invalidateAll() {}
}