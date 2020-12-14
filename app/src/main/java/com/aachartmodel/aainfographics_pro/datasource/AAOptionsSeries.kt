package com.aachartmodel.aainfographics_pro.datasource

import com.google.gson.Gson

object AAOptionsSeries {
    val packedbubbleSeries
            = getLocalSeries("packedbubbleSeries")

    val streamgraphSeries
            = getLocalSeries("streamgraphSeries")


    private fun getLocalSeries(jsonFileName: String): Array<Any> {
        val jsonStr = AAJsonTool.getLocalJson("series/$jsonFileName.json")
        return Gson().fromJson(jsonStr, arrayOf<Any>().javaClass)
    }

}

