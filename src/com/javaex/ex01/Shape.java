package com.javaex.ex01;

public abstract class Shape {
	
	//필드
	protected String fillColor;
	
	//생성자
	public Shape() {
	}
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	//메소드gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public abstract void draw();


}


