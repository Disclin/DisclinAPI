package pw.dotdash.disclin.api.entity.guild

import java.util.*

enum class Permission(val offset: Int, val isGuild: Boolean, val isChannel: Boolean) {

    CREATE_INSTANT_INVITE(0, true, true),
    KICK_MEMBERS(1, true, false),
    BAN_MEMBERS(2, true, false),
    ADMINISTRATOR(3, true, false),
    MANAGE_CHANNELS(4, true, true),
    MANAGE_GUILD(5, true, false),
    ADD_REACTIONS(6, true, true),
    VIEW_AUDIT_LOG(7, true, false),
    VIEW_CHANNEL(10, true, true),
    SEND_MESSAGES(11, true, true),
    SEND_TTS_MESSAGES(12, true, true),
    MANAGE_MESSAGES(13, true, true),
    EMBED_LINKS(14, true, true),
    ATTACH_FILES(15, true, true),
    READ_MESSAGE_HISTORY(16, true, true),
    MENTION_EVERYONE(17, true, true),
    USE_EXTERNAL_EMOJIS(18, true, true),
    CONNECT(20, true, true),
    SPEAK(21, true, true),
    MUTE_MEMBERS(22, true, true),
    DEAFEN_MEMBERS(23, true, true),
    MOVE_MEMBERS(24, true, true),
    USE_VAD(25, true, true),
    CHANGE_NICKNAME(26, true, false),
    MANAGE_NICKNAMES(27, true, false),
    MANAGE_ROLES(28, true, true),
    MANAGE_WEBHOOKS(29, true, true),
    MANAGE_EMOJIS(30, true, false);

    companion object {

        operator fun invoke(offset: Int): Permission? = values().find { it.offset == offset }
    }

    val raw: Long = (1 shl offset).toLong()

    val isText: Boolean = offset in 10..19

    val isVoice: Boolean = offset == 10 || offset in 20..25
}

val Long.permissions: Set<Permission>
    get() {
        val set = EnumSet.noneOf(Permission::class.java)
        if (this == 0L) return set
        Permission.values().filterTo(set) { this and it.raw == it.raw }
        return set
    }

val Set<Permission>.raw: Long get() = this.fold(0L) { value, perm -> value or perm.raw }