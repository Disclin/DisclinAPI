package pw.dotdash.disclin.api.entity.guild

enum class MFALevel(val key: Int) {

    NONE(0),

    ELEVATED(1);

    companion object {

        fun valueOf(key: Int): MFALevel = when (key) {
            0 -> NONE
            1 -> ELEVATED
            else -> throw IllegalArgumentException("There is no MFALevel associated with key '$key'")
        }
    }
}