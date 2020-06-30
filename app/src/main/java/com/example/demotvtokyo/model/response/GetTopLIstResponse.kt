package com.example.demotvtokyo.model.response

import com.example.demotvtokyo.model.Episode
import com.example.demotvtokyo.model.Episodes
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "GETTOPLIST", strict = false)
data class GetTopLIstResponse (
    @field: Element(name = "RESPONSE_CODE", required = false)
    var responseCode : String? = null,
    @field: Element(name = "CACHE_EFFECTIVE_TIME", required = false)
    var cacheEffectiveTime : String? = null,
    @field: Element(name = "TOTAL_FETCH_COUNT", required = false)
    var totalFetchCount : String? = null,
    @field: Element(name = "REQUEST_FETCH_COUNT", required = false)
    var requestFetchCount : String? = null,
    @field: Element(name = "EPISODES", required = false)
    var listEpisode: Episodes? = null // e khai episodes = list đây còn gì

)