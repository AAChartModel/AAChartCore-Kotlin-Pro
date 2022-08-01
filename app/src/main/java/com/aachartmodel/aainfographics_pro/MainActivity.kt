package com.aachartmodel.aainfographics_pro

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aachartmodel.aainfographics_pro.adapter.ChartTypesRecyclerViewAdapter
import com.aachartmodel.aainfographics_pro.adapter.ChartTypesRecyclerViewAdapter.OnItemClickListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecycleView()
    }

    private fun setupRecycleView() {
        val chartTypesArr = arrayOf(
            "sankeyChart---桑基图",
            "variablepieChart---可变宽度的饼图🍪",
            "treemapChart---树形图🌲",
            "variwideChart---可变宽度的柱形图📊",
            "sunburstChart---旭日图🌞",
            "dependencywheelChart---和弦图🎸",
            "heatmapChart---热力图🔥",
            "packedbubbleChart---气泡填充图🎈",
            "packedbubbleSplitChart---圆堆积图🎈",
            "vennChart---韦恩图",
            "dumbbellChart---哑铃图🏋",
            "lollipopChart---棒棒糖图🍭",
            "streamgraphChart---流图🌊",
            "columnpyramidChart---角锥柱形图△",
            "tilemapChart---砖块图🧱||蜂巢图🐝",
            "simpleTreemapChart---简单矩形树图🌲",
            "drilldownTreemapChart---可下钻的矩形树图🌲",
            "xrangeChart---X轴范围图||甘特图||条码图☰☲☱☴☵☶☳☷",
            "vectorChart---向量图🏹",
            "bellcurveChart---贝尔曲线图",
            "timelineChart---时序图⌚️",
            "itemChart---议会项目图",
            "windbarbChart---风羽图",
            "networkgraphChart---力导关系图✢✣✤✥",
            "wordcloudChart---词云️图☁️",
            "eulerChart---欧拉图",
            "organizationChart---组织结构图",
            "arcdiagramChart1---弧形图1",
            "arcdiagramChart2---弧形图2",
            "arcdiagramChart3---弧形图3",
            "flameChart---火焰🔥图",
            "packedbubbleSpiralChart---渐进变化的气泡🎈图",
            "itemChart2---议会项目图2",
            "itemChart3---议会项目图3"
        )

        val mChartTypesRecyclerViewAdapter = ChartTypesRecyclerViewAdapter(chartTypesArr)
        mChartTypesRecyclerViewAdapter.setItemOnClickListener(object : OnItemClickListener {
            override fun onItemClick(view: View?, position: Int) {
                gotoProChartActivity(position)
                Toast.makeText(this@MainActivity,
                    "Selected  " + chartTypesArr[position],
                    Toast.LENGTH_LONG)
                    .show()
            }
        })

        val chartTypesRecyclerView: RecyclerView = findViewById(R.id.chart_types_recycle_view)
        chartTypesRecyclerView.adapter = mChartTypesRecyclerViewAdapter
        chartTypesRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun gotoProChartActivity(position: Int) {
        val intent = Intent(this, ProChartActivity::class.java)
        intent.putExtra("selectedIndex", position)
        startActivity(intent)
    }

}