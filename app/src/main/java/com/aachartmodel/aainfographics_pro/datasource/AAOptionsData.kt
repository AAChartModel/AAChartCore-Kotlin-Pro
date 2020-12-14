package com.aachartmodel.aainfographics_pro.datasource

import com.google.gson.Gson


object AAOptionsData {
    val variablepieData: Array<Any>
        get() = getLocalData("variablepieData")

    val variwideData : Array<Any>
        get() = getLocalData("variwideData")

    val heatmapData : Array<Any>
        get() = getLocalData("heatmapData")

    val columnpyramidData : Array<Any>
        get() = getLocalData("columnpyramidData")

    val treemapWithColorAxisData : Array<Any>
        get() = getLocalData("treemapWithColorAxisData")

    val drilldownTreemapData : Array<Any>
        get() = getLocalData("drilldownTreemapData")

    val sankeyData : Array<Any>
        get() = getLocalData("sankeyData")

    val dependencywheelData : Array<Any>
        get() = getLocalData("dependencywheelData")

    val sunburstData : Array<Any>
        get() = getLocalData("sunburstData")

    val dumbbellData : Array<Any>
        get() = getLocalData("dumbbellData")

    val vennData : Array<Any>
        get() = getLocalData("vennData")

    val lollipopData : Array<Any>
        get() = getLocalData("lollipopData")

    val tilemapData : Array<Any>
        get() = getLocalData("tilemapData")

    val treemapWithLevelsData : Array<Any>
        get() = getLocalData("treemapWithLevelsData")

    val bellcurveData : Array<Any>
        get() = getLocalData("bellcurveData")

    val timelineData : Array<Any>
        get() = getLocalData("timelineData")

    val itemData : Array<Any>
        get() = getLocalData("itemData")

    val windbarbData : Array<Any>
        get() = getLocalData("windbarbData")

    val networkgraphData : Array<Any>
        get() = getLocalData("networkgraphData")

    val wordcloudData : Array<Any>
        get() = getLocalData("wordcloudData")

    val eulerData : Array<Any>
        get() = getLocalData("eulerData")

    val xrangeData: Array<Any>
        get() {
            val dataArr = ArrayList<Any>()
            for (i in 0..19) {
                val data = getSingleGroupCategoryDataElementArrayWithY(i)
                for (dataElement in data) {
                    dataArr.add(dataElement)
                }
            }
            return dataArr.toTypedArray()
        }

    val vectorData : Array<Any>
        get() = getLocalData("vectorData")


    private fun getLocalData(jsonFileName: String): Array<Any> {
        val jsonStr = AAJsonTool.getLocalJson("data/$jsonFileName.json")
        return Gson().fromJson(jsonStr, arrayOf<Any>().javaClass)
    }


    private fun getSingleGroupCategoryDataElementArrayWithY(y: Int): Array<Any> {
        val dataArr = ArrayList<Any>()
        var x = 0
        var x2 = (x + Math.random() % 10).toInt()
        for (i in 0..49) {
            val dataElementMap = mapOf(
                    "x"  to x,
                    "x2" to x2,
                    "y"  to y
            )
            dataArr.add(dataElementMap)

            x = (x2 + Math.random() * 1000).toInt()
            x2 = (x + Math.random() * 2000).toInt()
        }
        return dataArr.toTypedArray()
    }
}