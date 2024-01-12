/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.pojos


import java.io.Serializable
import java.time.OffsetDateTime

import link.kotlin.server.jooq.main.enums.KugStatusEnum


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Kug(
    var id: Long? = null,
    var created: OffsetDateTime? = null,
    var updated: OffsetDateTime? = null,
    var createdBy: Long? = null,
    var updatedBy: Long? = null,
    var status: KugStatusEnum? = null,
    var continent: String? = null,
    var name: String? = null,
    var country: String? = null,
    var url: String? = null,
    var slug: String? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var version: Long? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: Kug = other as Kug
        if (this.id == null) {
            if (o.id != null)
                return false
        }
        else if (this.id != o.id)
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
        if (this.createdBy == null) {
            if (o.createdBy != null)
                return false
        }
        else if (this.createdBy != o.createdBy)
            return false
        if (this.updatedBy == null) {
            if (o.updatedBy != null)
                return false
        }
        else if (this.updatedBy != o.updatedBy)
            return false
        if (this.status == null) {
            if (o.status != null)
                return false
        }
        else if (this.status != o.status)
            return false
        if (this.continent == null) {
            if (o.continent != null)
                return false
        }
        else if (this.continent != o.continent)
            return false
        if (this.name == null) {
            if (o.name != null)
                return false
        }
        else if (this.name != o.name)
            return false
        if (this.country == null) {
            if (o.country != null)
                return false
        }
        else if (this.country != o.country)
            return false
        if (this.url == null) {
            if (o.url != null)
                return false
        }
        else if (this.url != o.url)
            return false
        if (this.slug == null) {
            if (o.slug != null)
                return false
        }
        else if (this.slug != o.slug)
            return false
        if (this.latitude == null) {
            if (o.latitude != null)
                return false
        }
        else if (this.latitude != o.latitude)
            return false
        if (this.longitude == null) {
            if (o.longitude != null)
                return false
        }
        else if (this.longitude != o.longitude)
            return false
        if (this.version == null) {
            if (o.version != null)
                return false
        }
        else if (this.version != o.version)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.id == null) 0 else this.id.hashCode())
        result = prime * result + (if (this.created == null) 0 else this.created.hashCode())
        result = prime * result + (if (this.updated == null) 0 else this.updated.hashCode())
        result = prime * result + (if (this.createdBy == null) 0 else this.createdBy.hashCode())
        result = prime * result + (if (this.updatedBy == null) 0 else this.updatedBy.hashCode())
        result = prime * result + (if (this.status == null) 0 else this.status.hashCode())
        result = prime * result + (if (this.continent == null) 0 else this.continent.hashCode())
        result = prime * result + (if (this.name == null) 0 else this.name.hashCode())
        result = prime * result + (if (this.country == null) 0 else this.country.hashCode())
        result = prime * result + (if (this.url == null) 0 else this.url.hashCode())
        result = prime * result + (if (this.slug == null) 0 else this.slug.hashCode())
        result = prime * result + (if (this.latitude == null) 0 else this.latitude.hashCode())
        result = prime * result + (if (this.longitude == null) 0 else this.longitude.hashCode())
        result = prime * result + (if (this.version == null) 0 else this.version.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("Kug (")

        sb.append(id)
        sb.append(", ").append(created)
        sb.append(", ").append(updated)
        sb.append(", ").append(createdBy)
        sb.append(", ").append(updatedBy)
        sb.append(", ").append(status)
        sb.append(", ").append(continent)
        sb.append(", ").append(name)
        sb.append(", ").append(country)
        sb.append(", ").append(url)
        sb.append(", ").append(slug)
        sb.append(", ").append(latitude)
        sb.append(", ").append(longitude)
        sb.append(", ").append(version)

        sb.append(")")
        return sb.toString()
    }
}
