/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import java.time.OffsetDateTime

import kotlin.collections.Collection

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.keys.COURSE_LIBRARY__COURSE_LIBRARY_COURSE_ID_FKEY
import link.kotlin.server.jooq.main.keys.COURSE_PKEY
import link.kotlin.server.jooq.main.keys.COURSE_SPEAKER__COURSE_SPEAKER_COURSE_ID_FKEY
import link.kotlin.server.jooq.main.tables.CourseLibrary.CourseLibraryPath
import link.kotlin.server.jooq.main.tables.CourseSpeaker.CourseSpeakerPath
import link.kotlin.server.jooq.main.tables.Kotliner.KotlinerPath
import link.kotlin.server.jooq.main.tables.Library.LibraryPath
import link.kotlin.server.jooq.main.tables.records.CourseRecord

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
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
open class Course(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, CourseRecord>?,
    parentPath: InverseForeignKey<out Record, CourseRecord>?,
    aliased: Table<CourseRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<CourseRecord>(
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
         * The reference instance of <code>public.course</code>
         */
        val COURSE: Course = Course()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CourseRecord> = CourseRecord::class.java

    /**
     * The column <code>public.course.id</code>.
     */
    val ID: TableField<CourseRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.course.title</code>.
     */
    val TITLE: TableField<CourseRecord, String?> = createField(DSL.name("title"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.course.description</code>.
     */
    val DESCRIPTION: TableField<CourseRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>public.course.language</code>.
     */
    val LANGUAGE: TableField<CourseRecord, String?> = createField(DSL.name("language"), SQLDataType.VARCHAR(50).nullable(false), this, "")

    /**
     * The column <code>public.course.price</code>.
     */
    val PRICE: TableField<CourseRecord, Int?> = createField(DSL.name("price"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.course.url</code>.
     */
    val URL: TableField<CourseRecord, String?> = createField(DSL.name("url"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.course.thumbnail</code>.
     */
    val THUMBNAIL: TableField<CourseRecord, String?> = createField(DSL.name("thumbnail"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.course.created</code>.
     */
    val CREATED: TableField<CourseRecord, OffsetDateTime?> = createField(DSL.name("created"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    /**
     * The column <code>public.course.updated</code>.
     */
    val UPDATED: TableField<CourseRecord, OffsetDateTime?> = createField(DSL.name("updated"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<CourseRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<CourseRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<CourseRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.course</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.course</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.course</code> table reference
     */
    constructor(): this(DSL.name("course"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, CourseRecord>?, parentPath: InverseForeignKey<out Record, CourseRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, COURSE, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class CoursePath : Course, Path<CourseRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, CourseRecord>?, parentPath: InverseForeignKey<out Record, CourseRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<CourseRecord>): super(alias, aliased)
        override fun `as`(alias: String): CoursePath = CoursePath(DSL.name(alias), this)
        override fun `as`(alias: Name): CoursePath = CoursePath(alias, this)
        override fun `as`(alias: Table<*>): CoursePath = CoursePath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<CourseRecord, Long?> = super.getIdentity() as Identity<CourseRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<CourseRecord> = COURSE_PKEY

    private lateinit var _courseLibrary: CourseLibraryPath

    /**
     * Get the implicit to-many join path to the
     * <code>public.course_library</code> table
     */
    fun courseLibrary(): CourseLibraryPath {
        if (!this::_courseLibrary.isInitialized)
            _courseLibrary = CourseLibraryPath(this, null, COURSE_LIBRARY__COURSE_LIBRARY_COURSE_ID_FKEY.inverseKey)

        return _courseLibrary;
    }

    val courseLibrary: CourseLibraryPath
        get(): CourseLibraryPath = courseLibrary()

    private lateinit var _courseSpeaker: CourseSpeakerPath

    /**
     * Get the implicit to-many join path to the
     * <code>public.course_speaker</code> table
     */
    fun courseSpeaker(): CourseSpeakerPath {
        if (!this::_courseSpeaker.isInitialized)
            _courseSpeaker = CourseSpeakerPath(this, null, COURSE_SPEAKER__COURSE_SPEAKER_COURSE_ID_FKEY.inverseKey)

        return _courseSpeaker;
    }

    val courseSpeaker: CourseSpeakerPath
        get(): CourseSpeakerPath = courseSpeaker()

    /**
     * Get the implicit many-to-many join path to the
     * <code>public.library</code> table
     */
    val library: LibraryPath
        get(): LibraryPath = courseLibrary().library()

    /**
     * Get the implicit many-to-many join path to the
     * <code>public.kotliner</code> table
     */
    val kotliner: KotlinerPath
        get(): KotlinerPath = courseSpeaker().kotliner()
    override fun `as`(alias: String): Course = Course(DSL.name(alias), this)
    override fun `as`(alias: Name): Course = Course(alias, this)
    override fun `as`(alias: Table<*>): Course = Course(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Course = Course(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Course = Course(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Course = Course(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): Course = Course(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Course = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): Course = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): Course = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Course = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Course = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Course = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Course = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Course = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Course = where(DSL.notExists(select))
}
