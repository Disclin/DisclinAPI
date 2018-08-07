package pw.dotdash.disclin.api.entity.user

enum class UserStatus(val key: String) {

    ONLINE("online"),

    IDLE("idle"),

    DO_NOT_DISTURB("dnd"),

    INVISIBLE("invisible"),

    OFFLINE("offline");
}