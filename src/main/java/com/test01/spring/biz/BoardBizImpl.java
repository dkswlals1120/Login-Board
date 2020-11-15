package com.test01.spring.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test01.spring.dao.BoardDao;
import com.test01.spring.dto.BoardDto;

@Service
public class BoardBizImpl implements BoardBiz{
	
	@Autowired
	private BoardDao dao;
	
	@Override
	public List<BoardDto> selectList() {
		return dao.selectList();
	}

	@Override
	public int insertRes(BoardDto dto) {
		return dao.insertRes(dto);
	}

	@Override
	public BoardDto selectOne(int myno) {
		return dao.selectOne(myno);
	}

	@Override
	public int updateRes(BoardDto dto) {
		return dao.updateRes(dto);
	}

	@Override
	public int deleteRes(int myno) {
		return dao.deleteRes(myno);
	}



	
}
