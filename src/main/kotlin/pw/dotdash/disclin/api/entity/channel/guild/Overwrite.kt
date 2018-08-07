package pw.dotdash.disclin.api.entity.channel.guild

import pw.dotdash.disclin.api.entity.Identifiable

interface Overwrite : Identifiable {

    val type: OverwriteType


}