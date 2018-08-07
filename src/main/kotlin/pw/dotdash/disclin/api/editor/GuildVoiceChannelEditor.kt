package pw.dotdash.disclin.api.editor

import pw.dotdash.disclin.api.entity.channel.GuildCategory

interface GuildVoiceChannelEditor : GuildChannelEditor {

    var bitrate: Int

    var userLimit: Int

    var parent: GuildCategory?
}