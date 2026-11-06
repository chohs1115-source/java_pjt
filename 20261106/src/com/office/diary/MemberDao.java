package com.office.diary;

import java.util.HashMap;

public class MemberDao {
	
	HashMap<String, MemberDto> member = new HashMap<String, MemberDto>();
	
	public boolean isMember(String memId) {
		
		MemberDto memberDto = member.get(memId);
		
		return memberDto != null ? true : false;
	}

	public int insertNewMember(MemberDto memberDto) {
		
		member.put(memberDto.getMemId(), memberDto);
		return member.get(memberDto.getMemId()) != null ? 1 : 0;
	}

	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = member.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			return dto;
		} else {
			return null;
		}
		
	} 

	public MemberDto updatedMemberByMemId(MemberDto memberDto) {
		
		member.put(memberDto.getMemId(), memberDto);
		
		return member.get(memberDto.getMemId());
	}
	
	public MemberDto deleteMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = member.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			MemberDto deletedMemberDto = member.remove(memberDto.getMemId());
			
			if (deletedMemberDto != null) {
				return deletedMemberDto;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	

}
