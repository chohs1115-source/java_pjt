package com.office.classex04;

public class MainClass {
	
	// MainMethod 역할 이해용 코드, 억지로 작성한 것 -> 1)
	public void printHello() {
		System.out.println("Hello~");
	}

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.goForward(30); 	//전달하는 값 : 인수, 전달될 때 : 인자 / 실무 : 파라미터로 통칭
		car1.goBack();
		car1.doTest();
		
		// 1) 새로 객체 생성하고 실행해야 함
		MainClass mainClass = new MainClass();
		mainClass.printHello();

	}

}
