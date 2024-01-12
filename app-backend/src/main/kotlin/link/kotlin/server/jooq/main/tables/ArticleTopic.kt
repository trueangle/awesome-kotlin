/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import kotlin.collections.Collection
import kotlin.collections.List

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.keys.ARTICLE_TOPIC_PKEY
import link.kotlin.server.jooq.main.keys.ARTICLE_TOPIC__ARTICLE_TOPIC_ARTICLE_ID_FKEY
import link.kotlin.server.jooq.main.keys.ARTICLE_TOPIC__ARTICLE_TOPIC_TOPIC_ID_FKEY
import link.kotlin.server.jooq.main.tables.Article.ArticlePath
import link.kotlin.server.jooq.main.tables.Topic.TopicPath
import link.kotlin.server.jooq.main.tables.records.ArticleTopicRecord

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ArticleTopic(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ArticleTopicRecord>?,
    parentPath: InverseForeignKey<out Record, ArticleTopicRecord>?,
    aliased: Table<ArticleTopicRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ArticleTopicRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.article_topic</code>
         */
        val ARTICLE_TOPIC: ArticleTopic = ArticleTopic()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ArticleTopicRecord> = ArticleTopicRecord::class.java

    /**
     * The column <code>public.article_topic.article_id</code>.
     */
    val ARTICLE_ID: TableField<ArticleTopicRecord, Long?> = createField(DSL.name("article_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.article_topic.topic_id</code>.
     */
    val TOPIC_ID: TableField<ArticleTopicRecord, Long?> = createField(DSL.name("topic_id"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ArticleTopicRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ArticleTopicRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ArticleTopicRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.article_topic</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.article_topic</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.article_topic</code> table reference
     */
    constructor(): this(DSL.name("article_topic"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, ArticleTopicRecord>?, parentPath: InverseForeignKey<out Record, ArticleTopicRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, ARTICLE_TOPIC, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class ArticleTopicPath : ArticleTopic, Path<ArticleTopicRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, ArticleTopicRecord>?, parentPath: InverseForeignKey<out Record, ArticleTopicRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<ArticleTopicRecord>): super(alias, aliased)
        override fun `as`(alias: String): ArticleTopicPath = ArticleTopicPath(DSL.name(alias), this)
        override fun `as`(alias: Name): ArticleTopicPath = ArticleTopicPath(alias, this)
        override fun `as`(alias: Table<*>): ArticleTopicPath = ArticleTopicPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<ArticleTopicRecord> = ARTICLE_TOPIC_PKEY
    override fun getReferences(): List<ForeignKey<ArticleTopicRecord, *>> = listOf(ARTICLE_TOPIC__ARTICLE_TOPIC_ARTICLE_ID_FKEY, ARTICLE_TOPIC__ARTICLE_TOPIC_TOPIC_ID_FKEY)

    private lateinit var _article: ArticlePath

    /**
     * Get the implicit join path to the <code>public.article</code> table.
     */
    fun article(): ArticlePath {
        if (!this::_article.isInitialized)
            _article = ArticlePath(this, ARTICLE_TOPIC__ARTICLE_TOPIC_ARTICLE_ID_FKEY, null)

        return _article;
    }

    val article: ArticlePath
        get(): ArticlePath = article()

    private lateinit var _topic: TopicPath

    /**
     * Get the implicit join path to the <code>public.topic</code> table.
     */
    fun topic(): TopicPath {
        if (!this::_topic.isInitialized)
            _topic = TopicPath(this, ARTICLE_TOPIC__ARTICLE_TOPIC_TOPIC_ID_FKEY, null)

        return _topic;
    }

    val topic: TopicPath
        get(): TopicPath = topic()
    override fun `as`(alias: String): ArticleTopic = ArticleTopic(DSL.name(alias), this)
    override fun `as`(alias: Name): ArticleTopic = ArticleTopic(alias, this)
    override fun `as`(alias: Table<*>): ArticleTopic = ArticleTopic(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ArticleTopic = ArticleTopic(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ArticleTopic = ArticleTopic(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ArticleTopic = ArticleTopic(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): ArticleTopic = ArticleTopic(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ArticleTopic = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): ArticleTopic = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): ArticleTopic = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ArticleTopic = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ArticleTopic = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ArticleTopic = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ArticleTopic = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ArticleTopic = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ArticleTopic = where(DSL.notExists(select))
}
