package com.bdsoft.bdceo.dp.bridge.student;

//不希望抽象部分和行为有一种固定的绑定关系，而是应该可以动态联系的
public class TakeCash {

	public static void main(String[] args) {
		Bank icbc = new Icbc();
		Bank ccb = new Ccb();

		Student s = new Master();
		s.takCash(icbc);

		System.out.println();
		
		s = new Graduate();
		s.takCash(ccb);
	}
}

abstract class Student {
	abstract void takCash(Bank mt);
}

// 本科生
class Graduate extends Student {

	public Graduate() {
	}

	public void takCash(Bank m) {
		System.out.println("本科生");
		m.method();
	}
}

// 硕士生
class Master extends Student {

	public Master() {
	}

	public void takCash(Bank m) {
		System.out.println("硕士生");
		m.method();
	}
}
