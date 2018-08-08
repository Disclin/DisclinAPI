package pw.dotdash.disclin.api.event.guild.member

interface UpdateMemberEvent : MemberEvent {

    interface Nick : UpdateMemberEvent {

        val oldNick: String

        val newNick: String
    }
}