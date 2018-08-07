package pw.dotdash.disclin.api.entity.channel.guild

import pw.dotdash.disclin.api.editor.GuildCategoryEditor

interface GuildCategory : GuildChannel {

    suspend fun edit(fn: suspend GuildCategoryEditor.() -> Unit)
}