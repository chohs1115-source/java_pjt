package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Config config = new Config();
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(new MemberDB());
		
		if (config.IS_DEV) {
		MemberDumy memberDumy = new MemberDumy(memberDB);
		memberDumy.initMemberDumyData();
		}
		
		while (systemFlag) {
			
		System.out.println("1.SING-UP    2.SIGN-IN    3.MODIFY    4.DELETE    5.PRiNT ALL MEMBER    99.SYSTEM-OUT");
		int selectedMenu = scanner.nextInt();
		
		switch (selectedMenu) {
		case Menu.MENU_SIGN_UP:												 //SING-UP
			//memberService= new MemberService();
			memberService.doSignUp(scanner);
			
			break;
		
		case Menu.MENU_SIGN_IN:		   										 //SING-IN
			//memberService= new MemberService();
			memberService.doSignIn(scanner);
			
			break;
			
		case Menu.MENU_MODIFY:												//MODIFY
			memberService.doModify(scanner);
			break;
	
		case Menu.MENU_DELETE:												//DELETE
			memberService.doDelete(scanner);
			break;
		
		// 과제4 : 메뉴 5번 만들어서 전체 회원 정보 출력하는 기능을 구현
		case Menu.MENU_PRINT_ALL_MEMBER:
			
			HashMap<String, Member>db = memberDB.memberDB;
			
			for (String key: db.keySet()) {
				Member member = db.get(key);
				System.out.println(member.memberId);
				System.out.println(member.memberPw);
				System.out.println(member.memberMail);
				System.out.println(member.memberPhone);
			}
			
			db.values();
			
			break;
	
		case Menu.MENU_SYSTEM_OUT:											//SYSTEM-OUT
			systemFlag = false;
			System.out.println("Say Good Bye~");
			break;
		}

		
		}
	    scanner.close();
		
	}

}
