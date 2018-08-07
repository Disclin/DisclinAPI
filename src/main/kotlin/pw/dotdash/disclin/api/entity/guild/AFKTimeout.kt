package pw.dotdash.disclin.api.entity.guild

enum class AFKTimeout(val seconds: Int) {

    SECONDS_60(60),
    SECONDS_300(300),
    SECONDS_900(900),
    SECONDS_1800(1800),
    SECONDS_3600(3600);

    companion object {

        fun valueOf(seconds: Int): AFKTimeout = when (seconds) {
            60 -> SECONDS_60
            300 -> SECONDS_300
            900 -> SECONDS_900
            1800 -> SECONDS_1800
            3600 -> SECONDS_3600
            else -> throw IllegalArgumentException("There is no AFKTimeout associated with seconds '$seconds'")
        }
    }
}