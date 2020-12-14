package com.aachartmodel.aacharts.aaoptionsmodelpro

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels


class AAPackedbubble {
    var minSize: String? = null
    var maxSize: String? = null
    var zMin: Float? = null
    var zMax: Float? = null
    var layoutAlgorithm: AALayoutAlgorithm? = null
    var dataLabels: AADataLabels? = null

    fun minSize(prop: String?): AAPackedbubble {
        minSize = prop
        return this
    }

    fun maxSize(prop: String?): AAPackedbubble {
        maxSize = prop
        return this
    }

    fun zMin(prop: Float?): AAPackedbubble {
        zMin = prop
        return this
    }

    fun zMax(prop: Float?): AAPackedbubble {
        zMax = prop
        return this
    }

    fun layoutAlgorithm(prop: AALayoutAlgorithm?): AAPackedbubble {
        layoutAlgorithm = prop
        return this
    }

    fun dataLabels(prop: AADataLabels?): AAPackedbubble {
        dataLabels = prop
        return this
    }
}