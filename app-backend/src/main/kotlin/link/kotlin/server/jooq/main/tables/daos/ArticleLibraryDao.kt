/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.daos


import kotlin.collections.List

import link.kotlin.server.jooq.main.tables.ArticleLibrary
import link.kotlin.server.jooq.main.tables.records.ArticleLibraryRecord

import org.jooq.Configuration
import org.jooq.Record2
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ArticleLibraryDao(configuration: Configuration?) : DAOImpl<ArticleLibraryRecord, link.kotlin.server.jooq.main.tables.pojos.ArticleLibrary, Record2<Long?, Long?>>(ArticleLibrary.ARTICLE_LIBRARY, link.kotlin.server.jooq.main.tables.pojos.ArticleLibrary::class.java, configuration) {

    /**
     * Create a new ArticleLibraryDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: link.kotlin.server.jooq.main.tables.pojos.ArticleLibrary): Record2<Long?, Long?> = compositeKeyRecord(o.articleId, o.libraryId)

    /**
     * Fetch records that have <code>article_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfArticleId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.ArticleLibrary> = fetchRange(ArticleLibrary.ARTICLE_LIBRARY.ARTICLE_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>article_id IN (values)</code>
     */
    fun fetchByArticleId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.ArticleLibrary> = fetch(ArticleLibrary.ARTICLE_LIBRARY.ARTICLE_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>library_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLibraryId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.ArticleLibrary> = fetchRange(ArticleLibrary.ARTICLE_LIBRARY.LIBRARY_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>library_id IN (values)</code>
     */
    fun fetchByLibraryId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.ArticleLibrary> = fetch(ArticleLibrary.ARTICLE_LIBRARY.LIBRARY_ID, *values.toTypedArray())
}
