package com.office.exception;

public class StringEX {

	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Hello");
		
		/*
		 * 문자열 출력
		 */
		//1안
		System.out.println(stringBuffer);
		
		//2안
		System.out.println(stringBuffer.toString());
		
		/*
		 * 문자열 추가
		 */
		stringBuffer.append("wolrd");
		System.out.println(stringBuffer);
		
		/*
		 * 특정 위치에 문자열 추가
		 */
		stringBuffer.insert(5, "++");
		System.out.println(stringBuffer);
		
		/*
		 * 특정 범위 삭제 - 시작은 포함, 끝은 포함x
		 */
		stringBuffer.delete(5, 10);
		System.out.println(stringBuffer);
		
		/*
		 * 특정 위치 문자 삭제
		 */
		stringBuffer.deleteCharAt(5);
		System.out.println(stringBuffer); 	//Heollold
		
		/*
		 * 문자열 교체
		 */
		stringBuffer.replace(2, 4, "LL");
		System.out.println(stringBuffer); 	//Hellold ---> HeLLod
		
		/*
		 * 문자열 뒤집기
		 */
		stringBuffer.reverse();
		System.out.println(stringBuffer); 	//HELLold ---> dloLLEH
		
		/*
		 * 문자열 길이
		 */
		stringBuffer.length();
		System.out.println(stringBuffer);
		
	}
}
