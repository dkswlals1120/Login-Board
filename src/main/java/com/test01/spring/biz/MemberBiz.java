package com.test01.spring.biz;

import com.test01.spring.dto.MemberDto;

public interface MemberBiz {
	public MemberDto login(MemberDto dto);
	public int insert(MemberDto dto);
}
