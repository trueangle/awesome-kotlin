/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import java.time.OffsetDateTime

import kotlin.collections.Collection

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.tables.records.RepositoryRecord

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
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
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Repository(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, RepositoryRecord>?,
    parentPath: InverseForeignKey<out Record, RepositoryRecord>?,
    aliased: Table<RepositoryRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<RepositoryRecord>(
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
         * The reference instance of <code>public.repository</code>
         */
        val REPOSITORY: Repository = Repository()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RepositoryRecord> = RepositoryRecord::class.java

    /**
     * The column <code>public.repository.name</code>.
     */
    val NAME: TableField<RepositoryRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(1000).nullable(false), this, "")

    /**
     * The column <code>public.repository.description</code>.
     */
    val DESCRIPTION: TableField<RepositoryRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>public.repository.version</code>.
     */
    val VERSION: TableField<RepositoryRecord, Long?> = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>public.repository.created</code>.
     */
    val CREATED: TableField<RepositoryRecord, OffsetDateTime?> = createField(DSL.name("created"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    /**
     * The column <code>public.repository.updated</code>.
     */
    val UPDATED: TableField<RepositoryRecord, OffsetDateTime?> = createField(DSL.name("updated"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<RepositoryRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<RepositoryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<RepositoryRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.repository</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.repository</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.repository</code> table reference
     */
    constructor(): this(DSL.name("repository"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): Repository = Repository(DSL.name(alias), this)
    override fun `as`(alias: Name): Repository = Repository(alias, this)
    override fun `as`(alias: Table<*>): Repository = Repository(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Repository = Repository(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Repository = Repository(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Repository = Repository(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): Repository = Repository(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Repository = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): Repository = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): Repository = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Repository = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Repository = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Repository = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Repository = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Repository = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Repository = where(DSL.notExists(select))
}
