package pw.dotdash.disclin.api.editor

import pw.dotdash.disclin.api.entity.guild.Permission

interface RoleEditor {

    var name: String

    var color: Int

    var hoisted: Boolean

    var position: Int

    var permissions: MutableSet<Permission>

    var isManaged: Boolean

    var isMentionable: Boolean

    operator fun Permission.unaryPlus() {
        permissions.add(this)
    }

    operator fun Permission.unaryMinus() {
        permissions.remove(this)
    }
}