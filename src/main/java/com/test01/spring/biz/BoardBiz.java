package com.test01.spring.biz;

import java.util.List;

import com.test01.spring.dto.BoardDto;

public interface BoardBiz {
	
	public List<BoardDto> selectList();
	public int insertRes(BoardDto dto);
	public BoardDto selectOne(int myno);
	public int updateRes(BoardDto dto);
	public int deleteRes(int myno);
}
