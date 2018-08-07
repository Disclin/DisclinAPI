package pw.dotdash.disclin.api.entity.message

interface MessageActivity {

    val type: MessageActivityType

    val partyId: String?
}