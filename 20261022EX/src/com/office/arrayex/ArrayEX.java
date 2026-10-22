package com.office.arrayex;

public class ArrayEX {

	public static void main(String[] args) {
		
		/*
		 * 배열 선언
		 */
		
		 /* 
		 * 1. 데이터타입[] 배열변수명 = {...}
		 */
		int[] numbers1 = {1,2,3,4,5};
		System.out.println(numbers1[0]);
		
		/*
		 * 2. 데이터타입[] 배열변수명 = new 데이터타입[배열의 길이]
		 * 잘 안씀
		 */
		int[] numbers2 = new int[5];
		numbers2[0] =1;
		numbers2[1] =2;
		numbers2[2] =3;
		numbers2[3] =4;
		numbers2[4] =5;
		
		/*
		 * 3. 데이터타입[] 배열변수명 = new 데이터타입[]{...}
		 * 정말 안씀
		 */
		int[] numbers3 = new int[] {1,2,3,4,5};
		System.out.println(numbers3[0]);
		
		/*
		 * 배열 데이터 조회: 인덱스를 이용한 데이터 조회
		 */
		int[] scores = {80, 90, 100, 75, 60};
		System.out.println(scores[0]); 	//80
		System.out.println(scores[1]); 	//90
		System.out.println(scores[2]); 	//100
		System.out.println(scores[3]); 	//75
		System.out.println(scores[4]); 	//60
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]: %d\n", i, scores[i]);
		}
		
		
		
		
		
		
	}

}
