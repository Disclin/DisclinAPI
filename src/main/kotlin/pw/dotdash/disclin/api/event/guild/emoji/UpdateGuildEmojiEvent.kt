package pw.dotdash.disclin.api.event.guild.emoji

import pw.dotdash.disclin.api.entity.guild.Role

interface UpdateGuildEmojiEvent : GuildEmojiEvent {

    interface Name : UpdateGuildEmojiEvent {

        val oldName: String

        val newName: String
    }

    interface Roles : UpdateGuildEmojiEvent {

        val oldRoles: Collection<Role>

        val newRoles: Collection<Role>
    }
}