package com.springbootechart.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

import com.springbootechart.bean.EChartData;
import com.springbootechart.bean.EChartSeries;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

public class EChartUtil {

	List<EChartSeries> series;

	private List<String> xaxis;

	private String title = "", subTitle = "";

	private EChartData charData;

	public EChartUtil() {
		this.series = new ArrayList<>();

		charData = new EChartData();
	}

	public EChartData getData() {
		charData.setTitle(title);
		charData.setSeries(series);
		charData.setXaxis(xaxis);
		charData.setSubTitle(subTitle);

		return charData;
	}

	public void addLine(String name, String stack, List<?> data) {
		addData(name, "line", stack, data);
	}

	public void addBar(String name, String stack, List<?> data) {
		addData(name, "bar", stack, data);
	}

	/**
	 * @param name
	 * @param chartType bar，line，K（此時data是一個是個浮點數的陣列）
	 * @param data
	 */
	private void addData(String name, String chartType, String stack, List<?> data) {
		EChartSeries s = new EChartSeries();

		s.setName(name);
		s.setType(chartType);
		s.setStack(stack);
		s.setData(data);

		this.series.add(s);
	}

	public void setXData(List<String> xAxis) {
		this.xaxis = xAxis;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public void addPie(String name, LinkedHashMap<String, Float> data) {
		charData.setName(name);
		charData.setData(data);
	}

}

