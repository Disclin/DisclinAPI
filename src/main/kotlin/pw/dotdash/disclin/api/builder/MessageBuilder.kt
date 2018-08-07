package pw.dotdash.disclin.api.builder

import pw.dotdash.disclin.api.entity.Mentionable
import pw.dotdash.disclin.api.entity.Snowflake
import pw.dotdash.disclin.api.entity.message.Embed
import java.io.File
import java.nio.file.Path

interface MessageBuilder {

    var content: String

    var nonce: Snowflake?

    var tts: Boolean

    var embed: Embed

    suspend fun embed(init: suspend EmbedBuilder.() -> Unit): Embed

    operator fun CharSequence.unaryPlus()

    operator fun Mentionable.unaryPlus()

    operator fun File.unaryPlus()

    operator fun Path.unaryPlus()
}