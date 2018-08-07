package pw.dotdash.disclin.api.entity.channel.guild

import pw.dotdash.disclin.api.builder.InviteBuilder
import pw.dotdash.disclin.api.entity.channel.Channel
import pw.dotdash.disclin.api.entity.guild.Guild
import pw.dotdash.disclin.api.entity.guild.Invite

interface GuildChannel : Channel {

    val guild: Guild

    val position: Int

    val overwrites: List<Overwrite>

    val isNsfw: Boolean

    val parent: GuildCategory?

    suspend fun delete()

    suspend fun listInvites(): List<Invite>

    suspend fun createInvite(init: suspend InviteBuilder.() -> Unit): Invite
}