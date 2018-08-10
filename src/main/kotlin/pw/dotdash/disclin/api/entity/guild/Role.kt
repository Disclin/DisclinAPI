package pw.dotdash.disclin.api.entity.guild

import pw.dotdash.disclin.api.editor.RoleEditor
import pw.dotdash.disclin.api.entity.Mentionable

interface Role : Subject, Mentionable {

    val name: String

    val color: Int

    val isHoisted: Boolean

    val position: Int

    val permissions: Set<Permission>

    val rawPermissions: Long

    val isManaged: Boolean

    val isMentionable: Boolean

    val isEveryone: Boolean

    override val asMention: String
        get() = "<@&$id>"

    suspend fun edit(init: suspend RoleEditor.() -> Unit): Role

    suspend fun delete()
}