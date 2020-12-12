package com.aachartmodel.aainfographics_pro

import android.app.Application
import android.content.Context


class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object {
        var context: Context? = null
            private set
    }
}