package pw.dotdash.disclin.api.entity.user

import pw.dotdash.disclin.api.entity.Snowflake
import pw.dotdash.disclin.api.entity.channel.DirectTextChannel
import pw.dotdash.disclin.api.entity.guild.Guild

interface SelfUser : User {

    val verified: Boolean

    suspend fun setName(name: String)

    suspend fun setAvatar(avatar: String?)

    suspend fun listGuilds(): List<Guild>

    suspend fun leaveGuild(guild: Guild) = leaveGuild(guild.id)

    suspend fun leaveGuild(guildId: Snowflake)

    suspend fun listDirectChannels(): List<DirectTextChannel>

    suspend fun openDirectChannel(user: User): DirectTextChannel = openDirectChannel(user.id)

    suspend fun openDirectChannel(userId: Snowflake): DirectTextChannel
}