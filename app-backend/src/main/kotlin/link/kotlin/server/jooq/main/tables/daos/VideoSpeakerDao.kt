/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.daos


import kotlin.collections.List

import link.kotlin.server.jooq.main.tables.VideoSpeaker
import link.kotlin.server.jooq.main.tables.records.VideoSpeakerRecord

import org.jooq.Configuration
import org.jooq.Record2
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class VideoSpeakerDao(configuration: Configuration?) : DAOImpl<VideoSpeakerRecord, link.kotlin.server.jooq.main.tables.pojos.VideoSpeaker, Record2<Long?, Long?>>(VideoSpeaker.VIDEO_SPEAKER, link.kotlin.server.jooq.main.tables.pojos.VideoSpeaker::class.java, configuration) {

    /**
     * Create a new VideoSpeakerDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: link.kotlin.server.jooq.main.tables.pojos.VideoSpeaker): Record2<Long?, Long?> = compositeKeyRecord(o.videoId, o.kotlinerId)

    /**
     * Fetch records that have <code>video_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfVideoId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.VideoSpeaker> = fetchRange(VideoSpeaker.VIDEO_SPEAKER.VIDEO_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>video_id IN (values)</code>
     */
    fun fetchByVideoId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.VideoSpeaker> = fetch(VideoSpeaker.VIDEO_SPEAKER.VIDEO_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>kotliner_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfKotlinerId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.VideoSpeaker> = fetchRange(VideoSpeaker.VIDEO_SPEAKER.KOTLINER_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>kotliner_id IN (values)</code>
     */
    fun fetchByKotlinerId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.VideoSpeaker> = fetch(VideoSpeaker.VIDEO_SPEAKER.KOTLINER_ID, *values.toTypedArray())
}
