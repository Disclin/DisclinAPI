package pw.dotdash.disclin.api.cache

class MapCache<K : Any, V : Any> : Cache<K, V> {

    private val map = mutableMapOf<K, V>()

    override suspend fun get(key: K): V? = map[key]

    override suspend fun getValues(): Collection<V> = map.values

    override suspend fun set(key: K, value: V) {
        map[key] = value
    }

    override suspend fun invalidate(key: K) {
        map.remove(key)
    }

    override suspend fun invalidateAll(vararg keys: K) {
        for (key in keys) map.remove(key)
    }

    override suspend fun invalidateAll() = map.clear()
}