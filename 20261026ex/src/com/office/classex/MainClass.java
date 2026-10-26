package com.office.classex;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		Car car1 = new Car();	//Car - 내가 만든 데이터 타입
		car1 = null;			//car1은 연결 끊기고 인자 없는 건 gc가 가져감
	    */
	
		Car car1 = new Car();
		System.out.println(car1.color);			//Black
		System.out.println(car1.size);			//5.2
		System.out.println(car1.displacement);	//2000
		
		car1.drive();
		car1.stop();
		car1.parking();
		
		car1.color = "Yellow";
		System.out.println("car1 color: " + car1.color);
		
		Car car2 = new Car();
		System.out.println("car2 color: " + car2.color);
		car2.color = "white";
		System.out.println("car2 color: " + car2.color);
		
		Car car3 = new Car();
		System.out.println("car3 color: " + car3.color);
		
		
		
	}

}
