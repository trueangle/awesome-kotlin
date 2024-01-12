/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.daos


import java.time.OffsetDateTime

import kotlin.collections.List

import link.kotlin.server.jooq.main.tables.Article
import link.kotlin.server.jooq.main.tables.records.ArticleRecord

import org.jooq.Configuration
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ArticleDao(configuration: Configuration?) : DAOImpl<ArticleRecord, link.kotlin.server.jooq.main.tables.pojos.Article, Long>(Article.ARTICLE, link.kotlin.server.jooq.main.tables.pojos.Article::class.java, configuration) {

    /**
     * Create a new ArticleDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: link.kotlin.server.jooq.main.tables.pojos.Article): Long? = o.id

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    fun fetchById(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    fun fetchOneById(value: Long): link.kotlin.server.jooq.main.tables.pojos.Article? = fetchOne(Article.ARTICLE.ID, value)

    /**
     * Fetch records that have <code>created BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCreated(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.CREATED, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    fun fetchByCreated(vararg values: OffsetDateTime): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.CREATED, *values)

    /**
     * Fetch records that have <code>updated BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfUpdated(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.UPDATED, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    fun fetchByUpdated(vararg values: OffsetDateTime): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.UPDATED, *values)

    /**
     * Fetch records that have <code>updated_by BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfUpdatedBy(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.UPDATED_BY, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>updated_by IN (values)</code>
     */
    fun fetchByUpdatedBy(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.UPDATED_BY, *values.toTypedArray())

    /**
     * Fetch records that have <code>created_by BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCreatedBy(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.CREATED_BY, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    fun fetchByCreatedBy(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.CREATED_BY, *values.toTypedArray())

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfStatus(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.STATUS, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    fun fetchByStatus(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.STATUS, *values)

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfTitle(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.TITLE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    fun fetchByTitle(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.TITLE, *values)

    /**
     * Fetch records that have <code>original_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfOriginalId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.ORIGINAL_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>original_id IN (values)</code>
     */
    fun fetchByOriginalId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.ORIGINAL_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>language BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLanguage(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.LANGUAGE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>language IN (values)</code>
     */
    fun fetchByLanguage(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.LANGUAGE, *values)

    /**
     * Fetch records that have <code>url BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfUrl(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.URL, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    fun fetchByUrl(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.URL, *values)

    /**
     * Fetch records that have <code>content BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfContent(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.CONTENT, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    fun fetchByContent(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.CONTENT, *values)

    /**
     * Fetch records that have <code>thumbnail BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfThumbnail(lowerInclusive: String?, upperInclusive: String?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.THUMBNAIL, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>thumbnail IN (values)</code>
     */
    fun fetchByThumbnail(vararg values: String): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.THUMBNAIL, *values)

    /**
     * Fetch records that have <code>published BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfPublished(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.PUBLISHED, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>published IN (values)</code>
     */
    fun fetchByPublished(vararg values: OffsetDateTime): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.PUBLISHED, *values)

    /**
     * Fetch records that have <code>version BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfVersion(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetchRange(Article.ARTICLE.VERSION, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    fun fetchByVersion(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.Article> = fetch(Article.ARTICLE.VERSION, *values.toTypedArray())
}
