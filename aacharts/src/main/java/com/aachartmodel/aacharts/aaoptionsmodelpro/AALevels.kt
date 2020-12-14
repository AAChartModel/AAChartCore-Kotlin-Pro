package com.aachartmodel.aacharts.aaoptionsmodelpro

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels


class AALevels {
    var borderColor: String? = null
    var borderDashStyle: String? = null
    var borderWidth: Float? = null
    var color: String? = null
    var colorByPoint: Boolean? = null
    var dataLabels: AADataLabels? = null
    var layoutAlgorithm: String? = null
    var layoutStartingDirection: String? = null
    var level: Any? = null
    var colorVariation: AAColorVariation? = null

    fun borderColor(prop: String?): AALevels {
        borderColor = prop
        return this
    }

    fun borderDashStyle(prop: String?): AALevels {
        borderDashStyle = prop
        return this
    }

    fun borderWidth(prop: Float?): AALevels {
        borderWidth = prop
        return this
    }

    fun color(prop: String?): AALevels {
        color = prop
        return this
    }

    fun colorByPoint(prop: Boolean?): AALevels {
        colorByPoint = prop
        return this
    }

    fun dataLabels(prop: AADataLabels?): AALevels {
        dataLabels = prop
        return this
    }

    fun layoutAlgorithm(prop: String?): AALevels {
        layoutAlgorithm = prop
        return this
    }

    fun layoutStartingDirection(prop: String?): AALevels {
        layoutStartingDirection = prop
        return this
    }

    fun level(prop: Any?): AALevels {
        level = prop
        return this
    }

    fun colorVariation(prop: AAColorVariation?): AALevels {
        colorVariation = prop
        return this
    }
}