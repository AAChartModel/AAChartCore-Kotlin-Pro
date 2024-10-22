/**
 * Copyright (C), 2015-2019
 * FileName: AAOptions
 * Author: AnAn
 * Date: 2019-08-30 14:18
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.aachartmodel.aacharts.aaoptionsmodelpro.AAColorAxis
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement

class AAOptions {
    var chart: AAChart? = null
    var title: AATitle? = null
    var subtitle: AASubtitle? = null
    var xAxis: AAXAxis? = null
    var yAxis: AAYAxis? = null
    var xAxisArray: Array<AAXAxis>? = null
    var yAxisArray: Array<AAYAxis>? = null
    var tooltip: AATooltip? = null
    var plotOptions: AAPlotOptions? = null
    var series: Array<Any>? = null
    var legend: AALegend? = null
    var pane: AAPane? = null
    var colors: Array<Any>? = null
    var defaultOptions: AALang? = null
    var touchEventEnabled: Boolean? = null

    var colorAxis: AAColorAxis? = null

    fun chart(prop: AAChart): AAOptions {
        chart = prop
        return this
    }

    fun title(prop: AATitle): AAOptions {
        title = prop
        return this
    }

    fun subtitle(prop: AASubtitle): AAOptions {
        subtitle = prop
        return this
    }

    fun xAxis(prop: AAXAxis): AAOptions {
        xAxis = prop
        return this
    }

    fun yAxis(prop: AAYAxis): AAOptions {
        yAxis = prop
        return this
    }

    fun xAxisArray(prop: Array<AAXAxis>): AAOptions {
        xAxisArray = prop
        return this
    }

    fun yAxisArray(prop: Array<AAYAxis>): AAOptions {
        yAxisArray = prop
        return this
    }

    fun tooltip(prop: AATooltip): AAOptions {
        tooltip = prop
        return this
    }

    fun plotOptions(prop: AAPlotOptions): AAOptions {
        plotOptions = prop
        return this
    }

    fun series(prop: Array<Any>): AAOptions {
        series = prop
        return this
    }

    fun legend(prop: AALegend): AAOptions {
        legend = prop
        return this
    }

    fun pane(prop: AAPane?): AAOptions {
        pane = prop
        return this
    }

    fun colors(prop: Array<Any>?): AAOptions {
        colors = prop
        return this
    }

    fun defaultOptions(prop: AALang): AAOptions? {
        defaultOptions = prop
        return this
    }

    fun touchEventEnabled(prop: Boolean?): AAOptions {
        touchEventEnabled = prop
        return this
    }


    fun colorAxis(prop: AAColorAxis): AAOptions {
        colorAxis = prop
        return this
    }
}