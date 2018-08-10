package pw.dotdash.disclin.api

import pw.dotdash.disclin.api.builder.GuildBuilder
import pw.dotdash.disclin.api.cache.SnowflakeCache
import pw.dotdash.disclin.api.entity.Snowflake
import pw.dotdash.disclin.api.entity.channel.direct.DirectTextChannel
import pw.dotdash.disclin.api.entity.channel.guild.GuildCategory
import pw.dotdash.disclin.api.entity.channel.guild.GuildTextChannel
import pw.dotdash.disclin.api.entity.channel.guild.GuildVoiceChannel
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
    suspend fun listUsers(): Collection<User> = userCache.getValues().toList()

    /**
     * Lists all [users][User] known to this bot, filtering by [selecting].
     */
    suspend fun listUsers(selecting: (User) -> Boolean): Collection<User> = listUsers().filter(selecting)

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
    suspend fun listGuilds(): Collection<Guild> = guildCache.getValues().toList()

    /**
     * Lists all [guilds][Guild] known to this bot, filtering by [selecting].
     */
    suspend fun listGuilds(selecting: (Guild) -> Boolean): Collection<Guild> = listGuilds().filter(selecting)

    /**
     * Lists all [mutual guilds][Guild] shared by this bot and the provided [users].
     */
    suspend fun listMutualGuilds(vararg users: Array<User>): Collection<Guild>

    /**
     * Gets a [Guild] by its [id].
     */
    suspend fun getGuild(id: Snowflake): Guild? = guildCache.get(id)

    /**
     * Lists all [roles][Role] known to this bot.
     */
    suspend fun listRoles(): Collection<Role>

    /**
     * Lists all [roles][Role] known to this bot, filtering by [selecting].
     */
    suspend fun listRoles(selecting: (Role) -> Boolean): Collection<Role> = listRoles().filter(selecting)

    /**
     * Gets a [Role] by its [id].
     */
    suspend fun getRole(id: Snowflake): Role?

    /**
     * Lists all [categories][GuildCategory] known to this bot.
     */
    suspend fun listCategories(): Collection<GuildCategory> = categoryCache.getValues().toList()

    /**
     * Lists all [categories][GuildCategory] known to this bot, filtering by [selecting].
     */
    suspend fun listCategories(selecting: (GuildCategory) -> Boolean): Collection<GuildCategory> = listCategories().filter(selecting)

    /**
     * Gets a [GuildCategory] by its [id].
     */
    suspend fun getCategory(id: Snowflake): GuildCategory? = categoryCache.get(id)

    /**
     * Lists all [guild text channels][GuildTextChannel] known to this bot.
     */
    suspend fun listGuildTextChannels(): Collection<GuildTextChannel> = guildTextChannelCache.getValues().toList()

    /**
     * Lists all [guild text channels][GuildTextChannel] known to this bot, filtering by [selecting].
     */
    suspend fun listGuildTextChannels(selecting: (GuildTextChannel) -> Boolean): Collection<GuildTextChannel> = listGuildTextChannels().filter(selecting)

    /**
     * Gets a [GuildTextChannel] by its [id].
     */
    suspend fun getGuildTextChannel(id: Snowflake): GuildTextChannel? = guildTextChannelCache.get(id)

    /**
     * Lists all [guild voice channels][GuildVoiceChannel] known to this bot.
     */
    suspend fun listGuildVoiceChannels(): Collection<GuildVoiceChannel> = guildVoiceChannelCache.getValues().toList()

    /**
     * Lists all [guild voice channels][GuildVoiceChannel] known to this bot, filtering by [selecting].
     */
    suspend fun listGuildVoiceChannels(selecting: (GuildVoiceChannel) -> Boolean): Collection<GuildVoiceChannel> = listGuildVoiceChannels().filter(selecting)

    /**
     * Gets a [GuildVoiceChannel] by its [id].
     */
    suspend fun getGuildVoiceChannel(id: Snowflake): GuildVoiceChannel? = guildVoiceChannelCache.get(id)

    /**
     * Lists all [direct text channels][DirectTextChannel] known to this bot.
     */
    suspend fun listDirectTextChannels(): Collection<DirectTextChannel> = directTextChannelCache.getValues().toList()

    /**
     * Lists all [direct text channels][DirectTextChannel] known to this bot, filtering by [selecting].
     */
    suspend fun listDirectTextChannels(selecting: (DirectTextChannel) -> Boolean): Collection<DirectTextChannel> = listDirectTextChannels().filter(selecting)

    /**
     * Gets a [DirectTextChannel] by its [id].
     */
    suspend fun getDirectTextChannel(id: Snowflake): DirectTextChannel? = directTextChannelCache.get(id)

    /**
     * Lists all [emojis][Emoji] known to this bot.
     */
    suspend fun listEmojis(): Collection<Emoji>

    /**
     * Lists all [emojis][Emoji] known to this bot, filtering by [selecting].
     */
    suspend fun listEmojis(selecting: (Emoji) -> Boolean): Collection<Emoji> = listEmojis().filter(selecting)

    /**
     * Gets an [Emoji] by its [id].
     */
    suspend fun getEmoji(id: Snowflake): Emoji?

    /**
     * Gets an [Invite] by its [code].
     */
    suspend fun getInvite(code: String): Invite?

    /**
     * Deletes an [Invite] by its [code].
     */
    suspend fun deleteInvite(code: String)

    /**
     * Gets a [Webhook] by its [id].
     */
    suspend fun getWebhook(id: Snowflake): Webhook?

    /**
     * Deletes a [Webhook] by its [id].
     */
    suspend fun deleteWebhook(id: Snowflake)
}