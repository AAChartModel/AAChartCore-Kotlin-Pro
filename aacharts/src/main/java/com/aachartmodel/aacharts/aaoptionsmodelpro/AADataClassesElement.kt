package com.aachartmodel.aacharts.aaoptionsmodelpro

class AADataClassesElement {
    var from: Float? = null
    var to: Float? = null
    var color: Any? = null
    var name: String? = null

    fun from(prop: Float?): AADataClassesElement {
        from = prop
        return this
    }

    fun to(prop: Float?): AADataClassesElement {
        to = prop
        return this
    }

    fun color(prop: Any?): AADataClassesElement {
        color = prop
        return this
    }

    fun name(prop: String?): AADataClassesElement {
        name = prop
        return this
    }
}