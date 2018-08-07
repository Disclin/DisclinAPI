package pw.dotdash.disclin.api

import pw.dotdash.disclin.api.builder.GuildBuilder
import pw.dotdash.disclin.api.cache.SnowflakeCache
import pw.dotdash.disclin.api.entity.Snowflake
import pw.dotdash.disclin.api.entity.channel.DirectTextChannel
import pw.dotdash.disclin.api.entity.channel.GuildCategory
import pw.dotdash.disclin.api.entity.channel.GuildTextChannel
import pw.dotdash.disclin.api.entity.channel.GuildVoiceChannel
import pw.dotdash.disclin.api.entity.guild.Guild
import pw.dotdash.disclin.api.entity.guild.Invite
import pw.dotdash.disclin.api.entity.guild.Role
import pw.dotdash.disclin.api.entity.message.Emoji
import pw.dotdash.disclin.api.entity.user.SelfUser
import pw.dotdash.disclin.api.entity.user.User
import pw.dotdash.disclin.api.entity.webhook.Webhook
import pw.dotdash.disclin.api.event.EventDispatcher

interface Disclin {

    companion object

    val token: String

    val eventDispatcher: EventDispatcher

    val userCache: SnowflakeCache<User>

    val guildCache: SnowflakeCache<Guild>

    val categoryCache: SnowflakeCache<GuildCategory>

    val guildTextChannelCache: SnowflakeCache<GuildTextChannel>

    val guildVoiceChannelCache: SnowflakeCache<GuildVoiceChannel>

    val directTextChannelCache: SnowflakeCache<DirectTextChannel>

    suspend fun connect()

    suspend fun disconnect()

    /**
     * Lists all [users][User] known to this bot.
     */
    suspend fun listUsers(): List<User> = userCache.getValues().toList()

    /**
     * Lists all [users][User] known to this bot, filtering by [filter].
     */
    suspend fun listUsers(filter: (User) -> Boolean): List<User> = listUsers().filter(filter)

    /**
     * Gets a [User] by its [id].
     */
    suspend fun getUser(id: Snowflake): User? = userCache.get(id)

    suspend fun getSelfUser(): SelfUser

    /**
     * Creates a new [Guild].
     */
    suspend fun createGuild(init: GuildBuilder.() -> Unit): Guild

    /**
     * Lists all [guilds][Guild] known to this bot.
     */
    suspend fun listGuilds(): List<Guild> = guildCache.getValues().toList()

    /**
     * Lists all [guilds][Guild] known to this bot, filtering by [filter].
     */
    suspend fun listGuilds(filter: (Guild) -> Boolean): List<Guild> = listGuilds().filter(filter)

    /**
     * Lists all [mutual guilds][Guild] shared by this bot and the provided [users].
     */
    suspend fun listMutualGuilds(vararg users: Array<User>): List<Guild>

    /**
     * Gets a [Guild] by its [id].
     */
    suspend fun getGuild(id: Snowflake): Guild? = guildCache.get(id)

    /**
     * Lists all [roles][Role] known to this bot.
     */
    suspend fun listRoles(): List<Role>

    /**
     * Lists all [roles][Role] known to this bot, filtering by [filter].
     */
    suspend fun listRoles(filter: (Role) -> Boolean): List<Role> = listRoles().filter(filter)

    /**
     * Gets a [Role] by its [id].
     */
    suspend fun getRole(id: Snowflake): Role?

    /**
     * Lists all [categories][GuildCategory] known to this bot.
     */
    suspend fun listCategories(): List<GuildCategory> = categoryCache.getValues().toList()

    /**
     * Lists all [categories][GuildCategory] known to this bot, filtering by [filter].
     */
    suspend fun listCategories(filter: (GuildCategory) -> Boolean): List<GuildCategory> = listCategories().filter(filter)

    /**
     * Gets a [GuildCategory] by its [id].
     */
    suspend fun getCategory(id: Snowflake): GuildCategory? = categoryCache.get(id)

    /**
     * Lists all [guild text channels][GuildTextChannel] known to this bot.
     */
    suspend fun listGuildTextChannels(): List<GuildTextChannel> = guildTextChannelCache.getValues().toList()

    /**
     * Lists all [guild text channels][GuildTextChannel] known to this bot, filtering by [filter].
     */
    suspend fun listGuildTextChannels(filter: (GuildTextChannel) -> Boolean): List<GuildTextChannel> = listGuildTextChannels().filter(filter)

    /**
     * Gets a [GuildTextChannel] by its [id].
     */
    suspend fun getGuildTextChannel(id: Snowflake): GuildTextChannel? = guildTextChannelCache.get(id)

    /**
     * Lists all [guild voice channels][GuildVoiceChannel] known to this bot.
     */
    suspend fun listGuildVoiceChannels(): List<GuildVoiceChannel> = guildVoiceChannelCache.getValues().toList()

    /**
     * Lists all [guild voice channels][GuildVoiceChannel] known to this bot, filtering by [filter].
     */
    suspend fun listGuildVoiceChannels(filter: (GuildVoiceChannel) -> Boolean): List<GuildVoiceChannel> = listGuildVoiceChannels().filter(filter)

    /**
     * Gets a [GuildVoiceChannel] by its [id].
     */
    suspend fun getGuildVoiceChannel(id: Snowflake): GuildVoiceChannel? = guildVoiceChannelCache.get(id)

    /**
     * Lists all [direct text channels][DirectTextChannel] known to this bot.
     */
    suspend fun listDirectTextChannels(): List<DirectTextChannel> = directTextChannelCache.getValues().toList()

    /**
     * Lists all [direct text channels][DirectTextChannel] known to this bot, filtering by [filter].
     */
    suspend fun listDirectTextChannels(filter: (DirectTextChannel) -> Boolean): List<DirectTextChannel> = listDirectTextChannels().filter(filter)

    /**
     * Gets a [DirectTextChannel] by its [id].
     */
    suspend fun getDirectTextChannel(id: Snowflake): DirectTextChannel? = directTextChannelCache.get(id)

    /**
     * Lists all [emojis][Emoji] known to this bot.
     */
    suspend fun listEmojis(): List<Emoji>

    /**
     * Lists all [emojis][Emoji] known to this bot, filtering by [filter].
     */
    suspend fun listEmojis(filter: (Emoji) -> Boolean): List<Emoji> = listEmojis().filter(filter)

    /**
     * Gets an [Emoji] by its [id].
     */
    suspend fun getEmoji(id: Snowflake): Emoji?

    /**
     * Gets an [Invite] by its [code].
     */
    suspend fun getInvite(code: String): Invite

    /**
     * Deletes an [Invite] by its [code].
     */
    suspend fun deleteInvite(code: String)

    /**
     * Gets a [Webhook] by its [id].
     */
    suspend fun getWebhook(id: Snowflake): Webhook

    /**
     * Deletes a [Webhook] by its [id].
     */
    suspend fun deleteWebhook(id: Snowflake)
}