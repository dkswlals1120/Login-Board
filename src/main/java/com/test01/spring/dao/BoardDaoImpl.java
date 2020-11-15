package com.test01.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test01.spring.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<BoardDto> selectList() {
		List<BoardDto> boardList = new ArrayList<BoardDto> ();
		try {			
			boardList = sqlSession.selectList(NAMESPACE+"selectList");
		}catch(Exception e){
			System.out.println("[ERROR] : 'BoardDaoImpl'SELECT LIST");
			e.printStackTrace();
		}
		
		return boardList;
	}
	
	@Override
	public int insertRes(BoardDto dto) {
		int res = 0;
		try {
			res = sqlSession.insert(NAMESPACE + "insert",dto);			
		}catch(Exception e) {
			System.out.println("[ERROR] : 'BoardDaoImpl' INSERT");
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public BoardDto selectOne(int myno) {
		BoardDto dto = null;
		
		try {
			dto = sqlSession.selectOne(NAMESPACE+"selectOne",myno);
		}catch(Exception e) {
			System.out.println("[ERROR] : 'BoardDaoImpl' SELECT ONE");
			e.printStackTrace();
		}
		
		return dto;
	}

	@Override
	public int updateRes(BoardDto dto) {
		int res = 0;
		
		try {
			res = sqlSession.update(NAMESPACE+"update",dto);
		}catch(Exception e) {
			System.out.println("[ERROR] : 'BoardDaoImpl' UPDATE RES");
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int deleteRes(int myno) {
		int res = 0;
		
		try {
			res = sqlSession.delete(NAMESPACE+"delete",myno);
		}catch(Exception e) {
			System.out.println("[ERROR] : 'BoardDaoImpl' DELETE RES");
			e.printStackTrace();
		}
		
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
