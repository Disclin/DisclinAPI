@file:Suppress("NOTHING_TO_INLINE")

package pw.dotdash.disclin.api.entity.guild

import pw.dotdash.disclin.api.builder.*
import pw.dotdash.disclin.api.editor.GuildEditor
import pw.dotdash.disclin.api.entity.Snowflake
import pw.dotdash.disclin.api.entity.channel.guild.GuildCategory
import pw.dotdash.disclin.api.entity.channel.guild.GuildChannel
import pw.dotdash.disclin.api.entity.channel.guild.GuildTextChannel
import pw.dotdash.disclin.api.entity.channel.guild.GuildVoiceChannel
import pw.dotdash.disclin.api.entity.message.Emoji
import pw.dotdash.disclin.api.entity.user.User
import pw.dotdash.disclin.api.entity.webhook.Webhook
import java.time.Instant

interface Guild : Guildlike {

    companion object

    val name: String

    val icon: String?

    val splash: String?

    val isOwner: Boolean

    val owner: Member

    val permissions: Set<Permission>

    val region: Region

    val afkChannel: GuildVoiceChannel?

    val afkTimeout: AFKTimeout

    val embedEnabled: Boolean

    val embedChannel: GuildVoiceChannel?

    val verificationLevel: VerificationLevel

    val notificationLevel: NotificationLevel

    val contentFilterLevel: ContentFilterLevel

    val mfaLevel: MFALevel

    val features: Set<String>

    val applicationId: Snowflake

    val widgetEnabled: Boolean

    val widgetChannel: GuildVoiceChannel?

    val systemChannel: GuildTextChannel?

    val joinedAt: Instant?

    val large: Boolean

    override val isAvailable: Boolean
        get() = true

    suspend fun getPruneCount(days: Int): Int

    suspend fun pruneMembers(days: Int, reason: String? = null): Int

    suspend fun listMembers(): Collection<Member>

    suspend fun listMembers(selecting: (Member) -> Boolean): Collection<Member> = listMembers().filter(selecting)

    suspend fun getMember(user: User): Member?

    suspend fun getMember(id: Snowflake): Member?

    suspend fun isMember(user: User): Boolean

    suspend fun createCategory(init: GuildCategoryBuilder.() -> Unit): GuildCategory

    suspend fun listCategories(): Collection<GuildCategory>

    suspend fun listCategories(selecting: (GuildCategory) -> Boolean): Collection<GuildCategory> = listCategories().filter(selecting)

    suspend fun getCategory(id: Snowflake): GuildCategory?

    suspend fun createTextChannel(init: GuildTextChannelBuilder.() -> Unit): GuildTextChannel

    suspend fun listTextChannels(): Collection<GuildTextChannel>

    suspend fun listTextChannels(selecting: (GuildTextChannel) -> Boolean): Collection<GuildTextChannel> = listTextChannels().filter(selecting)

    suspend fun getTextChannel(id: Snowflake): GuildTextChannel?

    suspend fun createVoiceChannel(init: GuildVoiceChannelBuilder.() -> Unit): GuildVoiceChannel

    suspend fun listVoiceChannels(): Collection<GuildVoiceChannel>

    suspend fun listVoiceChannels(selecting: (GuildVoiceChannel) -> Boolean): Collection<GuildVoiceChannel> = listVoiceChannels().filter(selecting)

    suspend fun getVoiceChannel(id: Snowflake): GuildVoiceChannel?

    suspend fun createRole(init: RoleBuilder.() -> Unit): Role

    suspend fun listRoles(): Collection<Role>

    suspend fun listRoles(selecting: (Role) -> Boolean): Collection<Role> = listRoles().filter(selecting)

    suspend fun getEveryoneRole(): Role = getRole(this.id)!!

    suspend fun getRole(id: Snowflake): Role?

    suspend fun createEmoji(init: suspend EmojiBuilder.() -> Unit): Emoji

    suspend fun listEmojis(): Collection<Emoji>

    suspend fun listEmojis(selecting: (Emoji) -> Boolean): Collection<Emoji> = listEmojis().filter(selecting)

    suspend fun getEmoji(id: Snowflake): Emoji?

    suspend fun listBans(): Collection<Ban>

    suspend fun getBan(user: User): Ban?

    suspend fun listInvites(): Collection<Invite>

    suspend fun getInvite(code: String): Invite?

    suspend fun listWebhooks(): Collection<Webhook>

    suspend fun edit(fn: GuildEditor.() -> Unit)

    suspend fun delete(mfaCode: String? = null)

    suspend fun leave()

    // -------------------- Operators -------------------- //

    operator fun contains(user: User): Boolean
}

inline operator fun Guild.contains(channel: GuildChannel): Boolean = channel.guild == this

inline operator fun Guild.contains(role: Role): Boolean = role.guild == this