@file:Suppress("NOTHING_TO_INLINE")

package pw.dotdash.disclin.api.util

import pw.dotdash.disclin.api.entity.message.Message

inline operator fun Message.contains(other: String): Boolean = this.content.contains(other)

inline fun Message.startsWith(prefix: String): Boolean = this.content.startsWith(prefix)
inline fun Message.endsWith(suffix: String): Boolean = this.content.endsWith(suffix)