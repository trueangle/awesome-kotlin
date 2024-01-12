/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.pojos


import java.io.Serializable
import java.time.OffsetDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Video(
    var id: Long? = null,
    var title: String? = null,
    var description: String? = null,
    var language: String? = null,
    var url: String? = null,
    var duration: Int? = null,
    var thumbnail: String? = null,
    var published: OffsetDateTime? = null,
    var created: OffsetDateTime? = null,
    var updated: OffsetDateTime? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: Video = other as Video
        if (this.id == null) {
            if (o.id != null)
                return false
        }
        else if (this.id != o.id)
            return false
        if (this.title == null) {
            if (o.title != null)
                return false
        }
        else if (this.title != o.title)
            return false
        if (this.description == null) {
            if (o.description != null)
                return false
        }
        else if (this.description != o.description)
            return false
        if (this.language == null) {
            if (o.language != null)
                return false
        }
        else if (this.language != o.language)
            return false
        if (this.url == null) {
            if (o.url != null)
                return false
        }
        else if (this.url != o.url)
            return false
        if (this.duration == null) {
            if (o.duration != null)
                return false
        }
        else if (this.duration != o.duration)
            return false
        if (this.thumbnail == null) {
            if (o.thumbnail != null)
                return false
        }
        else if (this.thumbnail != o.thumbnail)
            return false
        if (this.published == null) {
            if (o.published != null)
                return false
        }
        else if (this.published != o.published)
            return false
        if (this.created == null) {
            if (o.created != null)
                return false
        }
        else if (this.created != o.created)
            return false
        if (this.updated == null) {
            if (o.updated != null)
                return false
        }
        else if (this.updated != o.updated)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.id == null) 0 else this.id.hashCode())
        result = prime * result + (if (this.title == null) 0 else this.title.hashCode())
        result = prime * result + (if (this.description == null) 0 else this.description.hashCode())
        result = prime * result + (if (this.language == null) 0 else this.language.hashCode())
        result = prime * result + (if (this.url == null) 0 else this.url.hashCode())
        result = prime * result + (if (this.duration == null) 0 else this.duration.hashCode())
        result = prime * result + (if (this.thumbnail == null) 0 else this.thumbnail.hashCode())
        result = prime * result + (if (this.published == null) 0 else this.published.hashCode())
        result = prime * result + (if (this.created == null) 0 else this.created.hashCode())
        result = prime * result + (if (this.updated == null) 0 else this.updated.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("Video (")

        sb.append(id)
        sb.append(", ").append(title)
        sb.append(", ").append(description)
        sb.append(", ").append(language)
        sb.append(", ").append(url)
        sb.append(", ").append(duration)
        sb.append(", ").append(thumbnail)
        sb.append(", ").append(published)
        sb.append(", ").append(created)
        sb.append(", ").append(updated)

        sb.append(")")
        return sb.toString()
    }
}
