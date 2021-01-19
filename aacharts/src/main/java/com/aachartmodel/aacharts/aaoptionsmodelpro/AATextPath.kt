package com.aachartmodel.aacharts.aaoptionsmodelpro

class AATextPath {
    var enabled = false
    var attributes: Map<String, *>? = null

    fun enabled(prop: Boolean): AATextPath {
        enabled = prop
        return this
    }

    fun attributes(prop: Map<String, *>?): AATextPath {
        attributes = prop
        return this
    }
}