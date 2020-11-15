package com.test01.spring.dao;

import com.test01.spring.dto.MemberDto;

public interface MemberDao {
	
	String NAMESPACE = "myMember.";
	
	public MemberDto login(MemberDto dto);
	public int insert(MemberDto dto);
}
