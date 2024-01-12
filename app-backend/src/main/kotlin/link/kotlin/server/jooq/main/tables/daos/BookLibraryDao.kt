/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.daos


import kotlin.collections.List

import link.kotlin.server.jooq.main.tables.BookLibrary
import link.kotlin.server.jooq.main.tables.records.BookLibraryRecord

import org.jooq.Configuration
import org.jooq.Record2
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class BookLibraryDao(configuration: Configuration?) : DAOImpl<BookLibraryRecord, link.kotlin.server.jooq.main.tables.pojos.BookLibrary, Record2<Long?, Long?>>(BookLibrary.BOOK_LIBRARY, link.kotlin.server.jooq.main.tables.pojos.BookLibrary::class.java, configuration) {

    /**
     * Create a new BookLibraryDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: link.kotlin.server.jooq.main.tables.pojos.BookLibrary): Record2<Long?, Long?> = compositeKeyRecord(o.bookId, o.libraryId)

    /**
     * Fetch records that have <code>book_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfBookId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.BookLibrary> = fetchRange(BookLibrary.BOOK_LIBRARY.BOOK_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>book_id IN (values)</code>
     */
    fun fetchByBookId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.BookLibrary> = fetch(BookLibrary.BOOK_LIBRARY.BOOK_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>library_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLibraryId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.BookLibrary> = fetchRange(BookLibrary.BOOK_LIBRARY.LIBRARY_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>library_id IN (values)</code>
     */
    fun fetchByLibraryId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.BookLibrary> = fetch(BookLibrary.BOOK_LIBRARY.LIBRARY_ID, *values.toTypedArray())
}
