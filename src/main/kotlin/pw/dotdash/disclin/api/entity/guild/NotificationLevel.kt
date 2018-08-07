package pw.dotdash.disclin.api.entity.guild

enum class NotificationLevel(val key: Int) {

    ALL_MESSAGES(0),

    ONLY_MENTIONS(1);

    companion object {

        fun valueOf(key: Int): NotificationLevel = when (key) {
            0 -> ALL_MESSAGES
            1 -> ONLY_MENTIONS
            else -> throw IllegalArgumentException("There is no NotificationLevel associated with key '$key'")
        }
    }
}