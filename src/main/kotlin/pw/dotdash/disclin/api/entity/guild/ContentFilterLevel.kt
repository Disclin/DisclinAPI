package pw.dotdash.disclin.api.entity.guild

enum class ContentFilterLevel(val key: Int) {

    DISABLED(0),

    WITHOUT_ROLES(1),

    ALL_MEMBERS(2);

    companion object {

        fun valueOf(key: Int): ContentFilterLevel = when (key) {
            0 -> DISABLED
            1 -> WITHOUT_ROLES
            2 -> ALL_MEMBERS
            else -> throw IllegalArgumentException("There is no ContentFilterLevel associated with key '$key'")
        }
    }
}