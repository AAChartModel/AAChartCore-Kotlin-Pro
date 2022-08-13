package com.aachartmodel.aacharts.aaoptionsmodelpro

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip

class AAHeatmap {
    var borderWidth: Number? = null
    var nullColor: String? = null
    var colsize: Number? = null
    var tooltip: AATooltip? = null
    var data: Array<Any>? = null
    var turboThreshold: Number? = null
    fun borderWidth(prop: Number?): AAHeatmap {
        borderWidth = prop
        return this
    }

    fun nullColor(prop: String?): AAHeatmap {
        nullColor = prop
        return this
    }

    fun colsize(prop: Number?): AAHeatmap {
        colsize = prop
        return this
    }

    fun tooltip(prop: AATooltip?): AAHeatmap {
        tooltip = prop
        return this
    }

    fun data(prop: Array<Any>): AAHeatmap {
        data = prop
        return this
    }

    fun turboThreshold(prop: Number?): AAHeatmap {
        turboThreshold = prop
        return this
    }
}