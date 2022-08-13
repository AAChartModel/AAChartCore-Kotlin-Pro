package com.aachartmodel.aacharts.aaoptionsmodelpro

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels

class AASolidgauge {
    var dataLabels: AADataLabels? = null
    var linecap: String? = null
    var stickyTracking: Boolean? = null
    var rounded: Boolean? = false
    fun dataLabels(prop: AADataLabels?): AASolidgauge {
        dataLabels = prop
        return this
    }

    fun linecap(prop: String?): AASolidgauge {
        linecap = prop
        return this
    }

    fun stickyTracking(prop: Boolean?): AASolidgauge {
        stickyTracking = prop
        return this
    }

    fun rounded(prop: Boolean?): AASolidgauge {
        rounded = prop
        return this
    }
}