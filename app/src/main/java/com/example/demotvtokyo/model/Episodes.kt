package com.example.demotvtokyo.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "EPISODES", strict = false)
data class Episodes (
    @field: ElementList(name = "EPISODES", required = false)
//    @param: ElementList(name = "EPISODES", required = false)
    var listEpisode : List<Episode>? = null
)