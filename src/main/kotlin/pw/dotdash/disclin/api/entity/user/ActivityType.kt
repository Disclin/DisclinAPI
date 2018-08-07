package pw.dotdash.disclin.api.entity.user

enum class ActivityType {

    DEFAULT,
    STREAMING,
    LISTENING,
    WATCHING;

    companion object {

        operator fun invoke(key: Int): ActivityType = when (key) {
            1 -> STREAMING
            2 -> LISTENING
            3 -> WATCHING
            else -> DEFAULT
        }
    }
}