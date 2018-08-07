package pw.dotdash.disclin.api.entity.message

import pw.dotdash.disclin.api.editor.EmojiEditor
import pw.dotdash.disclin.api.entity.Snowflake
import pw.dotdash.disclin.api.entity.guild.Role
import pw.dotdash.disclin.api.entity.user.User

interface Emoji {

    val id: Snowflake?

    val name: String

    val roles: List<Role>

    val user: User?

    val requiresColons: Boolean

    val isManaged: Boolean

    val isAnimated: Boolean

    suspend fun edit(fn: suspend EmojiEditor.() -> Unit)

    suspend fun delete()
}