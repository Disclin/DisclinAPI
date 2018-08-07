package pw.dotdash.disclin.api.entity.user

data class Activity(val name: String, val url: String? = null, val type: ActivityType = ActivityType.DEFAULT) {

    companion object {

        fun playing(name: String): Activity = Activity(name)

        fun streaming(name: String, url: String): Activity = Activity(name, url, ActivityType.STREAMING)

        fun listening(name: String): Activity = Activity(name, type = ActivityType.LISTENING)

        fun watching(name: String): Activity = Activity(name, type = ActivityType.WATCHING)
    }
}