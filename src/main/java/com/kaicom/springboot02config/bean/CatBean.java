package com.kaicom.springboot02config.bean;

public class CatBean {
	private String catName ;
	private String color ;
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "CatBean [catName=" + catName + ", color=" + color + "]";
	}
}
