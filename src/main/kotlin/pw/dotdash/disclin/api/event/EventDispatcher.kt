package pw.dotdash.disclin.api.event

import kotlin.reflect.KClass

interface EventDispatcher {

    fun <T : Event> post(event: T)

    fun <T : Event> on(type: KClass<T>, handler: suspend (T) -> Unit)
}

inline fun <reified T : Event> EventDispatcher.on(noinline handler: suspend (T) -> Unit) = on(T::class, handler)