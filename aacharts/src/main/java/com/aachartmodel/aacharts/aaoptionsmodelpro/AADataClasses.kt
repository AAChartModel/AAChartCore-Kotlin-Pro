package com.aachartmodel.aacharts.aaoptionsmodelpro

class AADataClasses {
    var from: Float? = null
    var to: Float? = null
    var color: Any? = null
    var name: String? = null

    fun from(prop: Float?): AADataClasses {
        from = prop
        return this
    }

    fun to(prop: Float?): AADataClasses {
        to = prop
        return this
    }

    fun color(prop: Any?): AADataClasses {
        color = prop
        return this
    }

    fun name(prop: String?): AADataClasses {
        name = prop
        return this
    }
}