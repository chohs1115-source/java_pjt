package com.office.classex04;

public class MainClass {
	
	// MainMethod 역할 이해용 코드, 억지로 작성한 것 -> 1)
	public void printHello() {
		System.out.println("Hello~");
	}

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.goForward();
		car1.goBack();
		
		// 1) 새로 객체 생성하고 실행해야 함
		MainClass mainClass = new MainClass();
		mainClass.printHello();

	}

}
