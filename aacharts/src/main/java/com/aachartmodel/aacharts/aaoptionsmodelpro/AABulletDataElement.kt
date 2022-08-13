package com.aachartmodel.aacharts.aaoptionsmodelpro

class AABulletDataElement {
    var y: Number? = null
    var target: Number? = null
    fun y(prop: Number?): AABulletDataElement {
        y = prop
        return this
    }

    fun target(prop: Number?): AABulletDataElement {
        target = prop
        return this
    }
}