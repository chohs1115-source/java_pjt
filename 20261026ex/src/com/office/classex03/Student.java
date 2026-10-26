package com.office.classex03;

public class Student {
	
	// 속성
	String name;
	int age;
	Car car;
	
	// 생성자
	// 1안)외부에서 넣어주기
	public Student(String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	//2안)직접 생성
	/*
	 * public Student(String name, int age, String carColor, String carNumber) {
	 * this.name = name;
	 * this.age = age;
	 * this.car = new Car(carColor, carNumber);
	 * }
	 */
	
	// 기능
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		car.printInfo();
	}
}
