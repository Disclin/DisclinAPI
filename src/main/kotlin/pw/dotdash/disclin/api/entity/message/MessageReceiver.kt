package pw.dotdash.disclin.api.entity.message

import pw.dotdash.disclin.api.builder.MessageBuilder

interface MessageReceiver {

    suspend fun sendMessage(content: String): Message

    suspend fun sendMessage(embed: Embed): Message

    suspend fun sendMessage(init: suspend MessageBuilder.() -> Unit): Message

    suspend fun sendTyping()
}