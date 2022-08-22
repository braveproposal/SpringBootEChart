package com.springbootechart.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EChartData {

	//
	private List<String> legend;

	// 橫坐標
	private List<String> xaxis;

	// 顯示資料
	private List<EChartSeries> series;

	private List<EChartEntry> entry;

	private String title, subTitle, name;

	public List<EChartSeries> getSeries() {
		return series;
	}

	public void setSeries(List<EChartSeries> series) {
		this.series = series;

		if (!series.isEmpty()) {
			this.legend = extractLegend();
		}
	}

	public EChartData() {
		super();
	}

	/**
	 * @return
	 */
	private List<String> extractLegend() {
		List<String> list = new ArrayList<>();

		for (EChartSeries s : series) {
			list.add(s.getName());
		}

		return list;
	}

	public List<String> getLegend() {
		return legend;
	}

	public void setLegend(List<String> legend) {
		this.legend = legend;
	}

	public List<String> getXaxis() {
		return xaxis;
	}

	public void setXaxis(List<String> xaxis) {
		this.xaxis = xaxis;
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

	public void setData(LinkedHashMap<String, Float> data) {
		setEntry(map2entry(data));
		this.legend = new ArrayList<>(data.keySet());
	}

	private List<EChartEntry> map2entry(LinkedHashMap<String, Float> data) {
		List<EChartEntry> list = new ArrayList<>();

		Iterator<Entry<String, Float>> iterator = data.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Float> entry = (Map.Entry<String, Float>) iterator.next();
			EChartEntry e = new EChartEntry();

			e.name = entry.getKey();
			e.value = entry.getValue();

			list.add(e);

		}

		return list;
	}

	public List<EChartEntry> getEntry() {
		return entry;
	}

	public void setEntry(List<EChartEntry> entry) {
		this.entry = entry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

