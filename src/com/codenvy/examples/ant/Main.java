package com.codenvy.examples.ant;

abstract class Shape {
	double a;
	double b;
	Shape() {
		a=-1;
		b=-1;
	}
	Shape(double a,double b) {
		this.a = a;
		this.b = b;
	}
	abstract void area();
}
class Rectangle extends Shape {
	Rectangle(double a, double b) {
		//System.out.println("Hello");
		super(a,b);
	}
	void area() {
		System.out.println("Rectangle:"+(a*b));
	}
}
class Triangle extends Shape {
	Triangle(double a, double b){
		super(a,b);
	}
	void area() {
		System.out.println("Triangle:"+(0.5*a*b));
	}
}

public class Main {
  
	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//s.area();
		Shape r = new Rectangle(10,40);
		
		r.area();
		Shape t = new Triangle(60,30);
		
		t.area();
	}*/

}