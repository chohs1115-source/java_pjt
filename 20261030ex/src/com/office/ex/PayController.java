package com.office.ex;

import java.util.Scanner;

// 월급 지급 명령을 내린다
public class PayController {

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (systemFlag) {
			
			System.out.println("1.월급 지급하기    2.시스템 끝내기");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case 1:
				System.out.println("Please enter the month: ");
				int thisMonth = scanner.nextInt();
				break;
				
			case 2:
				systemFlag = false;
				System.out.println("시스템 종료!!");
				break;
			}		
		}
		
		
		scanner.close();
	}
}
