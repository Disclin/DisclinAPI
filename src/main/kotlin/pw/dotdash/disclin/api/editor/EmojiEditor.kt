package pw.dotdash.disclin.api.editor

import pw.dotdash.disclin.api.entity.guild.Role

interface EmojiEditor {

    var name: String

    var roles: List<Role>
}