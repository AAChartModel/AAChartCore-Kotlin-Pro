package com.aachartmodel.aacharts.aaoptionsmodelpro;

class AAColorAxis {
    var min: Float? = null
    var minColor: String? = null
    var maxColor: String? = null
    var dataClassElements: Array<AADataClassesElement>? = null

    fun min(prop: Float?): AAColorAxis {
        min = prop
        return this
    }

    fun minColor(prop: String?): AAColorAxis {
        minColor = prop
        return this
    }

    fun maxColor(prop: String?): AAColorAxis {
        maxColor = prop
        return this
    }

    fun dataClasses(prop: Array<AADataClassesElement>): AAColorAxis {
        dataClassElements = prop
        return this
    }
}
