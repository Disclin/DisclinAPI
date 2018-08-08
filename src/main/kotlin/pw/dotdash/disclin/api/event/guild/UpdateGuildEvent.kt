package pw.dotdash.disclin.api.event.guild

import pw.dotdash.disclin.api.entity.channel.guild.GuildTextChannel
import pw.dotdash.disclin.api.entity.channel.guild.GuildVoiceChannel
import pw.dotdash.disclin.api.entity.guild.AFKTimeout
import pw.dotdash.disclin.api.entity.guild.Member
import pw.dotdash.disclin.api.entity.guild.ContentFilterLevel as GuildContentFilterLevel
import pw.dotdash.disclin.api.entity.guild.NotificationLevel as GuildNotificationLevel
import pw.dotdash.disclin.api.entity.guild.Region as GuildRegion
import pw.dotdash.disclin.api.entity.guild.VerificationLevel as GuildVerificationLevel

interface UpdateGuildEvent : GuildEvent {

    interface Name : UpdateGuildEvent {

        val oldName: String

        val newName: String
    }

    interface Region : UpdateGuildEvent {

        val oldRegion: GuildRegion

        val newRegion: GuildRegion
    }

    interface Icon : UpdateGuildEvent {

        val oldIcon: String?

        val newIcon: String?
    }

    interface Splash : UpdateGuildEvent {

        val oldSplash: String?

        val newSplash: String?
    }

    interface Owner : UpdateGuildEvent {

        val oldOwner: Member

        val newOwner: Member
    }

    interface VerificationLevel : UpdateGuildEvent {

        val oldLevel: GuildVerificationLevel

        val newLevel: GuildVerificationLevel
    }

    interface NotificationLevel : UpdateGuildEvent {

        val oldLevel: GuildNotificationLevel

        val newLevel: GuildNotificationLevel
    }

    interface ContentFilterLevel : UpdateGuildEvent {

        val oldLevel: GuildContentFilterLevel

        val newLevel: GuildContentFilterLevel
    }

    interface AfkChannel : UpdateGuildEvent {

        val oldChannel: GuildVoiceChannel?

        val newChannel: GuildVoiceChannel?
    }

    interface AfkTimeout : UpdateGuildEvent {

        val oldTimeout: AFKTimeout

        val newTimeout: AFKTimeout
    }

    interface SystemChannel : UpdateGuildEvent {

        val oldChannel: GuildTextChannel?

        val newChannel: GuildTextChannel?
    }
}