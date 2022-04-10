package com.aachartmodel.aacharts.aaoptionsmodelpro

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels


class AALevelsElement {
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
    var height: Float? = null

    fun borderColor(prop: String?): AALevelsElement {
        borderColor = prop
        return this
    }

    fun borderDashStyle(prop: String?): AALevelsElement {
        borderDashStyle = prop
        return this
    }

    fun borderWidth(prop: Float?): AALevelsElement {
        borderWidth = prop
        return this
    }

    fun color(prop: String?): AALevelsElement {
        color = prop
        return this
    }

    fun colorByPoint(prop: Boolean?): AALevelsElement {
        colorByPoint = prop
        return this
    }

    fun dataLabels(prop: AADataLabels?): AALevelsElement {
        dataLabels = prop
        return this
    }

    fun layoutAlgorithm(prop: String?): AALevelsElement {
        layoutAlgorithm = prop
        return this
    }

    fun layoutStartingDirection(prop: String?): AALevelsElement {
        layoutStartingDirection = prop
        return this
    }

    fun level(prop: Any?): AALevelsElement {
        level = prop
        return this
    }

    fun colorVariation(prop: AAColorVariation?): AALevelsElement {
        colorVariation = prop
        return this
    }

    fun height(prop: Float): AALevelsElement {
        height = prop
        return this
    }
}