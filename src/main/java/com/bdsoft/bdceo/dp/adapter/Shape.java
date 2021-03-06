package com.bdsoft.bdceo.dp.adapter;

public class Shape {

	// 标准适配器模式，演示
	// 将一个类的接口转换成客户希望的另外一个接口
	// 由于接口不兼容而不能一起工作的类可以一起工作
	public static void main(String[] args) {
		IShape circle = new Circle();
		circle.display();
	}
}

interface IShape {
	public void setLocation();

	public Object getLocation();

	public void display();
}

class Point implements IShape {
	public void setLocation() {
	}

	public Object getLocation() {
		return null;
	}

	public void display() {
	}
}

class Line implements IShape {
	public void setLocation() {
	}

	public Object getLocation() {
		return null;
	}

	public void display() {
	}
}

// 在新的具体实现类中拥有旧的实现引用，
// 调用新实现方法时，实际是调用了旧实现引用的相关方法
// 确保了，对外的接口调用方式不变
class Circle implements IShape {

	// 新的实现引用
	private XXCircle xxCircle;

	public Circle() {
		xxCircle = new XXCircle();
	}

	public void setLocation() {
		// 具体的实现逻辑，调用新的实现引用完成
		xxCircle.setLocationItXX();
	}

	public Object getLocation() {
		return xxCircle.getLocationItXX();
	}

	public void display() {
		xxCircle.displayItXX();
	}
}

class XXCircle {
	public void setLocationItXX() {
	}

	public Object getLocationItXX() {
		return null;
	}

	public void displayItXX() {
	}
}