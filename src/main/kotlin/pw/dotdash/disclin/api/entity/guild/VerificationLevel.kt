package pw.dotdash.disclin.api.entity.guild

enum class VerificationLevel(val key: Int) {

    /**
     * Unrestricted.
     */
    NONE(0),

    /**
     * Must have verified email on account.
     */
    LOW(1),

    /**
     * Must be registered on Discord for longer than 5 minutes.
     */
    MEDIUM(2),

    /**
     * Must be a member of the server for longer than 10 minutes.
     */
    HIGH(3),

    /**
     * Must have a verified phone number.
     */
    VERY_HIGH(4);

    companion object {

        fun valueOf(key: Int): VerificationLevel = when (key) {
            0 -> NONE
            1 -> LOW
            2 -> MEDIUM
            3 -> HIGH
            4 -> VERY_HIGH
            else -> throw IllegalArgumentException("There is no VerificationLevel associated with key '$key'")
        }
    }
}