//import java.util.Scanner;

public class LoopEX {

	public static void main(String[] args) {
		
		//안녕하세요.를 5회 출력하자!
		//for(초기화; 조건식; 단계)
		//for(시작; 끝; 단계)
		
		/*
		for (int i = 1; i < 10; i++) {
			System.out.println("안녕하세요.");
		}
		//i : 지역변수
		
		int i = 1;		// i : 전역변수
		for (; i < 10; i+= 2) {
			System.out.println("hello");
		}
		
		int j= 0 ;		// i : 전역변수
		for (j =5 ; j < 10; j += 2) {
			System.out.println("HHHHH");
		}
		
		for (int k = 0; k < 10; ++k) {
			System.out.println("0");
		}
		// 전위, 후위 상관없음
		*/
		
		//1부터 사용자가 입력한 정수까지의 합을 구하는 프로그램을 만들어 보자.
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 입력하세요.");
		int inputData = scanner.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= inputData; i++) {
			sum += i;
		}
		
		System.out.println("sum: " +sum);
		*/
		
		//3단 구구단 출력
		/*
		for (int i = 1; i < 10; i++) {
			System.out.println("3*" +i + "=" + (3 *i));
			System.out.printf("3 * %d = %d%n", i, (3 * i));
			System.out.println(String.format("3 * %d = %d", i, (3 * i)));
		}
		*/
		
		// 전체 구구단 (가로모드, 세로모드) 출력하자!
		// 가로모드
		/* 내 코드
		for (int c = 2; c < 10; c++) {
			for (int r = 1; r < 10; r ++) {
				int result = (c * r);
				String.format("c * %d =\t %d\t", r, (c * r));
				System.out.printf( c + " * " + r + "=" + result);
			}
		}
		*/
		
		//다른분 코드(가로 모드)
		/*
		for(int i = 1; i < 10; i++) {
	         for(int j = 1; j <10; j++) {
	            if(j == 9) {
	               System.out.printf("%d X %d = %d%n", j, i, (j*i));
	            } else {
	               System.out.printf("%d X %d = %d\t", j, i, (j*i));
	            }
	         }
	      }
		*/
		
		// 세로모드
		/*
		for (int c = 2; c < 10; c++) {
			for (int r = 1; r < 10; r ++) {
				int result = (c * r);
				String.format("c * %d = %d", r, (c * r));
				System.out.println( c + " * " + r + "=" + result);
			}
		}
		*/
		
		/*
		boolean flag = true;
		for (int i = 1; flag; i++ ) {
			System.out.println("i: " + i);
			if (i > 10)
				flag = false;
				break;
		}
		*/
		// 무한루프 조심하기
		
		/*
		for(double d = 0.0; d < 1; d += 0.1) {
			System.out.printf("d: %f \n", d);
		}
		*/
		// for문 쓸 때는 int로 쓰기
		
		// 중첩 for문 이용할 때 절대 3단계 이상을 사용하지 말자!(매우 중요)
		/*
		for(int i = 1; i < 10; i++) {
	         for(int j = 1; j <10; j++) {
	        	 for (int k = 0; k <10; k++) {
	         }
	       }
		}
		*/
		
		/* 순서대로 출력
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		/*
		for (int i=1; i <= 5; i++) {
			
			for (int j=0; j < i; j++) {
				System.out.print("*");
			}
		}
		
		System.out.println();
		*/
		
		/*
		for (int i = 1; i <= 5; i++) {
			
			for (int j=0; j <= 5 - i; j++) {
				System.out.print("*");
			}
		}
		
		System.out.println();
		*/
		
		/*
		for (int i = 1; i <= 5; i++) {
			
			for (int j=0; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k <= i; k++) {
				System.out.print("*");
			}
		}
		
		System.out.println();
		*/
		
		// 달력
		/*
		System.out.println("MON\tTUE\tWED\tTHU\tFRI\tSAT\tSUN");
		int offset = 3;
		int day = 1;
		for (int i = 0; i < 5; i++) {
			// -
			for (int j = 0; j < offset; j++) { //비어있는 날(-)
				System.out.print(String.format("%3c\t", '-'));
			} 
			
			// 날짜
			for (int j = 0; j < 7 - offset; j++) {
				if (day <= 30) {
					System.out.print(String.format("%3d\t", day));
				day ++;
				} else {
					System.out.print(String.format("%3c\t", '-'));
				}
			}
			offset = 0;
			System.out.println();
		}
		*/	
			
			
		
		
		
		
//		scanner.close();
		
}
}
