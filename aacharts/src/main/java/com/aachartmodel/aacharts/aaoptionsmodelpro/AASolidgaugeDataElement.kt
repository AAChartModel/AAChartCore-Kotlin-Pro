package com.aachartmodel.aacharts.aaoptionsmodelpro

import com.github.aachartmodel.aainfographics.aachartcreator.AADataElement
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker

class AASolidgaugeDataElement : AADataElement() {
    var radius: String? = null
    var innerRadius: String? = null

    fun radius(prop: String?): AASolidgaugeDataElement {
        radius = prop
        return this
    }

    fun innerRadius(prop: String?): AASolidgaugeDataElement {
        innerRadius = prop
        return this
    }

    //-----------------------------------------------------
    override fun name(prop: String?): AASolidgaugeDataElement {
        name = prop
        return this
    }

    override fun y(prop: Float?): AASolidgaugeDataElement {
        y = prop
        return this
    }

    override fun color(prop: Any?): AASolidgaugeDataElement {
        color = prop
        return this
    }

    override fun dataLabels(prop: AADataLabels?): AASolidgaugeDataElement {
        dataLabels = prop
        return this
    }

    override fun marker(prop: AAMarker?): AASolidgaugeDataElement {
        marker = prop
        return this
    }
}