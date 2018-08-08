package pw.dotdash.disclin.api.editor

import pw.dotdash.disclin.api.entity.channel.guild.GuildCategory

interface GuildTextChannelEditor : GuildChannelEditor {

    var topic: String?

    var nsfw: Boolean

    var parent: GuildCategory?
}