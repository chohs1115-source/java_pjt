package com.office.methodex;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		//1안 : return값 반환받기
		float rst = calculator.addOperator(10, 20);
		System.out.println("rst: " + rst);
		
		//2안 : 값 반환x
		//calculator.addOperator(10, 20);
		
		// calculator를 이용해서 자동차 하나 가지고 싶어요
		Object myCar = calculator.productCar();
		System.out.println("MyCar: " + myCar);

	}

}
