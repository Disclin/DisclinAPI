package pw.dotdash.disclin.api.entity.channel

import pw.dotdash.disclin.api.editor.GuildVoiceChannelEditor

interface GuildVoiceChannel : GuildChannel {

    val bitrate: Int

    val userLimit: Int

    suspend fun edit(fn: GuildVoiceChannelEditor.() -> Unit)
}