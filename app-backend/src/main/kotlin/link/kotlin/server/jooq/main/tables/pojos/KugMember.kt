/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.pojos


import java.io.Serializable
import java.time.LocalDate

import link.kotlin.server.jooq.main.enums.KugMemberStatusEnum


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class KugMember(
    var kotlinerId: Long? = null,
    var kugId: Long? = null,
    var role: String? = null,
    var joinDate: LocalDate? = null,
    var status: KugMemberStatusEnum? = null,
    var version: Long? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: KugMember = other as KugMember
        if (this.kotlinerId == null) {
            if (o.kotlinerId != null)
                return false
        }
        else if (this.kotlinerId != o.kotlinerId)
            return false
        if (this.kugId == null) {
            if (o.kugId != null)
                return false
        }
        else if (this.kugId != o.kugId)
            return false
        if (this.role == null) {
            if (o.role != null)
                return false
        }
        else if (this.role != o.role)
            return false
        if (this.joinDate == null) {
            if (o.joinDate != null)
                return false
        }
        else if (this.joinDate != o.joinDate)
            return false
        if (this.status == null) {
            if (o.status != null)
                return false
        }
        else if (this.status != o.status)
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
        result = prime * result + (if (this.kotlinerId == null) 0 else this.kotlinerId.hashCode())
        result = prime * result + (if (this.kugId == null) 0 else this.kugId.hashCode())
        result = prime * result + (if (this.role == null) 0 else this.role.hashCode())
        result = prime * result + (if (this.joinDate == null) 0 else this.joinDate.hashCode())
        result = prime * result + (if (this.status == null) 0 else this.status.hashCode())
        result = prime * result + (if (this.version == null) 0 else this.version.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("KugMember (")

        sb.append(kotlinerId)
        sb.append(", ").append(kugId)
        sb.append(", ").append(role)
        sb.append(", ").append(joinDate)
        sb.append(", ").append(status)
        sb.append(", ").append(version)

        sb.append(")")
        return sb.toString()
    }
}
