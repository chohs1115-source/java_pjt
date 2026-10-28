package com.office.member;

import java.util.Scanner;

public class MemberService {
	
	//속성
	MemberDB db;
	
	//생성자
	public MemberService(MemberDB memberDB) {
		this.db = memberDB;
	}
	
	//메서드
	/*
	 * 회원가입
	 */
	public void doSignUp(Scanner scanner) {
		
		System.out.println("Input new member ID");
		String memberId = scanner.next();
		
		System.out.println("Input new member PW");
		String memberPw = scanner.next();
		
		System.out.println("Input new member MAIL");
		String memberMail = scanner.next();
		
		System.out.println("Input new member PHONE");
		String memberPhone = scanner.next();
		
		Member member = new Member(memberId, memberPw, memberMail, memberPhone);
		//MemberDB db = new MemberDB();
		
		db.memberDB.put(memberId, member);
		
		db.memberDB.get(memberId).printInfo();
	}
	
	/*
	 * 로그인
	 */
	public void doSignIn(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		//MemberDB db = new MemberDB();
		Member searchedmember = db.memberDB.get(memberId);
		
		//searchedmember: Member or null
		if (searchedmember != null) {
			
			if (searchedmember.memberPw.equals(memberPw)) {
				System.out.println("1. SIGN-IN SUCCESS!!");
				
			} else {
				System.out.println("2. SIGN-IN FAIL!!");
			}
		} else {
			System.out.println("3. SIGN-IN FAIL!!");
		}
		
	}
	
	/*
	 * 정보 수정
	 */
	public void doModify(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		System.out.println("Input member MAIL");
		String memberMail = scanner.next();
		
		System.out.println("Input member PHONE");
		String memberPhone = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberId);
		searchedMember.memberPw = memberPw;
		searchedMember.memberMail = memberMail;
		searchedMember.memberPhone = memberPhone;
		
		//로깅
		searchedMember = db.memberDB.get(memberId);
		searchedMember.printInfo();
		
	}
	
	/*
	 * 회원 탈퇴
	 */
	public void doDelete(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			db.memberDB.remove(memberId);
		}
		
	}
	
}
