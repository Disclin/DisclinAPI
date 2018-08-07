package pw.dotdash.disclin.api.entity.message

import java.time.Instant

interface Embed {

    companion object {

        const val MAX_TITLE_LENGTH = 256

        const val MAX_DESC_LENGTH = 2048

        const val MAX_FIELD_COUNT = 25

        const val MAX_FIELD_NAME_LENGTH = 256

        const val MAX_FIELD_VAL_LENGTH = 1024

        const val MAX_FOOTER_LENGTH = 2048

        const val MAX_AUTHOR_LENGTH = 256
    }

    val title: String

    val url: String

    val type: String

    val description: String

    val timestamp: Instant

    val color: Int

    val author: Author

    val fields: List<Field>

    val footer: Footer

    val image: Image

    val provider: Provider

    val thumbnail: Thumbnail

    val video: Video

    interface Author {

        val name: String

        val url: String

        val iconUrl: String

        val proxyIconUrl: String
    }

    interface Field {

        val name: String

        val value: String

        val inline: Boolean
    }

    interface Footer {

        val text: String

        val iconUrl: String

        val proxyIconUrl: String
    }

    interface Image {

        val url: String

        val proxyUrl: String

        val height: Int

        val width: Int
    }

    interface Provider {

        val name: String

        val url: String
    }

    interface Thumbnail {

        val url: String

        val proxyUrl: String

        val height: Int

        val width: Int
    }

    interface Video {

        val url: String

        val height: Int

        val width: Int
    }
}