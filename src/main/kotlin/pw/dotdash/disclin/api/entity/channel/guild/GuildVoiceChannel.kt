package pw.dotdash.disclin.api.entity.channel.guild

import pw.dotdash.disclin.api.editor.GuildVoiceChannelEditor
import pw.dotdash.disclin.api.entity.channel.VoiceChannel

interface GuildVoiceChannel : GuildChannel, VoiceChannel {

    val bitrate: Int

    val userLimit: Int

    suspend fun edit(fn: GuildVoiceChannelEditor.() -> Unit)
}