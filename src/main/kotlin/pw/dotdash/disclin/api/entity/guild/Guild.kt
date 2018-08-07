package pw.dotdash.disclin.api.entity.guild

import pw.dotdash.disclin.api.Disclin
import pw.dotdash.disclin.api.builder.*
import pw.dotdash.disclin.api.editor.GuildEditor
import pw.dotdash.disclin.api.entity.Snowflake
import pw.dotdash.disclin.api.entity.channel.GuildCategory
import pw.dotdash.disclin.api.entity.channel.GuildTextChannel
import pw.dotdash.disclin.api.entity.channel.GuildVoiceChannel
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

    suspend fun listMembers(): List<Member>

    suspend fun listMembersWithName(name: String, ignoreCase: Boolean = false): List<Member>

    suspend fun getMember(user: User): Member?

    suspend fun getMemberById(id: Snowflake): Member?

    suspend fun isMember(user: User): Boolean

    suspend fun createCategory(init: GuildCategoryBuilder.() -> Unit): GuildCategory

    suspend fun listCategories(): List<GuildCategory>

    suspend fun listCategoriesWithName(name: String, ignoreCase: Boolean = false): List<GuildCategory>

    suspend fun getCategoryById(id: Snowflake): GuildCategory?

    suspend fun createTextChannel(init: GuildTextChannelBuilder.() -> Unit): GuildTextChannel

    suspend fun listTextChannels(): List<GuildTextChannel>

    suspend fun listTextChannelsWithName(name: String, ignoreCase: Boolean = false): List<GuildTextChannel>

    suspend fun getTextChannelById(id: Snowflake): GuildTextChannel?

    suspend fun createVoiceChannel(init: GuildVoiceChannelBuilder.() -> Unit): GuildVoiceChannel

    suspend fun listVoiceChannels(): List<GuildVoiceChannel>

    suspend fun listVoiceChannelsWithName(name: String, ignoreCase: Boolean = false): List<GuildVoiceChannel>

    suspend fun getVoiceChannelById(id: Snowflake): GuildVoiceChannel?

    suspend fun createRole(init: RoleBuilder.() -> Unit): Role

    suspend fun listRoles(): List<Role>

    suspend fun listRolesWithName(name: String, ignoreCase: Boolean = false): List<Role>

    suspend fun getRoleById(id: Snowflake): Role?

    suspend fun createEmoji(init: suspend EmojiBuilder.() -> Unit): Emoji

    suspend fun listEmojis(): List<Emoji>

    suspend fun listEmojisWithName(name: String, ignoreCase: Boolean = false): List<Emoji>

    suspend fun getEmojiById(id: Snowflake): Emoji?

    suspend fun listBans(): List<Ban>

    suspend fun listInvites(): List<Invite>

    suspend fun listWebhooks(): List<Webhook>

    suspend fun getEveryoneRole(): Role = getRoleById(this.id)!!

    suspend fun edit(fn: GuildEditor.() -> Unit)

    suspend fun delete(mfaCode: String? = null)

    suspend fun leave()

    // -------------------- Operators -------------------- //

    operator fun contains(user: User): Boolean
}

suspend operator fun Guild.Companion.invoke(disclin: Disclin, name: String): Guild = TODO()