package pw.dotdash.disclin.api.entity.guild.audit

enum class AuditLogChangeKey(val key: String) {

    ID("id"),

    TYPE("type"),

    GUILD_NAME("name"),
    GUILD_ICON("icon_hash"),
    GUILD_SPLASH("splash_hash"),
    GUILD_OWNER("owner_id"),
    GUILD_REGION("region"),
    GUILD_AFK_CHANNEL("afk_channel_id"),
    GUILD_AFK_TIMEOUT("afk_timeout"),
    GUILD_MFA_LEVEL("mfa_level"),
    GUILD_VERIFICATION_LEVEL("verification_level"),
    GUILD_CONTENT_FILTER_LEVEL("explicit_content_filter"),
    GUILD_NOTIFICATION_LEVEL("notification_level"),
    GUILD_VANITY_URL("vanity_url_code"),
    GUILD_ROLE_ADD("\$add"),
    GUILD_ROLE_REMOVE("\$remove"),
    GUILD_PRUNE_DAYS("prune_delete_days"),
    GUILD_WIDGET_ENABLED("widget_enabled"),
    GUILD_WIDGET_CHANNEL("widget_channel_id"),

    CHANNEL_POSITION("position"),
    CHANNEL_TOPIC("topic"),
    CHANNEL_BITRATE("bitrate"),
    CHANNEL_OVERWRITES("permission_overwrites"),
    CHANNEL_NSFW("nsfw"),
    CHANNEL_APPLICATION("application_id"),

    ROLE_PERMISSIONS("permissions"),
    ROLE_COLOR("color"),
    ROLE_HOIST("hoist"),
    ROLE_MENTIONABLE("mentionable"),
    ROLE_ALLOW("allow"),
    ROLE_DENY("deny"),

    INVITE_CODE("code"),
    INVITE_CHANNEL("channel_id"),
    INVITE_INVITER("inviter_id"),
    INVITE_MAX_USES("max_uses"),
    INVITE_USES("uses"),
    INVITE_MAX_AGE("max_age"),
    INVITE_TEMPORARY("temporary"),

    USER_DEAF("deaf"),
    USER_MUTE("mute"),
    USER_NICK("nick"),
    USER_AVATAR("avatar_hash"),
}