package com.office.member;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (systemFlag) {
			
		System.out.println("1.SING-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.SYSTEM-OUT");
		int selectedMenu = scanner.nextInt();
		
		switch (selectedMenu) {
		case 1:			//SING-UP
			System.out.println("Input new member ID");
			String memerID = scanner.next();
			
			System.out.println("Input new member PW");
			String memerPW = scanner.next();
			
			System.out.println("Input new member MAIL");
			String memerMAIL = scanner.next();
			
			System.out.println("Input new member PHONE");
			String memerPHONE = scanner.next();
			
			break;
		
		case 2:		    //SING-IN
			
			break;
			
		case 3:			//MODIFY
	
			break;
	
		case 4:			//DELETE
	
			break;
	
		case 99:		//SYSTEM-OUT
			systemFlag = false;
			System.out.println("Say good Bye~");
			break;
		}

		}
		
		
	    scanner.close();
		
	}

}
