package com.aachartmodel.aainfographics_pro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAOptions

class ProChartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pro_chart)

        val selectedIndex = intent.getIntExtra("selectedIndex", 0)
        val aaOptions = chartConfigurationWithSelectedIndex(selectedIndex)

        val aaChartView: AAChartView = findViewById(R.id.aa_chart_view)
        aaChartView.aa_drawChartWithChartOptions(aaOptions)
    }


    private fun chartConfigurationWithSelectedIndex(selectedIndex: Int): AAOptions {
        when (selectedIndex) {
            0 -> return ProChartOptionsComposer.sankeyChart()
            1 -> return ProChartOptionsComposer.variablepieChart()
            2 -> return ProChartOptionsComposer.treemapWithLevelsDataChart()
            3 -> return ProChartOptionsComposer.variwideChart()
            4 -> return ProChartOptionsComposer.sunburstChart()
            5 -> return ProChartOptionsComposer.dependencywheelChart()
            6 -> return ProChartOptionsComposer.heatmapChart()
            7 -> return ProChartOptionsComposer.packedbubbleChart()
            8 -> return ProChartOptionsComposer.packedbubbleSplitChart()
            9 -> return ProChartOptionsComposer.vennChart()
            10 -> return ProChartOptionsComposer.dumbbellChart()
            11 -> return ProChartOptionsComposer.lollipopChart()
            12 -> return ProChartOptionsComposer.streamgraphChart()
            13 -> return ProChartOptionsComposer.columnpyramidChart()
            14 -> return ProChartOptionsComposer.tilemapChart()
            15 -> return ProChartOptionsComposer.treemapWithColorAxisDataChart()
            16 -> return ProChartOptionsComposer.drilldownTreemapChart()
            17 -> return ProChartOptionsComposer.xrangeChart()
            18 -> return ProChartOptionsComposer.vectorChart()
            19 -> return ProChartOptionsComposer.bellcurveChart()
            20 -> return ProChartOptionsComposer.timelineChart()
            21 -> return ProChartOptionsComposer.itemChart()
            22 -> return ProChartOptionsComposer.windbarbChart()
            23 -> return ProChartOptionsComposer.networkgraphChart()
            24 -> return ProChartOptionsComposer.wordcloudChart()
            25 -> return ProChartOptionsComposer.eulerChart()
        }
        return ProChartOptionsComposer.sankeyChart()
    }
}