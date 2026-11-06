package com.office.diary;

public class MainClass {

	public static void main(String[] args) {

		MemberContainer.getInstance()
		.getMemberController()
		.execute();
	}

}