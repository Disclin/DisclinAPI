package pw.dotdash.disclin.api.editor

import pw.dotdash.disclin.api.entity.channel.guild.Overwrite

interface GuildChannelEditor {

    var name: String

    var position: Int

    var overwrites: List<Overwrite>
}