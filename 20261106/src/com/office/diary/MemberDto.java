package com.office.diary;

import java.util.ArrayList;

public class MemberDto {
	
	private String memId;
	private String memPw;
	private String memMail;
	private String memPhone;
	private ArrayList<String> memDiary = new ArrayList<String>();
	
	public MemberDto() {}

	public MemberDto(String memId, String memPw, String memMail, String memPhone) {
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
		this.memPhone = memPhone;
	}
	
	public MemberDto(String memId, String memPw, String memMail) {
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
	}

	// ID 
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	// PW
	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	// MAIL
	public String getMemMail() {
		return memMail;
	}

	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}

	// PHONE
	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	
	// Diary
	public ArrayList<String> getMemDiary() {
		return memDiary;
	}

	public void setMemDiary(ArrayList<String> memDiary) {
		this.memDiary = memDiary;
	}


}
