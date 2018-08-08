package pw.dotdash.disclin.api.event.message

import pw.dotdash.disclin.api.entity.message.Message

interface BulkDeleteMessageEvent : MessageEvent {

    /**
     * The first message that was deleted.
     */
    override val message: Message get() = messages.first()

    /**
     * The messages that were deleted.
     */
    val messages: Collection<Message>
}