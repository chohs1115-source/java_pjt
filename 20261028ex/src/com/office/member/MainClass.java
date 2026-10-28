package com.office.member;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		MemberService memberService = new MemberService(new MemberDB());
		
		while (systemFlag) {
			
		System.out.println("1.SING-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.SYSTEM-OUT");
		int selectedMenu = scanner.nextInt();
		
		switch (selectedMenu) {
		case 1:												 //SING-UP
			//memberService= new MemberService();
			memberService.doSignUp(scanner);
			
			break;
		
		case 2:		   										 //SING-IN
			//memberService= new MemberService();
			memberService.doSignIn(scanner);
			
			break;
			
		case 3:												//MODIFY
	
			break;
	
		case 4:												//DELETE
	
			break;
	
		case 99:											//SYSTEM-OUT
			systemFlag = false;
			System.out.println("Say Good Bye~");
			break;
		}

		
		}
	    scanner.close();
		
	}

}
