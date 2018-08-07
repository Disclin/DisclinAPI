package pw.dotdash.disclin.api.entity.message

enum class MessageActivityType(val key: Int) {

    JOIN(1),

    SPECTATE(2),

    LISTEN(3),

    JOIN_REQUEST(5);

    companion object {

        operator fun invoke(key: Int) = when (key) {
            1 -> JOIN
            2 -> SPECTATE
            3 -> LISTEN
            5 -> JOIN_REQUEST
            else -> throw IllegalArgumentException("There is no MessageActivityType associated with key '$key'")
        }
    }
}