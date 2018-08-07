package pw.dotdash.disclin.api.entity.channel

import pw.dotdash.disclin.api.builder.MessageBuilder
import pw.dotdash.disclin.api.entity.Snowflake
import pw.dotdash.disclin.api.entity.message.Embed
import pw.dotdash.disclin.api.entity.message.Message
import pw.dotdash.disclin.api.entity.message.MessageReceiver

interface TextChannel : Channel, MessageReceiver {

    val lastMessageId: Snowflake?

    suspend fun getMessage(id: String): Message

    suspend fun listMessages(around: Snowflake? = null,
                             before: Snowflake? = null,
                             after: Snowflake? = null,
                             limit: Int = 50): List<Message>

    suspend fun listPinnedMessages(): List<Message>

    override suspend fun sendMessage(content: String): Message

    override suspend fun sendMessage(embed: Embed): Message

    override suspend fun sendMessage(init: suspend MessageBuilder.() -> Unit): Message

    override suspend fun sendTyping()
}