package com.aachartmodel.aacharts.aaoptionsmodelpro

class AALayoutAlgorithm {
    var gravitationalConstant: Float? = null
    var splitSeries: Boolean? = null
    var seriesInteraction: Boolean? = null
    var dragBetweenSeries: Boolean? = null
    var parentNodeLimit: Boolean? = null

    fun gravitationalConstant(prop: Float?): AALayoutAlgorithm {
        gravitationalConstant = prop
        return this
    }

    fun splitSeries(prop: Boolean?): AALayoutAlgorithm {
        splitSeries = prop
        return this
    }

    fun seriesInteraction(prop: Boolean?): AALayoutAlgorithm {
        seriesInteraction = prop
        return this
    }

    fun dragBetweenSeries(prop: Boolean?): AALayoutAlgorithm {
        dragBetweenSeries = prop
        return this
    }

    fun parentNodeLimit(prop: Boolean?): AALayoutAlgorithm {
        parentNodeLimit = prop
        return this
    }
}