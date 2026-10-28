package com.office.member;

public class Member {
	
	//속성(멤버필드)
	/*
	 * 아이디, 비밀번호, 메일주소, 연락처
	 */
	String memberId;
	String memberPw;
	String memberMail;
	String memberPhone;
	
	//생성자
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//기능(메서드)
	/*
	 * 회원 정보 출력 기능
	 */
	public void printInfo() {
		System.out.println("MemberID: " + memberId);
		System.out.println("MemberPW: " + memberPw);
		System.out.println("MemberMAIL: " + memberMail);
		System.out.println("MemberPHONE: " + memberPhone);
	}

}
