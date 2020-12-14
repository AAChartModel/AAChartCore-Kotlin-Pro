package com.aachartmodel.aacharts.aaoptionsmodelpro;

class AAColorAxis {
    var min: Float? = null
    var minColor: String? = null
    var maxColor: String? = null
    var dataClasses: Array<AADataClasses>? = null

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

    fun dataClasses(prop: Array<AADataClasses>): AAColorAxis {
        dataClasses = prop
        return this
    }
}
