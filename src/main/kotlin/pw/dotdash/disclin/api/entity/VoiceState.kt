package pw.dotdash.disclin.api.entity

import pw.dotdash.disclin.api.entity.channel.Channel
import pw.dotdash.disclin.api.entity.guild.Guild
import pw.dotdash.disclin.api.entity.user.User

interface VoiceState {

    /**
     * The [Guild] this voice state is for.
     */
    val guild: Guild?

    val channel: Channel

    val user: User

    val sessionId: String

    val isDeafened: Boolean

    val isMuted: Boolean

    val isSelfDeafened: Boolean

    val isSelfMuted: Boolean

    val isSuppressed: Boolean
}