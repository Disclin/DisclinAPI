package pw.dotdash.disclin.api.entity.guild

import pw.dotdash.disclin.api.entity.Entity
import pw.dotdash.disclin.api.entity.Identifiable

interface Guildlike : Identifiable, Entity {

    val isAvailable: Boolean
}