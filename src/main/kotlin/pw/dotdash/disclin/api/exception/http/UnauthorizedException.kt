package pw.dotdash.disclin.api.exception.http

import pw.dotdash.disclin.api.exception.DiscordException

class UnauthorizedException : DiscordException("403 - Unauthorized")