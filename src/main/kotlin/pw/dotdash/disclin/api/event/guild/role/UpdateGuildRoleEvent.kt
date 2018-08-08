package pw.dotdash.disclin.api.event.guild.role

import pw.dotdash.disclin.api.entity.guild.Permission

interface UpdateGuildRoleEvent : GuildRoleEvent {

    interface Color : UpdateGuildRoleEvent {

        val oldColor: Int?

        val newColor: Int?
    }

    interface Hoisted : UpdateGuildRoleEvent {

        val oldHoisted: Boolean

        val newHoisted: Boolean
    }

    interface Mentionable : UpdateGuildRoleEvent {

        val oldMentionable: Boolean

        val newMentionable: Boolean
    }

    interface Name : UpdateGuildRoleEvent {

        val oldName: String

        val newName: String
    }

    interface Permissions : UpdateGuildRoleEvent {

        val oldPermissions: Set<Permission>

        val newPermissions: Set<Permission>
    }

    interface Position : UpdateGuildRoleEvent {

        val oldPosition: Int

        val newPosition: Int
    }
}