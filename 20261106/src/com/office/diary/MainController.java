package com.office.diary;

import java.util.Scanner;

public class MainController implements Config {
	
	final private MemberService memberService;
	
	public MainController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		MemberDto memberDto;
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.SYSTEM-OUT");
			int selectMenuNum = scanner.nextInt();
			
			switch (selectMenuNum) {
			case SIGN_UP:
				
				System.out.println("Input new member ID");
				memId = scanner.next();
				
				System.out.println("Input new member PW");
				memPw = scanner.next();
				
				// 비밀번호 4자리, 여기서 해도 되나?
				if (memPw.length() >= 4) {
					System.out.println("적합");
				} else {
					System.out.println("부적합, 4자리 이상쓰기");
					memPw = scanner.next();
				}
				
				System.out.println("Input new member MAIL");
				memMail = scanner.next();
				
				System.out.println("Input new member PHONE");
				memPhone = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				memberService.signUp(memberDto);
				
				
				break;
				
				
			case SIGN_IN:
				
				System.out.println("Input new member ID");
				memId = scanner.next();
				
				System.out.println("Input new member PW");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null);
				
				memberService.signIn(memberDto);
				
				System.out.println("5.WRITE    6.SEARCH    7.LOG-OUT");
				int selectActNum = scanner.nextInt();
				
				switch (selectActNum) {
				case WRITE:
				
					System.out.println("Input new content");
					memDiary = scanner.nextLine();
					
					break;
					
				case SEARCH:
					
					break;
					
				case LOG_OUT:
					systemFlag = false;
					break;
				}
				
				
				
				
				
				
				
				break;
				
			case MODIFY:
				
				System.out.println("Input member ID!!");
				memId = scanner.next();
				
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null);
				
				boolean isAuthentication =
						memberService.doAuthenticationByMemIdAndMemPw(memberDto);
				
				if (isAuthentication) {
					System.out.println("Input member PW!!");
					memPw = scanner.next();
					
					System.out.println("Input member MAIL!!");
					memMail = scanner.next();
					
					System.out.println("Input member PHONE!!");
					memPhone = scanner.next();
					
					memberDto.setMemPw(memPw);
					memberDto.setMemMail(memMail);
					memberDto.setMemPhone(memPhone);
					
					memberService.modify(memberDto);
					
				}
				
				break;
				
			case DELETE:
				
				System.out.println("Input member ID!!");
				memId = scanner.next();
				
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null);
				
				memberService.delete(memberDto);
				
				break;
				
			case SYSTEM_OUT:
				systemFlag = false;
				break;
			}
			
			
			
			
		}
		
		
		scanner.close();
	}

}
