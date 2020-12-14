package com.aachartmodel.aainfographics_pro.datasource

import com.aachartmodel.aainfographics_pro.BaseApplication
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList


object AAOptionsDataTool {
//    companion object {
//        lateinit var variablepieData: Array<Any>
//        lateinit var variwideData: Array<Any>
//        lateinit var heatmapData: Array<Any>
//        lateinit var packedbubbleData: Array<Any>
//        lateinit var packedbubbleSplitData: Array<Any>
//        lateinit var columnpyramidData: Array<Any>
//        lateinit var treemapWithColorAxisData: Array<Any>
//        lateinit var drilldownTreemapData: Array<Any>
//
//        lateinit var sankeyData: Array<Any>
//        lateinit var dependencywheelData: Array<Any>
//        lateinit var sunburstData: Array<Any>
//        lateinit var dumbbellData: Array<Any>
//        lateinit var vennData: Array<Any>
//        lateinit var lollipopData: Array<Any>
//        lateinit var tilemapData: Array<Any>
//        lateinit var treemapWithLevelsData: Array<Any>
//        lateinit var xrangeData: Array<Any>
//        lateinit var vectorData: Array<Any>
//        lateinit var bellcurveData: Array<Any>
//        lateinit var timelineData: Array<Any>
//        lateinit var itemData: Array<Any>
//        lateinit var windbarbData: Array<Any>
//        lateinit var networkgraphData: Array<Any>
//        lateinit var wordcloudData: Array<Any>
//        lateinit var eulerData: Array<Any>


        fun getVariablepieData(): Array<Any> {
            return getJsonDataWithJsonFileName("variablepieData")
        }

        fun getVariwideData(): Array<Any> {
            return getJsonDataWithJsonFileName("variwideData")
        }

        fun getHeatmapData(): Array<Any> {
            return getJsonDataWithJsonFileName("heatmapData")
        }

        fun getColumnpyramidData(): Array<Any> {
            return getJsonDataWithJsonFileName("columnpyramidData")
        }

        fun getTreemapWithColorAxisData(): Array<Any> {
            return getJsonDataWithJsonFileName("treemapWithColorAxisData")
        }

        fun getDrilldownTreemapData(): Array<Any> {
            return getJsonDataWithJsonFileName("drilldownTreemapData")
        }

        fun getSankeyData(): Array<Any> {
            return getJsonDataWithJsonFileName("sankeyData")
        }

        fun getDependencywheelData(): Array<Any> {
            return getJsonDataWithJsonFileName("dependencywheelData")
        }

        fun getSunburstData(): Array<Any> {
            return getJsonDataWithJsonFileName("sunburstData")
        }

        fun getDumbbellData(): Array<Any> {
            return getJsonDataWithJsonFileName("dumbbellData")
        }

        fun getVennData(): Array<Any> {
            return getJsonDataWithJsonFileName("vennData")
        }

        fun getLollipopData(): Array<Any> {
            return getJsonDataWithJsonFileName("lollipopData")
        }

        fun getTilemapData(): Array<Any> {
            return getJsonDataWithJsonFileName("tilemapData")
        }

        fun getTreemapWithLevelsData(): Array<Any> {
            return getJsonDataWithJsonFileName("treemapWithLevelsData")
        }

        fun getXrangeData(): Array<Any> {
            val dataArr = ArrayList<Any>()
            for (i in 0..19) {
                val data = getSingleGroupCategoryDataElementArrayWithY(i)
                for (dataElement in data) {
                    dataArr.add(dataElement)
                }
            }
            return dataArr.toTypedArray()
        }

        fun getVectorData(): Array<Any> {
            return getJsonDataWithJsonFileName("vectorData")
        }

        fun getBellcurveData(): Array<Any> {
            return getJsonDataWithJsonFileName("bellcurveData")
        }

        fun getTimelineData(): Array<Any> {
            return getJsonDataWithJsonFileName("timelineData")
        }

        fun getItemData(): Array<Any> {
            return getJsonDataWithJsonFileName("itemData")
        }

        fun getWindbarbData(): Array<Any> {
            return getJsonDataWithJsonFileName("windbarbData")
        }

        fun getNetworkgraphData(): Array<Any> {
            return getJsonDataWithJsonFileName("networkgraphData")
        }

        fun getWordcloudData(): Array<Any> {
            return getJsonDataWithJsonFileName("wordcloudData")
        }

        fun getEulerData(): Array<Any> {
            return getJsonDataWithJsonFileName("eulerData")
        }

        fun getJsonDataWithJsonFileName(jsonFileName: String): Array<Any> {
            val jsonStr = getJson("data/$jsonFileName.json")
            val gson = Gson()
            return gson.fromJson(jsonStr, arrayOf<Any>().javaClass)
        }

    fun getJson(fileName: String): String {
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
                val dataElementDic = HashMap<Any?, Any?>()
                dataElementDic["x"] = x
                dataElementDic["x2"] = x2
                dataElementDic["y"] = y
                dataArr.add(dataElementDic)
                x = (x2 + Math.random() * 1000).toInt()
                x2 = (x + Math.random() * 2000).toInt()
            }
            return dataArr.toTypedArray()
        }

}
