package com.test01.spring.dao;

import java.util.List;

import com.test01.spring.dto.BoardDto;

public interface BoardDao {
	
	//어떤한 mapper를 사용할지
	String NAMESPACE = "myBoard.";
	
	public List<BoardDto> selectList();
	public BoardDto selectOne(int myno);
	public int insertRes(BoardDto dto);
	public int updateRes(BoardDto dto);
	public int deleteRes(int myno);
	
}
