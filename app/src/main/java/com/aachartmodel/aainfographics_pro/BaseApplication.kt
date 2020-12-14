package com.aachartmodel.aainfographics_pro

import android.app.Application
import android.content.Context


class BaseApplication:Application(){
    companion object {
        var  _context:Application? = null
        fun getContext():Context{
            return _context!!
        }

    }

    override fun onCreate() {
        super.onCreate()
        _context = this
    }


}