package pw.dotdash.disclin.api.exception.http

import pw.dotdash.disclin.api.exception.DiscordException

class BadRequestException : DiscordException("400 - Bad Request")