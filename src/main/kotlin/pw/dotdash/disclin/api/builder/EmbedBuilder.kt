package pw.dotdash.disclin.api.builder

import pw.dotdash.disclin.api.entity.Mentionable
import java.time.Instant

interface EmbedBuilder {

    var title: String

    var url: String

    var description: String

    var timestamp: Instant

    var color: Int

    operator fun CharSequence.unaryPlus()

    operator fun Mentionable.unaryPlus()

    interface Author {

        var name: String

        var url: String?

        var iconUrl: String?
    }

    interface Field {

        var name: String

        var value: String

        var inline: Boolean
    }

    interface Footer {

        var text: String

        var iconUrl: String?
    }

    interface Image {

        var url: String
    }

    interface Thumbnail {

        var url: String
    }
}