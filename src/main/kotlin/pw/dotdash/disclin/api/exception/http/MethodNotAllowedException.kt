package pw.dotdash.disclin.api.exception.http

import pw.dotdash.disclin.api.exception.DiscordException

class MethodNotAllowedException : DiscordException("405 - Method Not Allowed")