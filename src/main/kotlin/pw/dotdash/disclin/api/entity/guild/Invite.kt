package pw.dotdash.disclin.api.entity.guild

import pw.dotdash.disclin.api.entity.Entity
import pw.dotdash.disclin.api.entity.Identifiable
import pw.dotdash.disclin.api.entity.channel.ChannelType
import pw.dotdash.disclin.api.entity.user.User
import java.time.Instant

interface Invite : Entity {

    val code: String

    val guild: Guild

    val channel: Channel

    val approxOnlineMembers: Int?

    val approxTotalMembers: Int?

    val metadata: Metadata?

    interface Guild : Identifiable {

        val name: String

        val icon: String?

        val splash: String?
    }

    interface Channel : Identifiable {

        val name: String

        val type: ChannelType
    }

    interface Metadata {

        val inviter: User

        val uses: Int

        val maxUses: Int

        val maxAge: Int

        val isTemporary: Boolean

        val createdAt: Instant

        val isRevoked: Boolean
    }

    suspend fun delete(): Unit = disclin.deleteInvite(this.code)
}