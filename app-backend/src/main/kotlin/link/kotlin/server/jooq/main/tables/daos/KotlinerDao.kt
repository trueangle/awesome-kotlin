/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.daos


import java.time.OffsetDateTime

import kotlin.collections.List

import link.kotlin.server.jooq.main.enums.KotlinerStatusEnum
import link.kotlin.server.jooq.main.tables.Kotliner
import link.kotlin.server.jooq.main.tables.records.KotlinerRecord

import org.jooq.Configuration
import org.jooq.JSONB
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KotlinerDao(configuration: Configuration?) : DAOImpl<KotlinerRecord, link.kotlin.server.jooq.main.tables.pojos.Kotliner, Long>(Kotliner.KOTLINER, link.kotlin.server.jooq.main.tables.pojos.Kotliner::class.java, configuration) {

    /**
     * Create a new KotlinerDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: link.kotlin.server.jooq.main.tables.pojos.Kotliner): Long? = o.id

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    fun fetchById(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    fun fetchOneById(value: Long): link.kotlin.server.jooq.main.tables.pojos.Kotliner? = fetchOne(Kotliner.KOTLINER.ID, value)

    /**
     * Fetch records that have <code>created BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCreated(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.CREATED, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    fun fetchByCreated(vararg values: OffsetDateTime): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.CREATED, *values)

    /**
     * Fetch records that have <code>updated BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfUpdated(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.UPDATED, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    fun fetchByUpdated(vararg values: OffsetDateTime): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.UPDATED, *values)

    /**
     * Fetch records that have <code>updated_by BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfUpdatedBy(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.UPDATED_BY, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    fun fetchByUpdatedBy(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.UPDATED_BY, *values.toTypedArray())

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfStatus(lowerInclusive: KotlinerStatusEnum?, upperInclusive: KotlinerStatusEnum?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.STATUS, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    fun fetchByStatus(vararg values: KotlinerStatusEnum): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.STATUS, *values)

    /**
     * Fetch records that have <code>avatar BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfAvatar(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.AVATAR, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>avatar IN (values)</code>
     */
    fun fetchByAvatar(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.AVATAR, *values)

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfDescription(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.DESCRIPTION, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    fun fetchByDescription(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.DESCRIPTION, *values)

    /**
     * Fetch records that have <code>normalized_email BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfNormalizedEmail(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.NORMALIZED_EMAIL, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>normalized_email IN (values)</code>
     */
    fun fetchByNormalizedEmail(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.NORMALIZED_EMAIL, *values)

    /**
     * Fetch a unique record that has <code>normalized_email = value</code>
     */
    fun fetchOneByNormalizedEmail(value: String): link.kotlin.server.jooq.main.tables.pojos.Kotliner? = fetchOne(Kotliner.KOTLINER.NORMALIZED_EMAIL, value)

    /**
     * Fetch records that have <code>original_email BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfOriginalEmail(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.ORIGINAL_EMAIL, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>original_email IN (values)</code>
     */
    fun fetchByOriginalEmail(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.ORIGINAL_EMAIL, *values)

    /**
     * Fetch records that have <code>first_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfFirstName(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.FIRST_NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    fun fetchByFirstName(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.FIRST_NAME, *values)

    /**
     * Fetch records that have <code>last_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLastName(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.LAST_NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    fun fetchByLastName(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.LAST_NAME, *values)

    /**
     * Fetch records that have <code>nickname BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfNickname(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.NICKNAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>nickname IN (values)</code>
     */
    fun fetchByNickname(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.NICKNAME, *values)

    /**
     * Fetch a unique record that has <code>nickname = value</code>
     */
    fun fetchOneByNickname(value: String): link.kotlin.server.jooq.main.tables.pojos.Kotliner? = fetchOne(Kotliner.KOTLINER.NICKNAME, value)

    /**
     * Fetch records that have <code>password BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfPassword(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.PASSWORD, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    fun fetchByPassword(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.PASSWORD, *values)

    /**
     * Fetch records that have <code>totp BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfTotp(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.TOTP, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>totp IN (values)</code>
     */
    fun fetchByTotp(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.TOTP, *values)

    /**
     * Fetch records that have <code>meta BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfMeta(lowerInclusive: JSONB?, upperInclusive: JSONB?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.META, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>meta IN (values)</code>
     */
    fun fetchByMeta(vararg values: JSONB): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.META, *values)

    /**
     * Fetch records that have <code>version BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfVersion(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetchRange(Kotliner.KOTLINER.VERSION, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    fun fetchByVersion(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.Kotliner> = fetch(Kotliner.KOTLINER.VERSION, *values.toTypedArray())
}
