package pw.dotdash.disclin.api.builder

import pw.dotdash.disclin.api.entity.guild.Permission

interface RoleBuilder {

    var reason: String?

    var name: String

    var color: Int

    var isHoisted: Boolean

    var isMentionable: Int

    var permissions: Set<Permission>
}