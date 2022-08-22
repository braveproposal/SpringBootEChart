function connectChart() {

	for(var i in arguments){
		for(var j in arguments){
			if(i != j){
				arguments[i].connect(arguments[j]);
			}
		}
	}
}

function drawChart(divId, url, param) {
	echarts.registerLocale("TW", langTW)
	var myChart = echarts.init(document.getElementById(divId), 'macarons', {locale: 'TW'});

	$.getJSON(url, param, function(result) {
		if (result.xaxis == null) {
			drawPie(myChart, result);
		} else {
			drawBar(myChart, result);
		}
	});

	return myChart;
}

function drawBar(chart, data) {

	chart.setOption({
		tooltip : {
			trigger : 'axis',
			axisPointer : { // 坐標軸指示器，坐標軸觸發有效
				type : 'shadow' // 預設為直線，可選為：'line' | 'shadow'
			}
		},
		title : {
			text : data.title,
			subtext : data.subTitle,
			x : 'center'
		},
		legend : {
			// 1. json資料中的圖例
			data : data.legend,
			orient : 'vertical',
			left : 'left',
		},
		toolbox : {
			show : true,
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : false
				},
				magicType : {
					show : true,
					type : [ 'line', 'bar' ]
				},
				restore : {
					show : true
				},
				saveAsImage : {
					show : true
				}
			},
			left:"90%", //位置, 'left', 'center', 'right', '20%' (距離左側比例)
		},
		calculable : true,
		xAxis : [ {
			type : 'category',
			data : data.xaxis
			// 2. json資料中的橫坐標
		} ],
		yAxis : [ {
			type : 'value',
			splitArea : {
				show : true
			}
		} ],
		series : data.series
		// 3. json資料中的顯示資料
	});
}

function drawPie(chart, data) {
	var option = {
		title : {
			text : data.title,
			subtext : data.subTitle,
			x : 'center'
		},
		tooltip : {
			trigger : 'item',
			formatter : "{a} <br/>{b} : {c} ({d}%)"
		},
		legend : {
			orient : 'vertical',
			left : 'left',
			data : data.legend,
		},
		series : [ {
			name : data.name,
			type : 'pie',
			radius : '55%',
			center : [ '50%', '60%' ],
			data : data.entry,
			itemStyle : {
				emphasis : {
					shadowBlur : 10,
					shadowOffsetX : 0,
					shadowColor : 'rgba(0, 0, 0, 0.5)'
				}
			}
		} ]
	};

	chart.setOption(option);
}
