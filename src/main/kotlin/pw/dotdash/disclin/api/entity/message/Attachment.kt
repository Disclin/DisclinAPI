package pw.dotdash.disclin.api.entity.message

import pw.dotdash.disclin.api.entity.Identifiable
import java.io.File
import java.nio.file.Path

interface Attachment : Identifiable {

    val filename: String

    val size: Int

    val url: String

    val proxyUrl: String

    val height: Int?

    val width: Int?

    val isImage: Boolean get() = height != null && width != null

    suspend fun download(file: File)

    suspend fun download(path: Path) = download(path.toFile())
}