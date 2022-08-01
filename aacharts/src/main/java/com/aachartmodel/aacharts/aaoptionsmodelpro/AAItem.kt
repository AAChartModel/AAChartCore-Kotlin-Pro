package com.aachartmodel.aacharts.aaoptionsmodelpro

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels

class AAItem {
    var name: String? = null
    var data: Array<Any>? = null
    var keys: Array<String>? = null
    var dataLabels: AADataLabels? = null
    var size: Float? = null
    var innerSize: String? = null
    var allowPointSelect: Boolean? = null
    var cursor: String? = null
    var showInLegend: Boolean? = null
    var startAngle: Float? = null
    var endAngle: Float? = null
    var center: Any? = null
    fun name(prop: String?): AAItem {
        name = prop
        return this
    }

    fun data(prop: Array<Any>?): AAItem {
        data = prop
        return this
    }

    fun keys(prop: Array<String>?): AAItem {
        keys = prop
        return this
    }

    fun dataLabels(prop: AADataLabels?): AAItem {
        dataLabels = prop
        return this
    }

    fun size(prop: Float?): AAItem {
        size = prop
        return this
    }

    fun innerSize(prop: String?): AAItem {
        innerSize = prop
        return this
    }

    fun allowPointSelect(prop: Boolean?): AAItem {
        allowPointSelect = prop
        return this
    }

    fun cursor(prop: String?): AAItem {
        cursor = prop
        return this
    }

    fun showInLegend(prop: Boolean?): AAItem {
        showInLegend = prop
        return this
    }

    fun startAngle(prop: Float?): AAItem {
        startAngle = prop
        return this
    }

    fun endAngle(prop: Float?): AAItem {
        endAngle = prop
        return this
    }

    fun center(prop: Any?): AAItem {
        center = prop
        return this
    }
}