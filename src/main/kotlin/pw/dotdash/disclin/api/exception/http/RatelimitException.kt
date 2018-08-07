package pw.dotdash.disclin.api.exception.http

import pw.dotdash.disclin.api.exception.DiscordException

class RatelimitException : DiscordException("The ratelimit has been exceeded.") {
}