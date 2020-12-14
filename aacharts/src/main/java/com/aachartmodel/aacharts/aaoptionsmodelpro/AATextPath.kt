package com.aachartmodel.aacharts.aaoptionsmodelpro

class AATextPath {
    var enabled = false
    var attributes: Map<*, *>? = null

    fun enabled(prop: Boolean): AATextPath {
        enabled = prop
        return this
    }

    fun attributes(prop: Map<*, *>?): AATextPath {
        attributes = prop
        return this
    }
}