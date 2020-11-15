package com.test01.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test01.spring.biz.BoardBiz;
import com.test01.spring.dto.BoardDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BoardBiz biz;
	
	@RequestMapping("/list.do")
	public String boardList(Model model) {
		logger.info("SERVLET : SELECT LIST");
				
		model.addAttribute("boardList",biz.selectList());
		
		return "board/mvcList";
	}
	
	@RequestMapping("/insertform.do")
	public String insertForm(Model model) {
		logger.info("SERVLET : INSERT FORM" );
		
		return "board/mvcinsert";
	}
	
	@RequestMapping("/insertres.do")
	public String insertRes(BoardDto dto) {
		logger.info("SERVLET : INSERT RES");
		
		int res = biz.insertRes(dto);
		
		if(res > 0) {
			logger.info("INSERT SUCESS");
			return "redirect:list.do";
		}else {
			logger.info("INSERT FAILED");
			return "redirect:insertform.do";
		}
	
	}
	
	@RequestMapping("/detail.do")
	public String selectOne(Model model,int myno) {
		logger.info("SERVLET : SELECT ONE");
		
		model.addAttribute("dto",biz.selectOne(myno));
		
		return "board/mvcdetail";		
	}
	
	@RequestMapping("updatescreen.do")
	public String updateScreen(Model model,int myno) {
		logger.info("SERVLET : UPDATE SCREEN");
		model.addAttribute("dto",biz.selectOne(myno));
		
		return "mvcupdate";
	}
	
	@RequestMapping("updateres.do")
	public String updateRes(BoardDto dto) {
		logger.info("SERVLET : UPDATE RES");
		
		int res = biz.updateRes(dto);
		
		if(res>0) {
			logger.info("UPDATE SUCESS");
			return "redirect:detail.do?myno="+dto.getMyno();
		}else {
			logger.info("UPDATE FAILED");
			return "redirect:updatescreen.do?myno="+dto.getMyno();
		}
	}
	
	
	@RequestMapping("/deleteres.do")
	public String deleteRes(Model model,int myno) {
		logger.info("SERVLET : DELETE RES");
		
		int res = biz.deleteRes(myno);
		
		if(res>0) {
			logger.info("DELETE SUCESS");
			return "redirect:list.do";
		}else {
			logger.info("DELETE FAILED");
			return "redirect:list.do";
		}
				
	}
		
}
