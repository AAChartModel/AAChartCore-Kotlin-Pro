package com.aachartmodel.aainfographics_pro.datasource

import com.aachartmodel.aainfographics_pro.BaseApplication
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader


object AAOptionsSeriesTool {
//    var packedbubbleSeries: Array<Any>
//    var streamgraphSeries: Array<Any>
    fun getPackedbubbleSeries(): Array<Any> {
        return getJsonDataWithJsonFileName("packedbubbleSeries")
    }

    fun getStreamgraphSeries(): Array<Any> {
        return getJsonDataWithJsonFileName("streamgraphSeries")
    }

    private fun getJsonDataWithJsonFileName(jsonFileName: String): Array<Any> {
        val jsonStr = getJson("series/$jsonFileName.json")
        val gson = Gson()
        return gson.fromJson(jsonStr, arrayOf<Any>().javaClass)
    }

    fun getJson(fileName: String): String {
        val stringBuilder = StringBuilder()
        try {
            val inputStream: InputStream = BaseApplication.getContext().assets.open(fileName)
            val bufferedReader =
                BufferedReader(InputStreamReader(inputStream))
            var line: String?
            while (bufferedReader.readLine().also { line = it } != null) {
                stringBuilder.append(line)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return stringBuilder.toString()
    }
}
