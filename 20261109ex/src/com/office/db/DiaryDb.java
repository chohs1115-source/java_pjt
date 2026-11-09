package com.office.db;

import java.util.ArrayList;
import java.util.HashMap;

import com.office.member.MemberDto;

public class DiaryDb {
	
	private static DiaryDb diaryDb;
	
	HashMap<String, MemberDto> members;
	HashMap<String, ArrayList<DiaryDto>> diaries;
	
	public DiaryDb() {}
	
	public static DiaryDb getInstance() {
		if (diaryDb == null)
			diaryDb = new DiaryDb();
		
		return diaryDb;
	}

}
