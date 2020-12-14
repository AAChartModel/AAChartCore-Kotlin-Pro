package com.aachartmodel.aacharts.aaoptionsmodelpro

class AATreemap {
    var layoutAlgorithm: String? = null
    var allowTraversingTree: Boolean? = null

    fun layoutAlgorithm(prop: String?): AATreemap {
        layoutAlgorithm = prop
        return this
    }

    fun allowTraversingTree(prop: Boolean?): AATreemap {
        allowTraversingTree = prop
        return this
    }
}