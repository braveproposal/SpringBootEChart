package com.springbootechart.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

import com.springbootechart.DAO.EChartDAO;
import com.springbootechart.util.EChartUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootechart.bean.EChartData;

@RestController
@RequestMapping(value = "/echart")
public class EChartDemoController {

	private static final int DATA_COUNT = 12;

	@Autowired
	private EChartDAO eChartDAO;

	@RequestMapping("/line")
	public EChartData line() {

		EChartUtil util = new EChartUtil();

		util.setTitle("簡單的線圖");
		util.setSubTitle("子標題");

		// X軸
		util.setXData(getXAxis(DATA_COUNT));

		// 數據
		util.addLine("線段1", "", createData(DATA_COUNT));
		util.addLine("線段2", "", createData(DATA_COUNT));

		return util.getData();
	}

	@RequestMapping("/bar")
	public EChartData bar() {

		EChartUtil util = new EChartUtil();

		util.setTitle("簡單的柱圖");
		util.setSubTitle("子標題");

		// X軸
		util.setXData(eChartDAO.listPUnit());

		// 數據
		util.addBar("件數", "", eChartDAO.listAll());
		util.addBar("受傷", "test", eChartDAO.listHurt());
		util.addBar("死亡", "test", eChartDAO.listDead());

		return util.getData();
	}

	@RequestMapping("/lineAndBar")
	public EChartData lineAndBar() {

		EChartUtil util = new EChartUtil();

		util.setTitle("簡單的線圖和柱圖");
		util.setSubTitle("子標題");

		// X軸
		util.setXData(getXAxis(DATA_COUNT));

		// 數據
		util.addLine("線段1", "", createData(DATA_COUNT));
		util.addBar("柱1", "", createData(DATA_COUNT));

		return util.getData();
	}

	@RequestMapping("/pie")
	public EChartData pie() {

		EChartUtil util = new EChartUtil();

		util.setTitle("圓餅圖例子");

		// 數據
		util.addPie("提示文字", createMapData(5));

		return util.getData();
	}

	private List<Integer> createData(int count) {
		List<Integer> data = new ArrayList<>();

		for (int j = 0; j < count; j++) {
			data.add(new Random().nextInt());
		}
		return data;
	}

	private List<String> getXAxis(int count) {
		List<String> list = new ArrayList<>();
		for (int j = 1; j <= count; j++) {
			list.add(j + "月");
		}

		return list;
	}

	/**
	 * 構建圓餅圖的數據
	 *
	 * @param count
	 * @return
	 */
	private LinkedHashMap<String, Float> createMapData(int count) {
		LinkedHashMap<String, Float> result = new LinkedHashMap<>(count);

		for (int j = 1; j <= count; j++) {
			result.put(j + "月", new Random().nextFloat());
		}

		return result;
	}
}

