package pw.dotdash.disclin.api.entity.guild

interface UnavailableGuild : Guildlike {

    override val isAvailable: Boolean
        get() = false
}