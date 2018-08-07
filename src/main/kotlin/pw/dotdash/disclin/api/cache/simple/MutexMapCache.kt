package pw.dotdash.disclin.api.cache.simple

import kotlinx.coroutines.experimental.sync.Mutex
import kotlinx.coroutines.experimental.sync.withLock
import pw.dotdash.disclin.api.cache.Cache

class MutexMapCache<K : Any, V : Any> : Cache<K, V> {

    private val map = mutableMapOf<K, V>()

    private val mutex = Mutex()

    override suspend fun get(key: K): V? = map[key]

    override suspend fun getValues(): Collection<V> = map.values

    override suspend fun set(key: K, value: V) {
        mutex.withLock {
            map[key] = value
        }
    }

    override suspend fun invalidate(key: K) {
        mutex.withLock {
            map.remove(key)
        }
    }

    override suspend fun invalidateAll(vararg keys: K) {
        mutex.withLock {
            for (key in keys) map.remove(key)
        }
    }

    override suspend fun invalidateAll() {
        mutex.withLock {
            map.clear()
        }
    }
}