package com.aachartmodel.aainfographics_pro.datasource;

import com.aachartmodel.aainfographics_pro.BaseApplication
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

object AAJsonTool {
    fun getLocalJson(fileName: String): String {
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
}