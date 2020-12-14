package com.aachartmodel.aacharts.aaoptionsmodelpro

class AAColorVariation {
    var key: String? = null
    var to: Float? = null

    fun key(prop: String?): AAColorVariation {
        key = prop
        return this
    }

    fun to(prop: Float?): AAColorVariation {
        to = prop
        return this
    }
}