package com.aachartmodel.aainfographics_pro.datasource

import com.google.gson.Gson

object AAOptionsSeries {
    val packedbubbleSeries: Array<Any>
            get() = getLocalSeries("packedbubbleSeries")

    val streamgraphSeries : Array<Any>
        get() = getLocalSeries("streamgraphSeries")



    private fun getLocalSeries(jsonFileName: String): Array<Any> {
        val jsonStr = AAJsonTool.getLocalJson("series/$jsonFileName.json")
        val gson = Gson()
        return gson.fromJson(jsonStr, arrayOf<Any>().javaClass)
    }

}

