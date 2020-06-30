package com.example.demotvtokyo.model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root
import retrofit2.http.Field
import java.lang.reflect.Constructor

@Root(name = "EPISODE", strict = false)
data class Episode (
    @field: Element (name = "DISP_DIV", required = false)
    var disp_div : String? = null,
    @field: Element (name = "EPISODE_DATE", required = false)
    var episodeDate : String? = null,
    @field: Element (name = "EPISODE_WEEK", required = false)
    var episodeWeek : String? = null,
    @field: Element (name = "THUMBNAIL_SIZE", required = false)
    var thumbnailSize : String? = null,
    @field: Element (name = "EPISODE_ID", required = false)
    var episodeId : String? = null,
    @field: Element (name = "EPISODE_NAME", required = false)
    var episodeName : String? = null,
    @field: Element (name = "BROADCAST_DATE", required = false)
    var broadcastDate : String? = null,
    @field: Element (name = "BROADCAST_WEEK", required = false)
    var broadcastWeek : String? = null,
    @field: Element (name = "BROADCAST_TIME", required = false)
    var broadcastTime : String? = null,
    @field: Element (name = "PLAY_TIME", required = false)
    var playTime : String? = null,
    @field: Element (name = "THUMBNAIL_URL", required = false)
    var thumbnailUrl : String? = null,
    @field: Element (name = "HEADER", required = false)
    var header : String? = null,
    @field: Element (name = "PAID_FLAG", required = false)
    var paidFlag : String? = null,
    @field: Element (name = "EPISODE_PLAY_TYPE", required = false)
    var episodePlayType : String? = null,
    @field: Element (name = "PROGRAM_ID", required = false)
    var programID : String? = null,
    @field: Element (name = "PROGRAM_NAME", required = false)
    var programName : String? = null



)



