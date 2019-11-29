package com.accenture.lecture17;

public class Cylinder extends Circle{
	private double height;

	public Cylinder() {
		this(0.0, "", 0.0);
	}

	public Cylinder(double height, double radius) {
		this(height,"", radius);
	}

	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Cylinder [radius=" + super.radius + ", color=" + super.color + ", height=" + this.height +"]";
	}
	
	@Override
	public double getArea() {
		return super.getArea()*2+height*(2*Math.PI*radius);
	}
	
	public double getVolume(){
		return getArea()*height+height*(2*Math.PI*radius);
	}
}
