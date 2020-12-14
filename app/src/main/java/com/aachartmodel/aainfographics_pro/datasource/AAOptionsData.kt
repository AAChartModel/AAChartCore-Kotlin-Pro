package com.aachartmodel.aainfographics_pro.datasource

import com.google.gson.Gson


object AAOptionsData {
    val variablepieData
            = getLocalData("variablepieData")

    val variwideData
            = getLocalData("variwideData")

    val heatmapData
            = getLocalData("heatmapData")

    val columnpyramidData
            = getLocalData("columnpyramidData")

    val treemapWithColorAxisData
            = getLocalData("treemapWithColorAxisData")

    val drilldownTreemapData
            = getLocalData("drilldownTreemapData")

    val sankeyData
            = getLocalData("sankeyData")

    val dependencywheelData
            = getLocalData("dependencywheelData")

    val sunburstData
            = getLocalData("sunburstData")

    val dumbbellData
            = getLocalData("dumbbellData")

    val vennData
            = getLocalData("vennData")

    val lollipopData
            = getLocalData("lollipopData")

    val tilemapData
            = getLocalData("tilemapData")

    val treemapWithLevelsData
            = getLocalData("treemapWithLevelsData")

    val bellcurveData
            = getLocalData("bellcurveData")

    val timelineData
            = getLocalData("timelineData")

    val itemData
            = getLocalData("itemData")

    val windbarbData
            = getLocalData("windbarbData")

    val networkgraphData
            = getLocalData("networkgraphData")

    val wordcloudData
            = getLocalData("wordcloudData")

    val eulerData
            = getLocalData("eulerData")

    val xrangeData: Array<Any>
        get() {
            fun singleGroupCategoryDataElementArray(y: Int): Array<Any> {
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

            val dataArr = ArrayList<Any>()
            for (i in 0..19) {
                val data = singleGroupCategoryDataElementArray(i)
                for (dataElement in data) {
                    dataArr.add(dataElement)
                }
            }
            return dataArr.toTypedArray()
        }

    val vectorData
            = getLocalData("vectorData")


    private fun getLocalData(jsonFileName: String): Array<Any> {
        val jsonStr = AAJsonTool.getLocalJson("data/$jsonFileName.json")
        return Gson().fromJson(jsonStr, arrayOf<Any>().javaClass)
    }
}