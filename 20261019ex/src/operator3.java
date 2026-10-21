
public class operator3 {

	public static void main(String[] args) {
		
		/*
		 * 비교 연산자
		 * 크고 작음을 나타내는 연산자입니다.
		 * 대소 or 동등
		 * 비교 연산자의 결과는 boolean 타입
		 */
		
		System.out.println(10 < 20); 	//true
		System.out.println(10 > 20);	//false
		
		System.out.println(10 <= 20); 	//true
		System.out.println(10 >= 20);	//false
		
		System.out.println(10 == 20); 	//false
		System.out.println(10 != 20);	//true
		
		//올바르지 않은 문법
		//System.out.println(10 === 20); 	//true
		//System.out.println(10 !== 20);	//false
		
		float num5 = 0.1f;
		double num6 = 0.1;
		//메모리 값 상태에서 형 변환 일어남
		
		System.out.println("num5: " + num5);	//0.1
		System.out.println("num6: " + num6);	//0.1
		System.out.println("num5 + num6: " + (num5 + num6));	//0.2
		
		
		System.out.println("num5 == num6: " + (num5 == num6));	//false
		System.out.println("num5 != num6: " + (num5 != num6));	//true
		
		System.out.println("num5 > num6: " + (num5 > num6));	//true
		System.out.println("num5 < num6: " + (num5 < num6));	//false
		//실수는 메모리 특성 상 정확한 값 들어갈 수 없음
		
		
		int num7 = 10;
		float num8 = 10.0f;
		
		//int + float => float + float // num7: 10.0 	num8: 10.0
		
		System.out.println("num7 > num8: " + (num7 > num8));	//false
		System.out.println("num7 >= num8: " + (num7 >= num8));	//false -> true
		System.out.println("num7 < num8: " + (num7 < num8));	//true -> false
		System.out.println("num7 <= num8: " + (num7 <= num8));	//true
		System.out.println("num7 == num8: " + (num7 == num8));	//false -> true
		System.out.println("num7 != num8: " + (num7 != num8)); 	//true -> false
		
		//비교 연산자 - 매우 중요
		//문자열 비교
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println("str1 == str2: " + (str1 == str2)); //true
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		//String은 클래스이기에 이 방식으로 정의함
		
		System.out.println("str3 == str4: " + (str3 == str4)); //false
		
		System.out.println(str3.equals(str4));	//str3 == str4  true
		//무조건 이 형태로 사용하기

	}

}
