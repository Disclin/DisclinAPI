package pw.dotdash.disclin.api.builder

import pw.dotdash.disclin.api.entity.guild.Role

interface EmojiBuilder {

    var name: String

    var image: String

    var roles: List<Role>
}