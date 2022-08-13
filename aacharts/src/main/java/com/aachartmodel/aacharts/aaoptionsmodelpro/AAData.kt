package com.aachartmodel.aacharts.aaoptionsmodelpro

class AAData {
    var csv: String? = null
    var parsed: String? = null
    fun csv(prop: String?): AAData {
        csv = prop
        return this
    }

    fun parsed(prop: String?): AAData {
        parsed = prop
        return this
    }
}