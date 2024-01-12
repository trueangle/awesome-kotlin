/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.daos


import kotlin.collections.List

import link.kotlin.server.jooq.main.tables.BookSpeaker
import link.kotlin.server.jooq.main.tables.records.BookSpeakerRecord

import org.jooq.Configuration
import org.jooq.Record2
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class BookSpeakerDao(configuration: Configuration?) : DAOImpl<BookSpeakerRecord, link.kotlin.server.jooq.main.tables.pojos.BookSpeaker, Record2<Long?, Long?>>(BookSpeaker.BOOK_SPEAKER, link.kotlin.server.jooq.main.tables.pojos.BookSpeaker::class.java, configuration) {

    /**
     * Create a new BookSpeakerDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: link.kotlin.server.jooq.main.tables.pojos.BookSpeaker): Record2<Long?, Long?> = compositeKeyRecord(o.bookId, o.kotlinerId)

    /**
     * Fetch records that have <code>book_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfBookId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.BookSpeaker> = fetchRange(BookSpeaker.BOOK_SPEAKER.BOOK_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>book_id IN (values)</code>
     */
    fun fetchByBookId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.BookSpeaker> = fetch(BookSpeaker.BOOK_SPEAKER.BOOK_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>kotliner_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfKotlinerId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.BookSpeaker> = fetchRange(BookSpeaker.BOOK_SPEAKER.KOTLINER_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>kotliner_id IN (values)</code>
     */
    fun fetchByKotlinerId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.BookSpeaker> = fetch(BookSpeaker.BOOK_SPEAKER.KOTLINER_ID, *values.toTypedArray())
}
