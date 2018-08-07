package pw.dotdash.disclin.api.entity.guild

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

    suspend fun edit(name: String = this.name,
                     color: Int = this.color,
                     hoisted: Boolean = this.isHoisted,
                     position: Int = this.position,
                     permissions: Set<Permission> = this.permissions,
                     managed: Boolean = this.isManaged,
                     mentionable: Boolean = this.isMentionable,
                     everyone: Boolean = this.isEveryone): Role

    suspend fun delete()
}