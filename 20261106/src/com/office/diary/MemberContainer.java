package com.office.diary;

public class MemberContainer {
	
	final private MemberDao memberDao = new MemberDao();
	final private MemberService memberService = new MemberService(memberDao);
	final private MainController memberController = new MainController(memberService);
	
	private static MemberContainer memberContainer;

private MemberContainer() {}
	
	public static MemberContainer getInstance() {
		if(memberContainer == null) {
			memberContainer = new MemberContainer();
		}
		
		return memberContainer;
	}

	public MainController getMemberController() {
		return memberController;
	}

	public MemberService getMemberService() {
		return memberService;
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}
}
