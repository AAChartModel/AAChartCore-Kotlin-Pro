package com.aachartmodel.aainfographics_pro.datasource

import com.aachartmodel.aainfographics_pro.BaseApplication
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

object AAOptionsData {
    val variablepieData: Array<Any>
        get() = getJsonDataWithJsonFileName("variablepieData")

    val variwideData : Array<Any>
        get() = getJsonDataWithJsonFileName("variwideData")

    val heatmapData : Array<Any>
        get() = getJsonDataWithJsonFileName("heatmapData")

    val columnpyramidData : Array<Any>
        get() = getJsonDataWithJsonFileName("columnpyramidData")

    val treemapWithColorAxisData : Array<Any>
        get() = getJsonDataWithJsonFileName("treemapWithColorAxisData")

    val drilldownTreemapData : Array<Any>
        get() = getJsonDataWithJsonFileName("drilldownTreemapData")

    val sankeyData : Array<Any>
        get() = getJsonDataWithJsonFileName("sankeyData")

    val dependencywheelData : Array<Any>
        get() = getJsonDataWithJsonFileName("dependencywheelData")

    val sunburstData : Array<Any>
        get() = getJsonDataWithJsonFileName("sunburstData")

    val dumbbellData : Array<Any>
        get() = getJsonDataWithJsonFileName("dumbbellData")

    val vennData : Array<Any>
        get() = getJsonDataWithJsonFileName("vennData")

    val lollipopData : Array<Any>
        get() = getJsonDataWithJsonFileName("lollipopData")

    val tilemapData : Array<Any>
        get() = getJsonDataWithJsonFileName("tilemapData")

    val treemapWithLevelsData : Array<Any>
        get() = getJsonDataWithJsonFileName("treemapWithLevelsData")

    val bellcurveData : Array<Any>
        get() = getJsonDataWithJsonFileName("bellcurveData")

    val timelineData : Array<Any>
        get() = getJsonDataWithJsonFileName("timelineData")

    val itemData : Array<Any>
        get() = getJsonDataWithJsonFileName("itemData")

    val windbarbData : Array<Any>
        get() = getJsonDataWithJsonFileName("windbarbData")

    val networkgraphData : Array<Any>
        get() = getJsonDataWithJsonFileName("networkgraphData")

    val wordcloudData : Array<Any>
        get() = getJsonDataWithJsonFileName("wordcloudData")

    val eulerData : Array<Any>
        get() = getJsonDataWithJsonFileName("eulerData")

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
        get() = getJsonDataWithJsonFileName("vectorData")


    private fun getJsonDataWithJsonFileName(jsonFileName: String): Array<Any> {
        val jsonStr = getJson("data/$jsonFileName.json")
        return Gson().fromJson(jsonStr, arrayOf<Any>().javaClass)
    }

    private fun getJson(fileName: String): String {
        val stringBuilder = StringBuilder()
        try {
            val inputStream: InputStream = BaseApplication.getContext().assets.open(fileName)
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            var line: String?
            while (bufferedReader.readLine().also { line = it } != null) {
                stringBuilder.append(line)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return stringBuilder.toString()
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