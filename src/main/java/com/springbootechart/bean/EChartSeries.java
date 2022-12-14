package com.springbootechart.bean;

import java.io.Serializable;
import java.util.List;

public class EChartSeries implements Serializable {
	private static final long serialVersionUID = 1L;

	String name;

	String type = "line";

	boolean smooth = true;

	String stack = "";

	List<?> data;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isSmooth() {
		return smooth;
	}

	public void setSmooth(boolean smooth) {
		this.smooth = smooth;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

}

