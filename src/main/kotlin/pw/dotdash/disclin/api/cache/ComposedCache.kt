package pw.dotdash.disclin.api.cache

class ComposedCache<K : Any, V : Any>(private val first: Cache<K, V>, private val second: Cache<K, V>) : Cache<K, V> {

    override suspend fun get(key: K): V? = first.get(key) ?: second.get(key)?.apply { first.set(key, this) }

    override suspend fun getValues(): List<V> = (first.getValues() + second.getValues()).distinct()

    override suspend fun set(key: K, value: V) {
        first.set(key, value)
        second.set(key, value)
    }

    override suspend fun invalidate(key: K) {
        first.invalidate(key)
        second.invalidate(key)
    }

    override suspend fun invalidateAll(vararg keys: K) {
        first.invalidateAll(*keys)
        second.invalidateAll(*keys)
    }

    override suspend fun invalidateAll() {
        first.invalidateAll()
        second.invalidateAll()
    }
}