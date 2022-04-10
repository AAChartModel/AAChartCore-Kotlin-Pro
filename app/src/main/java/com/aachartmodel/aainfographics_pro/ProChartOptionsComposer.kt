package com.aachartmodel.aainfographics_pro

import com.aachartmodel.aacharts.aaoptionsmodel.AAAxisTitle
import com.aachartmodel.aacharts.aaoptionsmodelpro.*
import com.aachartmodel.aainfographics_pro.datasource.AAOptionsData
import com.aachartmodel.aainfographics_pro.datasource.AAOptionsSeries
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.AAColor
import java.util.HashMap

public class ProChartOptionsComposer {
    companion object {
        fun sankeyChart(): AAOptions {
            return AAOptions()
                    .title(AATitle()
                            .text("AAChartKit-Pro 桑基图"))
                    .colors(arrayOf(
                            AAColor.rgbaColor(137,78,36),
                            AAColor.rgbaColor(220,36,30),
                            AAColor.rgbaColor(255,206,0),
                            AAColor.rgbaColor(1,114,41),
                            AAColor.rgbaColor(0,175,173),
                            AAColor.rgbaColor(215,153,175),
                            AAColor.rgbaColor(106,114,120),
                            AAColor.rgbaColor(114,17,84),
                            AAColor.rgbaColor(0,0,0),
                            AAColor.rgbaColor(0,24,168),
                            AAColor.rgbaColor(0,160,226),
                            AAColor.rgbaColor(106,187,170)
                    ))
                    .series(arrayOf(
                            AASeriesElement()
                                    .type(AAChartType.Sankey)
                                    .keys(arrayOf("from", "to", "weight"))
                                    .data(AAOptionsData.sankeyData)))
        }

        fun variablepieChart(): AAOptions {
            val aaChart = AAChart()
                    .type(AAChartType.Variablepie)
            val aaTitle = AATitle()
                    .text("不同国家人口密度及面积对比")
            val aaSubtitle = AASubtitle()
                    .text("扇区长度（圆周方法）表示面积，宽度（纵向）表示人口密度")
            val aaTooltip = AATooltip()
                    .enabled(true)
                    .headerFormat("")
                    .pointFormat("<span style=\\\\\\\"color:{point.color}\\\\\\\\\\\\\\\">○<\\/span> <b> {point.name}<\\/b><br\\/>\\\\\\\"面积 (平方千米): <b>{point.y}<\\/b><br\\/>\\\\\\\"人口密度 (每平方千米人数): <b>{point.z}<\\/b><br\\/>\\\\\\\"")
            return AAOptions()
                    .chart(aaChart)
                    .title(aaTitle)
                    .subtitle(aaSubtitle)
                    .tooltip(aaTooltip)
                    .series(arrayOf(
                            AASeriesElement()
                                    .name("countries")
                                    .innerSize("20%")
                                    .dataLabels(AADataLabels()
                                            .enabled(false))
                                    .data(AAOptionsData.variablepieData)
                    ))
        }


        fun treemapWithLevelsDataChart(): AAOptions {
            return AAOptions()
                    .title(AATitle()
                            .text("Fruit Consumption Situation"))
                    .legend(AALegend()
                            .enabled(false))
                    .series(arrayOf(
                            AASeriesElement()
                                    .type(AAChartType.Treemap)
                                    .levels(arrayOf(
                                            AALevelsElement()
                                                    .level(1)
                                                    .layoutAlgorithm("sliceAndDice")
                                                    .dataLabels(AADataLabels()
                                                            .enabled(true)
                                                            .align(AAChartAlignType.Left)
                                                            .verticalAlign(AAChartVerticalAlignType.Top)
                                                            .style(AAStyle()
                                                                    .fontSize(15f)
                                                                    .fontWeight(AAChartFontWeightType.Bold)))
                                    ))
                                    .data(AAOptionsData.treemapWithLevelsData)))
        }


        fun variwideChart(): AAOptions {
            val aaChart = AAChart()
                    .type(AAChartType.Variwide)
            val aaTitle = AATitle()
                    .text("2016 年欧洲各国人工成本")
            val aaSubtitle = AASubtitle()
                    .text("数据来源:EUROSTAT")
            val aaXAxis: AAXAxis = AAXAxis()
                    .visible(true)
                    .type("category")
                    .title(AAAxisTitle()
                            .text(" 柱子宽度与 GDP 成正比"))
            val aaTooltip = AATooltip()
                    .enabled(true)
                    .pointFormat("人工成本： <b>€ {point.y}/h</b><br>' + 'GDP: <b>€ {point.z} 百万</b><br>")
            val aaLegend = AALegend()
                    .enabled(false)
            val seriesElementArr = arrayOf<Any>(
                    AASeriesElement()
                            .name("人工成本")
                            .data(AAOptionsData.variwideData)
                            .dataLabels(AADataLabels()
                                    .enabled(true)
                                    .format("€{point.y:.0f}"))
                            .colorByPoint(true)
            )
            return AAOptions()
                    .chart(aaChart)
                    .title(aaTitle)
                    .subtitle(aaSubtitle)
                    .xAxis(aaXAxis)
                    .tooltip(aaTooltip)
                    .legend(aaLegend)
                    .series(seriesElementArr)
        }

        fun sunburstChart(): AAOptions {
            val aaChart = AAChart()
                    .type(AAChartType.Variwide)
            val aaTitle = AATitle()
                    .text("2017 世界人口分布")
            val aaSubtitle = AASubtitle()
                    .text("数据来源:<href=\\\\\\\"https:\\/\\/en.wikipedia.org\\/wiki\\/List_of_countries_by_population_(United_Nations)\\\\\\\">Wikipedia<\\/a>")
            val aaTooltip = AATooltip()
                    .enabled(true)
                    .pointFormat("<b>{point.name}</b>的人口数量是：<b>{point.value}</b>")
            val aaLegend = AALegend()
                    .enabled(false)
            val seriesElementArr = arrayOf<Any>(
                    AASeriesElement()
                            .type(AAChartType.Sunburst)
                            .allowDrillToNode(true)
                            .levels(arrayOf(
                                    AALevelsElement()
                                            .level(2)
                                            .colorByPoint(true)
                                            .layoutAlgorithm("sliceAndDice"),
                                    AALevelsElement()
                                            .level(3)
                                            .colorVariation(AAColorVariation()
                                                    .key("brightness")
                                                    .to(-0.5f)),
                                    AALevelsElement()
                                            .level(4)
                                            .colorVariation(AAColorVariation()
                                                    .key("brightness")
                                                    .to(0.5f))
                            ))
                            .data(AAOptionsData.sunburstData)
            )
            return AAOptions()
                    .chart(aaChart)
                    .title(aaTitle)
                    .subtitle(aaSubtitle)
                    .tooltip(aaTooltip)
                    .legend(aaLegend)
                    .series(seriesElementArr)
        }

        fun dependencywheelChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .marginLeft(20f)
                            .marginRight(20f))
                    .title(AATitle()
                            .text("AAChartKit-Pro 和弦图"))
                    .series(arrayOf(
                            AASeriesElement()
                                    .type(AAChartType.Dependencywheel)
                                    .name("Dependency wheel series")
                                    .keys(arrayOf("from", "to", "weight"))
                                    .data(AAOptionsData.dependencywheelData)
                                    .dataLabels(AADataLabels()
                                            .enabled(true)
                                            .color("#333")
                                            .distance(10f)
                                            .textPath(AATextPath()
                                                    .enabled(true)
                                                    .attributes(mapOf("dy" to 5))))
                    ))
        }


        // https://jshare.com.cn/demos/hhhhiz
        fun heatmapChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Heatmap))
                    .title(AATitle()
                            .text("Sales per employee per weekday"))
                    .xAxis(AAXAxis()
                            .visible(true)
                            .categories(arrayOf(
                                    "Alexander", "Marie", "Maximilian", "Sophia",
                                    "Lukas", "Maria", "Leon", "Anna", "Tim", "Laura")))
                    .yAxis(AAYAxis()
                            .visible(true)
                            .categories(arrayOf(
                                    "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"))
                            .title(AAAxisTitle()
                                    .text("")))
                    .colorAxis(AAColorAxis()
                            .min(0f)
                            .minColor("#FFFFFF")
                            .maxColor("#7cb5ec"))
                    .legend(AALegend()
                            .enabled(true)
                            .align(AAChartAlignType.Right)
                            .layout(AAChartLayoutType.Vertical)
                            .verticalAlign(AAChartVerticalAlignType.Top)
                            .y(25f))
                    .tooltip(AATooltip()
                            .enabled(true)
                            .formatter("""function () {
 return '<b>' + this.series.xAxis.categories[this.point.x] + '</b> sold <br><b>' +
 this.point.value + '</b> items on <br><b>' + this.series.yAxis.categories[this.point.y] + '</b>';
 }"""))
                    .series(arrayOf(
                            AASeriesElement()
                                    .name("Sales")
                                    .borderWidth(1f)
                                    .data(AAOptionsData.heatmapData)
                                    .dataLabels(AADataLabels()
                                            .enabled(true)
                                            .color(AAColor.Red))))
        }


        // https://www.highcharts.com.cn/demo/highcharts/packed-bubble
        fun packedbubbleChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Packedbubble))
                    .title(AATitle()
                            .text("2014 年世界各地碳排放量"))
                    .tooltip(AATooltip()
                            .enabled(true)
                            .useHTML(true)
                            .pointFormat("<b>{point.name}:<\\/b> {point.y}m CO<sub>2<\\/sub>"))
                    .plotOptions(AAPlotOptions()
                            .packedbubble(AAPackedbubble()
                                    .minSize("30%")
                                    .maxSize("120%")
                                    .zMin(0f)
                                    .zMax(1000f)
                                    .layoutAlgorithm(AALayoutAlgorithm() //packedbubbleChart 和 packedbubbleSplitChart 只有layoutAlgorithm这一段不一样
                                            .gravitationalConstant(0.02f)
                                            .splitSeries(false))
                                    .dataLabels(AADataLabels()
                                            .enabled(true)
                                            .format("{point.name}")
                                            .filter(AAFilter()
                                                    .property("y")
                                                    .operator(">")
                                                    .value(250f)))))
                    .series(AAOptionsSeries.packedbubbleSeries)
        }

        // https://www.highcharts.com.cn/demo/highcharts/packed-bubble-split
        fun packedbubbleSplitChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Packedbubble))
                    .title(AATitle()
                            .text("2014 年世界各地碳排放量"))
                    .tooltip(AATooltip()
                            .enabled(true)
                            .useHTML(true)
                            .pointFormat("<b>{point.name}:<\\/b> {point.y}m CO<sub>2<\\/sub>"))
                    .plotOptions(AAPlotOptions()
                            .packedbubble(AAPackedbubble()
                                    .minSize("30%")
                                    .maxSize("120%")
                                    .zMin(0f)
                                    .zMax(1000f)
                                    .layoutAlgorithm(AALayoutAlgorithm() //packedbubbleChart 和 packedbubbleSplitChart 只有layoutAlgorithm这一段不一样
                                            .gravitationalConstant(0.05f)
                                            .splitSeries(true)
                                            .seriesInteraction(false)
                                            .dragBetweenSeries(true)
                                            .parentNodeLimit(true))
                                    .dataLabels(AADataLabels()
                                            .enabled(true)
                                            .format("{point.name}")
                                            .filter(AAFilter()
                                                    .property("y")
                                                    .operator(">")
                                                    .value(250f)))))
                    .series(AAOptionsSeries.packedbubbleSeries)
        }


        fun vennChart(): AAOptions {
            return AAOptions()
                    .title(AATitle()
                            .text("The Unattainable Triangle"))
                    .series(arrayOf(
                            AASeriesElement()
                                    .type(AAChartType.Venn)
                                    .data(AAOptionsData.vennData)))
        }

        fun dumbbellChart(): AAOptions {
            val aaChart = AAChart()
                    .type(AAChartType.Dumbbell)
                    .inverted(true)
            val aaTitle = AATitle()
                    .text("各国预期寿命变化")
            val aaSubtitle = AASubtitle()
                    .text("1960 vs 2018")
            val aaXAxis = AAXAxis()
                    .visible(true)
                    .type("category")
            val aaYAxis = AAYAxis()
                    .visible(true)
                    .title(AAAxisTitle()
                            .text("Life Expectancy (years)"))
            val aaTooltip = AATooltip()
                    .enabled(true)
            val aaLegend = AALegend()
                    .enabled(false)
            val seriesElementArr = arrayOf<Any>(
                    AASeriesElement()
                            .name("各国预期寿命变化")
                            .data(AAOptionsData.dumbbellData)
            )
            return AAOptions()
                    .chart(aaChart)
                    .title(aaTitle)
                    .subtitle(aaSubtitle)
                    .xAxis(aaXAxis)
                    .yAxis(aaYAxis)
                    .tooltip(aaTooltip)
                    .legend(aaLegend)
                    .series(seriesElementArr)
        }

        fun lollipopChart(): AAOptions {
            val aaChart = AAChart()
                    .type(AAChartType.Lollipop)
            val aaTitle = AATitle()
                    .text("世界十大人口国家")
            val aaSubtitle = AASubtitle()
                    .text("2018")
            val aaXAxis = AAXAxis()
                    .visible(true)
                    .type("category")
            val aaYAxis = AAYAxis()
                    .visible(true)
                    .title(AAAxisTitle()
                            .text("人口"))
            val aaTooltip = AATooltip()
                    .enabled(true)
            val aaLegend = AALegend()
                    .enabled(false)
            val seriesElementArr = arrayOf<Any>(
                    AASeriesElement()
                            .name("Population")
                            .data(AAOptionsData.lollipopData)
            )
            return AAOptions()
                    .chart(aaChart)
                    .title(aaTitle)
                    .subtitle(aaSubtitle)
                    .xAxis(aaXAxis)
                    .yAxis(aaYAxis)
                    .tooltip(aaTooltip)
                    .legend(aaLegend)
                    .series(seriesElementArr)
        }

        fun streamgraphChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Streamgraph))
                    .colors(arrayOf(
                            "#7cb5ec", "#434348", "#90ed7d", "#f7a35c", "#8085e9",
                            "rgb(255,143,179)", "rgb(255,117,153)",
                            "#f15c80", "#e4d354", "#2b908f", "#f45b5b", "#91e8e1", "#7cb5ec", "#434348", "#f7a35c",
                            "rgb(119,212,100)", "rgb(93,186,74)", "rgb(68,161,49)"))
                    .title(AATitle()
                            .text("冬季奥运会奖牌分布"))
                    .subtitle(AASubtitle()
                            .text("1924-2014"))
                    .xAxis(AAXAxis()
                            .visible(true)
                            .type("category")
                            .categories(arrayOf(
                                    "", "1924", "1928", "1932", "1936", "1940", "1944", "1948", "1952", "1956", "1960",
                                    "1964", "1968", "1972", "1976", "1980", "1984", "1988", "1992", "1994", "1998",
                                    "2002", "2006", "2010", "2014")))
                    .yAxis(AAYAxis()
                            .visible(false))
                    .tooltip(AATooltip()
                            .enabled(true))
                    .legend(AALegend()
                            .enabled(false))
                    .series(AAOptionsSeries.streamgraphSeries)
        }

        fun columnpyramidChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Columnpyramid))
                    .title(AATitle()
                            .text("世界 5 大金字塔"))
                    .xAxis(AAXAxis()
                            .visible(true)
                            .type("category"))
                    .yAxis(AAYAxis()
                            .visible(true)
                            .title(AAAxisTitle()
                                    .text("高度 (m)")))
                    .tooltip(AATooltip()
                            .enabled(true)
                            .valueSuffix(" m"))
                    .series(arrayOf(
                            AASeriesElement()
                                    .name("Height")
                                    .colorByPoint(true)
                                    .data(AAOptionsData.columnpyramidData)))
        }

        fun tilemapChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Tilemap))
                    .title(AATitle()
                            .text("U.S. states by population in 2016"))
                    .xAxis(AAXAxis()
                            .visible(false))
                    .yAxis(AAYAxis()
                            .visible(false))
                    .colorAxis(AAColorAxis()
                            .dataClasses(arrayOf(
                                    AADataClassesElement()
                                            .from(0f)
                                            .to(1000000f)
                                            .color("#F9EDB3")
                                            .name("< 1M"),
                                    AADataClassesElement()
                                            .from(1000000f)
                                            .to(5000000f)
                                            .color("#FFC428")
                                            .name("1M - 5M"),
                                    AADataClassesElement()
                                            .from(5000000f)
                                            .to(20000000f)
                                            .color("#F9EDB3")
                                            .name("5M - 20M"),
                                    AADataClassesElement()
                                            .from(20000000f)
                                            .color("#FF2371")
                                            .name("> 20M"))))
                    .tooltip(AATooltip()
                            .enabled(true)
                            .headerFormat("")
                            .valueSuffix("The population of <b> {point.name}</b> is <b>{point.value}</b>"))
                    .plotOptions(AAPlotOptions()
                            .series(AASeries()
                                    .dataLabels(AADataLabels()
                                            .enabled(true)
                                            .format("{point.hc-a2}")
                                            .color("#ffffff")
                                            .style(AAStyle()
                                                    .textOutline("none")))))
                    .series(arrayOf(
                            AASeriesElement()
                                    .name("Height")
                                    .colorByPoint(true)
                                    .data(AAOptionsData.tilemapData)))
        }


        fun treemapWithColorAxisDataChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Treemap))
                    .title(AATitle()
                            .text("矩形树图"))
                    .colorAxis(AAColorAxis()
                            .minColor("#FFFFFF")
                            .maxColor("#FF0000"))
                    .series(arrayOf(
                            AASeriesElement()
                                    .data(AAOptionsData.treemapWithColorAxisData)))
        }

        fun drilldownTreemapChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Treemap))
                    .title(AATitle()
                            .text("2012年，全球每10w人口死亡率"))
                    .subtitle(AASubtitle()
                            .text("点击下钻"))
                    .plotOptions(AAPlotOptions()
                            .treemap(AATreemap()
                                    .allowTraversingTree(true)
                                    .layoutAlgorithm("squarified")))
                    .series(arrayOf(
                            AASeriesElement()
                                    .type(AAChartType.Treemap)
                                    .levels(arrayOf(
                                            AALevelsElement()
                                                    .level(1)
                                                    .dataLabels(AADataLabels()
                                                            .enabled(true))
                                                    .borderWidth(3f)))
                                    .data(AAOptionsData.drilldownTreemapData)))
        }

        fun xrangeChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Xrange))
                    .colors(arrayOf(
                            "#7cb5ec", "#434348", "#90ed7d", "#f7a35c", "#8085e9",
                            "rgb(255,143,179)", "rgb(255,117,153)",
                            "#f15c80", "#e4d354", "#2b908f", "#f45b5b", "#91e8e1", "#7cb5ec", "#434348", "#f7a35c",
                            "rgb(119,212,100)", "rgb(93,186,74)", "rgb(68,161,49)"))
                    .title(AATitle()
                            .text(""))
                    .yAxis(AAYAxis()
                            .visible(true)
                            .title(AAAxisTitle()
                                    .text(""))
                            .reversed(true)
                            .categories(arrayOf("原型", "开发", "测试", "上线"))
                            .gridLineWidth(0f))
                    .legend(AALegend()
                            .enabled(false))
                    .plotOptions(AAPlotOptions()
                            .series(AASeries()
                                    .pointPadding(0f)
                                    .groupPadding(0f)))
                    .series(arrayOf(
                            AASeriesElement()
                                    .borderRadius(2f)
                                    .data(AAOptionsData.xrangeData)))
        }

        fun vectorChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Vector))
                    .colors(arrayOf("red"))
                    .title(AATitle()
                            .text("AAChartKit-Pro Vector plot"))
                    .series(arrayOf(
                            AASeriesElement()
                                    .name("Sample vector field")
                                    .data(AAOptionsData.vectorData)))
        }

        fun bellcurveChart(): AAOptions {
            return AAOptions()
                    .title(AATitle()
                            .text("Bell curve"))
                    .xAxisArray(arrayOf(
                            AAXAxis()
                                    .title(AAAxisTitle()
                                            .text("data")),
                            AAXAxis()
                                    .title(AAAxisTitle()
                                            .text("Bell curve"))))
                    .yAxisArray(arrayOf(
                            AAYAxis()
                                    .title(AAAxisTitle()
                                            .text("data")),
                            AAYAxis()
                                    .title(AAAxisTitle()
                                            .text("Bell curve"))))
                    .series(arrayOf(
                            AASeriesElement()
                                    .name("Bell curve")
                                    .type(AAChartType.Bellcurve)
                                    .xAxis(1)
                                    .yAxis(1)
                                    .baseSeries(1)
                                    .zIndex(-1),
                            AASeriesElement()
                                    .name("Data")
                                    .type(AAChartType.Scatter)
                                    .marker(AAMarker()
                                            .fillColor("#ffffff") //点的填充色(用来设置折线连接点的填充色)
                                            .lineWidth(2f) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                                            .lineColor("")) //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色))
                                    .data(AAOptionsData.bellcurveData)))
        }

        fun timelineChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Timeline))
                    .title(AATitle()
                            .text("人类太空探索时间表"))
                    .subtitle(AASubtitle()
                            .text("数据来源: https://en.wikipedia.org/wiki/Timeline_of_space_exploration"))
                    .yAxis(AAYAxis()
                            .visible(false))
                    .series(arrayOf(
                            AASeriesElement()
                                    .data(AAOptionsData.timelineData)))
        }


        fun itemChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Item))
                    .title(AATitle()
                            .text("AAChartKit-Pro item chart"))
                    .subtitle(AASubtitle()
                            .text("Parliament visualization"))
                    .legend(AALegend()
                            .enabled(false))
                    .series(arrayOf(
                            AASeriesElement()
                                    .name("Representatives")
                                    .keys(arrayOf("name", "y", "color", "label"))
                                    .data(AAOptionsData.itemData)
                                    .dataLabels(AADataLabels()
                                            .enabled(false))
                                    .size("170%")))
        }

        fun windbarbChart(): AAOptions {
            return AAOptions()
                    .title(AATitle()
                            .text("AAChartKit-Pro Wind Barbst"))
                    .xAxis(AAXAxis()
                            .offset(40f))
                    .series(arrayOf(
                            AASeriesElement()
                                    .type(AAChartType.Windbarb)
                                    .name("Wind")
                                    .data(AAOptionsData.windbarbData),
                            AASeriesElement()
                                    .type(AAChartType.Area)
                                    .name("Wind speed")
                                    .data(AAOptionsData.windbarbData)
                                    .keys(arrayOf("y"))
                                    .marker(AAMarker()
                                            .fillColor("#ffffff") //点的填充色(用来设置折线连接点的填充色)
                                            .lineWidth(5f) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                                            .lineColor("")) //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色))
                    ))
        }

        fun networkgraphChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Networkgraph))
                    .title(AATitle()
                            .text("The Indo-European Laungauge Tree"))
                    .subtitle(AASubtitle()
                            .text("A Force-Directed Network Graph in Highcharts"))
                    .series(arrayOf(
                            AASeriesElement()
                                    .dataLabels(AADataLabels()
                                            .enabled(false))
                                    .data(AAOptionsData.networkgraphData)))
        }

        fun wordcloudChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Wordcloud))
                    .title(AATitle()
                            .text("词云图"))
                    .series(arrayOf(
                            AASeriesElement()
                                    .data(AAOptionsData.wordcloudData)))
        }

        fun eulerChart(): AAOptions {
            return AAOptions()
                    .chart(AAChart()
                            .type(AAChartType.Venn))
                    .title(AATitle()
                            .text("欧拉图和韦恩图的关系"))
                    .tooltip(AATooltip()
                            .enabled(true)
                            .headerFormat("<span style=\\\\\\\"color:{point.color}\\\\\\\">○<\\/span>" +
                                    "<span style=\\\\\\\"font-size: 14px\\\\\\\"> {point.point.name}<\\/span><br\\/>")
                            .pointFormat("{point.description}<br><span style=\\\\\\\"font-size: 10px\\\\\\\">Source: Wikipedia<\\/span>"))
                    .series(arrayOf(
                            AASeriesElement()
                                    .data(AAOptionsData.eulerData)))
        }



        fun organizationChart(): AAOptions {
                return AAOptions()
                        .chart(AAChart() //            .height(600)
                                .inverted(true))
                        .title(AATitle()
                                .text("Highsoft 公司组织结构"))
                        .series(arrayOf(
                                AASeriesElement()
                                        .type(AAChartType.Organization)
                                        .name("Highsoft")
                                        .keys(arrayOf("from", "to"))
                                        .data(AAOptionsData.organizationData)
                                        .levels(arrayOf(
                                                AALevelsElement()
                                                        .level(0)
                                                        .color("silver")
                                                        .dataLabels(AADataLabels()
                                                                .color(AAColor.Black))
                                                        .height(25f)
                                                ,
                                                AALevelsElement()
                                                        .level(1)
                                                        .color("silver")
                                                        .dataLabels(AADataLabels()
                                                                .color(AAColor.Black))
                                                        .height(25f)
                                                ,
                                                AALevelsElement()
                                                        .level(2)
                                                        .color("#980104"),
                                                AALevelsElement()
                                                        .level(4)
                                                        .color("#359154")
                                        ))
                                        .nodes(AAOptionsData.organizationNodesData)
                                        .colorByPoint(false)
                                        .color("#007ad0")
                                        .dataLabels(AADataLabels()
                                                .color(AAColor.White))
                                                    .borderColor(AAColor.White)
                                        .nodeWidth(65f)))
                        .tooltip(AATooltip()
                                .outside(true)
                        )
        }

        //https://www.highcharts.com/docs/chart-and-series-types/arc-diagram
        fun arcdiagramChart1(): AAOptions {
                return AAOptions()
                        .colors(arrayOf(
                                "#293462", "#a64942", "#fe5f55", "#fff1c1", "#5bd1d7", "#ff502f", "#004d61",
                                "#ff8a5c", "#fff591", "#f5587b", "#fad3cf", "#a696c8", "#5BE7C4", "#266A2E", "#593E1A"
                        ))
                        .title(AATitle()
                                .text("Main train connections in Europe"))
                        .series(arrayOf(
                                AASeriesElement()
                                        .keys(arrayOf("from", "to", "weight"))
                                        .type(AAChartType.Arcdiagram)
                                        .name("Train connections")
                                        .linkWeight(1)
                                        .centeredLinks(true)
                                        .dataLabels(AADataLabels()
                                                .rotation(90f)
                                                .y(30f)
                                                .align(AAChartAlignType.Left)
                                                .color(AAColor.Black))
                                        .offset("65%")
                                        .data(AAOptionsData.arcdiagram1Data)))
        }

        fun arcdiagramChart2(): AAOptions {
                return AAOptions()
                        .title(AATitle()
                                .text("Highcharts Arc Diagram"))
                        .subtitle(AASubtitle()
                                .text("Arc Diagram with marker symbols"))
                        .series(arrayOf(
                                AASeriesElement()
                                        .linkWeight(1)
                                        .keys(arrayOf("from", "to", "weight"))
                                        .type(AAChartType.Arcdiagram)
                                        .marker(AAMarker()
                                                .symbol(AAChartSymbolType.Triangle.value)
                                                .lineWidth(2f)
                                                .lineColor(AAColor.White))
                                        .centeredLinks(true)
                                        .dataLabels(AADataLabels()
                                                .format("{point.fromNode.name} → {point.toNode.name}")
                                                .nodeFormat("{point.name}")
                                                .color(AAColor.Black)
                                                .linkTextPath(AATextPath()
                                                        .enabled(true)))
                                        .data(AAOptionsData.arcdiagram2Data)))
        }

        fun arcdiagramChart3(): AAOptions {
                return AAOptions()
                        .chart(AAChart()
                                .inverted(true))
                        .title(AATitle()
                                .text("Highcharts Inverted Arc Diagram"))
                        .series(arrayOf(AASeriesElement()
                                .keys(arrayOf("from", "to", "weight")) //                .centerPos("50%")
                                .type(AAChartType.Arcdiagram)
                                .dataLabels(
                                        AADataLabels()
                                                .align(AAChartAlignType.Right)
                                                .x(-20f)
                                                .y(-2f)
                                                .color("#333333")
                                                .overflow("allow")
                                                .padding(0f))
                                .offset("60%")
                                .data(AAOptionsData.arcdiagram3Data)))
        }

        fun flameChart(): AAOptions {
                return AAOptions()
                        .chart(AAChart()
                                .inverted(true))
                        .title(AATitle()
                                .align(AAChartAlignType.Left)
                                .text("Flame chart (layout: flame)"))
                        .subtitle(AASubtitle()
                                .align(AAChartAlignType.Left)
                                .text("Highcharts chart rendering process"))
                        .legend(AALegend()
                                .enabled(false))
                        .xAxisArray(arrayOf(
                                AAXAxis()
                                        .visible(false),
                                AAXAxis()
                                        .visible(false)
                                        .startOnTick(false)
                                        .endOnTick(false)
                                        .minPadding(0f)
                                        .maxPadding(0f)))
                        .yAxisArray(arrayOf(
                                AAYAxis()
                                        .visible(false),
                                AAYAxis()
                                        .visible(false)
                                        .min(0f)
                                        .maxPadding(0f)
                                        .startOnTick(false)
                                        .endOnTick(false)))
                        .series(arrayOf(
                                AASeriesElement()
                                        .type(AAChartType.Flame)
                                        .data(AAOptionsData.flameData)
                                        .yAxis(1)
                                        .xAxis(1),
                                AASeriesElement()
                                        .visible(false)
                                        .size("100%")
                                        .type(AAChartType.Sunburst)
                                        .data(AAOptionsData.sunburst2Data)
                                        .allowDrillToNode(true)
                                        .cursor("pointer")
                                        .levels(arrayOf(
                                                AALevelsElement()
                                                        .level(1) //                        .levelIsConstant(false)
                                                        .dataLabels(AADataLabels()
                                                                .enabled(false))))
                                        .dataLabels(AADataLabels()
                                                .textPath(AATextPath()
                                                        .attributes(mapOf("dy" to 5))
                                                        .enabled(true)))))
                        .tooltip(AATooltip()
                                .headerFormat("")
                                .pointFormat("selfSize of {point.name} is {point.value}"))
        }


        fun packedbubbleSpiralChart(): AAOptions {
                return AAOptions()
                        .chart(AAChart()
                                .type(AAChartType.Packedbubble) //            .height("100%")
                        )
                        .title(AATitle()
                                .text("Carbon emissions around the world (2014)"))
                        .tooltip(AATooltip()
                                .useHTML(true)
                                .pointFormat("{point.name}: {point.y}m CO2"))
                        .plotOptions(AAPlotOptions()
                                .packedbubble(AAPackedbubble()
                                        .useSimulation(false)
                                        .minSize("20%")
                                        .maxSize("80%")
                                        .dataLabels(AADataLabels()
                                                .enabled(true)
                                                .format("{point.name}")
                                                .filter(AAFilter()
                                                        .property("y")
                                                        .operator(">")
                                                        .value(250f))
                                                .style(AAStyle()
                                                        .color(AAColor.Black)
                                                        .textOutline("none")
                                                        .fontWeight(AAChartFontWeightType.Regular)))))
                        .series(AAOptionsSeries.packedbubbleSeries)
        }
    }

}