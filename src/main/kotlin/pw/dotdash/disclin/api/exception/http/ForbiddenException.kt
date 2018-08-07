package pw.dotdash.disclin.api.exception.http

import pw.dotdash.disclin.api.exception.DiscordException

class ForbiddenException : DiscordException("403 - Forbidden")