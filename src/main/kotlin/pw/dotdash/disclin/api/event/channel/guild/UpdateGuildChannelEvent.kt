package pw.dotdash.disclin.api.event.channel.guild

import pw.dotdash.disclin.api.entity.channel.guild.GuildCategory
import pw.dotdash.disclin.api.entity.guild.Member
import pw.dotdash.disclin.api.entity.guild.Role
import pw.dotdash.disclin.api.event.channel.UpdateChannelEvent

interface UpdateGuildChannelEvent : UpdateChannelEvent, GuildChannelEvent {

    interface Name : UpdateGuildChannelEvent {

        val oldName: String

        val newName: String
    }

    interface Permissions : UpdateGuildChannelEvent {

        val affectedRoles: Collection<Role>

        val affectedMembers: Collection<Member>
    }

    interface Position : UpdateGuildChannelEvent {

        val oldPosition: Int

        val newPosition: Int
    }

    interface Parent : UpdateGuildChannelEvent {

        val oldParent: GuildCategory

        val newParent: GuildCategory
    }
}