package java010_abstract_interface_Part02;

//추상클래스
abstract public class Shape {
private int width;
private int height;

public Shape() {
	// TODO Auto-generated constructor stub
}

public Shape(int width, int height) {
	super();
	this.width = width;
	this.height = height;
}
public int getHeight() {
	return height;
}

public int getWidth() {
	return width;
}

abstract double getArea();//추상메소드

}

