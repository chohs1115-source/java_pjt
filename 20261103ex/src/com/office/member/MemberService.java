package com.office.member;

public class MemberService implements IMemberService {
	
	MemberDao memberDao = new MemberDao();

	@Override
	public void signUp(MemberDto memberDto) {
		
		//아이디 중복체크
		MemberDao.isMember(memberDto.getMemId());
		
		
		
		//회원가입
		
	}

	@Override
	public void signIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	
}
