package com.aachartmodel.aacharts.aaoptionsmodelpro

class AAFilter {
    var property: String? = null
    var operator: String? = null
    var value: Float? = null

    fun property(prop: String?): AAFilter {
        property = prop
        return this
    }

    fun operator(prop: String?): AAFilter {
        operator = prop
        return this
    }

    fun value(prop: Float?): AAFilter {
        value = prop
        return this
    }
}