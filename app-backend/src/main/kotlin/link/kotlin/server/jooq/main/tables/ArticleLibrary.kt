/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import kotlin.collections.Collection
import kotlin.collections.List

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.keys.ARTICLE_LIBRARY_PKEY
import link.kotlin.server.jooq.main.keys.ARTICLE_LIBRARY__ARTICLE_LIBRARY_ARTICLE_ID_FKEY
import link.kotlin.server.jooq.main.keys.ARTICLE_LIBRARY__ARTICLE_LIBRARY_LIBRARY_ID_FKEY
import link.kotlin.server.jooq.main.tables.Article.ArticlePath
import link.kotlin.server.jooq.main.tables.Library.LibraryPath
import link.kotlin.server.jooq.main.tables.records.ArticleLibraryRecord

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
open class ArticleLibrary(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ArticleLibraryRecord>?,
    parentPath: InverseForeignKey<out Record, ArticleLibraryRecord>?,
    aliased: Table<ArticleLibraryRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ArticleLibraryRecord>(
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
         * The reference instance of <code>public.article_library</code>
         */
        val ARTICLE_LIBRARY: ArticleLibrary = ArticleLibrary()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ArticleLibraryRecord> = ArticleLibraryRecord::class.java

    /**
     * The column <code>public.article_library.article_id</code>.
     */
    val ARTICLE_ID: TableField<ArticleLibraryRecord, Long?> = createField(DSL.name("article_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.article_library.library_id</code>.
     */
    val LIBRARY_ID: TableField<ArticleLibraryRecord, Long?> = createField(DSL.name("library_id"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ArticleLibraryRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ArticleLibraryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ArticleLibraryRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.article_library</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.article_library</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.article_library</code> table reference
     */
    constructor(): this(DSL.name("article_library"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, ArticleLibraryRecord>?, parentPath: InverseForeignKey<out Record, ArticleLibraryRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, ARTICLE_LIBRARY, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class ArticleLibraryPath : ArticleLibrary, Path<ArticleLibraryRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, ArticleLibraryRecord>?, parentPath: InverseForeignKey<out Record, ArticleLibraryRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<ArticleLibraryRecord>): super(alias, aliased)
        override fun `as`(alias: String): ArticleLibraryPath = ArticleLibraryPath(DSL.name(alias), this)
        override fun `as`(alias: Name): ArticleLibraryPath = ArticleLibraryPath(alias, this)
        override fun `as`(alias: Table<*>): ArticleLibraryPath = ArticleLibraryPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<ArticleLibraryRecord> = ARTICLE_LIBRARY_PKEY
    override fun getReferences(): List<ForeignKey<ArticleLibraryRecord, *>> = listOf(ARTICLE_LIBRARY__ARTICLE_LIBRARY_ARTICLE_ID_FKEY, ARTICLE_LIBRARY__ARTICLE_LIBRARY_LIBRARY_ID_FKEY)

    private lateinit var _article: ArticlePath

    /**
     * Get the implicit join path to the <code>public.article</code> table.
     */
    fun article(): ArticlePath {
        if (!this::_article.isInitialized)
            _article = ArticlePath(this, ARTICLE_LIBRARY__ARTICLE_LIBRARY_ARTICLE_ID_FKEY, null)

        return _article;
    }

    val article: ArticlePath
        get(): ArticlePath = article()

    private lateinit var _library: LibraryPath

    /**
     * Get the implicit join path to the <code>public.library</code> table.
     */
    fun library(): LibraryPath {
        if (!this::_library.isInitialized)
            _library = LibraryPath(this, ARTICLE_LIBRARY__ARTICLE_LIBRARY_LIBRARY_ID_FKEY, null)

        return _library;
    }

    val library: LibraryPath
        get(): LibraryPath = library()
    override fun `as`(alias: String): ArticleLibrary = ArticleLibrary(DSL.name(alias), this)
    override fun `as`(alias: Name): ArticleLibrary = ArticleLibrary(alias, this)
    override fun `as`(alias: Table<*>): ArticleLibrary = ArticleLibrary(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ArticleLibrary = ArticleLibrary(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ArticleLibrary = ArticleLibrary(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): ArticleLibrary = ArticleLibrary(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): ArticleLibrary = ArticleLibrary(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): ArticleLibrary = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): ArticleLibrary = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): ArticleLibrary = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): ArticleLibrary = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): ArticleLibrary = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): ArticleLibrary = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): ArticleLibrary = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): ArticleLibrary = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): ArticleLibrary = where(DSL.notExists(select))
}
