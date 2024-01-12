/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.records


import java.time.OffsetDateTime

import link.kotlin.server.jooq.main.enums.KugStatusEnum
import link.kotlin.server.jooq.main.tables.Kug

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KugRecord() : UpdatableRecordImpl<KugRecord>(Kug.KUG) {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var created: OffsetDateTime?
        set(value): Unit = set(1, value)
        get(): OffsetDateTime? = get(1) as OffsetDateTime?

    open var updated: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    open var createdBy: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var updatedBy: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var status: KugStatusEnum?
        set(value): Unit = set(5, value)
        get(): KugStatusEnum? = get(5) as KugStatusEnum?

    open var continent: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var name: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var country: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var url: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var slug: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var latitude: Double?
        set(value): Unit = set(11, value)
        get(): Double? = get(11) as Double?

    open var longitude: Double?
        set(value): Unit = set(12, value)
        get(): Double? = get(12) as Double?

    open var version: Long?
        set(value): Unit = set(13, value)
        get(): Long? = get(13) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised KugRecord
     */
    constructor(id: Long? = null, created: OffsetDateTime? = null, updated: OffsetDateTime? = null, createdBy: Long? = null, updatedBy: Long? = null, status: KugStatusEnum? = null, continent: String? = null, name: String? = null, country: String? = null, url: String? = null, slug: String? = null, latitude: Double? = null, longitude: Double? = null, version: Long? = null): this() {
        this.id = id
        this.created = created
        this.updated = updated
        this.createdBy = createdBy
        this.updatedBy = updatedBy
        this.status = status
        this.continent = continent
        this.name = name
        this.country = country
        this.url = url
        this.slug = slug
        this.latitude = latitude
        this.longitude = longitude
        this.version = version
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised KugRecord
     */
    constructor(value: link.kotlin.server.jooq.main.tables.pojos.Kug?): this() {
        if (value != null) {
            this.id = value.id
            this.created = value.created
            this.updated = value.updated
            this.createdBy = value.createdBy
            this.updatedBy = value.updatedBy
            this.status = value.status
            this.continent = value.continent
            this.name = value.name
            this.country = value.country
            this.url = value.url
            this.slug = value.slug
            this.latitude = value.latitude
            this.longitude = value.longitude
            this.version = value.version
            resetChangedOnNotNull()
        }
    }
}
