package com.aachartmodel.aacharts.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle

class AAAxisTitle {
    var align: String? = null
    var enabled: Boolean? = null
    var margin: String? = null
    var offset //坐标轴标题相对于轴线的偏移量。默认的偏移量是根据坐标轴标签、轴线、标题的外边距动态计算的，当设置了本参数，将覆盖这些行为（动态计算行为）。
            : Float? = null
    var rotation: Float? = null
    var style: AAStyle? = null
    var text: String? = null
    var x //标题相对于水平对齐的偏移量，取值范围为：图表左边距到图表右边距，可以是负值，单位px。 默认是：0.
            : Float? = null
    var y //标题相对于垂直对齐的偏移量，取值范围：图表的上边距（chart.spacingTop ）到图表的下边距（chart.spacingBottom），可以是负值，单位是px。默认值和字体大小有关。
            : Float? = null

    fun align(prop: String?): AAAxisTitle {
        align = prop
        return this
    }

    fun enabled(prop: Boolean?): AAAxisTitle {
        enabled = prop
        return this
    }

    fun margin(prop: String?): AAAxisTitle {
        margin = prop
        return this
    }

    fun offset(prop: Float?): AAAxisTitle {
        offset = prop
        return this
    }

    fun rotation(prop: Float?): AAAxisTitle {
        rotation = prop
        return this
    }

    fun style(prop: AAStyle?): AAAxisTitle {
        style = prop
        return this
    }

    fun text(prop: String?): AAAxisTitle {
        text = prop
        return this
    }

    fun x(prop: Float?): AAAxisTitle {
        x = prop
        return this
    }

    fun y(prop: Float?): AAAxisTitle {
        y = prop
        return this
    }
}