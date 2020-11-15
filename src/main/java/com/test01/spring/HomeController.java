package com.test01.spring;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test01.spring.biz.MemberBiz;
import com.test01.spring.dto.MemberDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@Autowired
	private MemberBiz biz;
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		return "login/mvclogin";
	}
	
	@RequestMapping(value="/ajaxlogin.do",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Boolean> ajaxLogin(HttpSession session,@RequestBody MemberDto dto){
		logger.info("LOGIN");
		
		MemberDto res = biz.login(dto);
		
		boolean check = false;
		if(res != null) {
			session.setAttribute("login", res);
			check=true;
		}
		Map<String,Boolean> map = new HashMap<String,Boolean>();
		map.put("check",check);
		return map;
	}
	
	@RequestMapping("/logout.do")
	public String logOut(HttpSession session) {
		logger.info("LOGOUT");
		session.invalidate();
		
		return "redirect:loginform.do";
	}
	
	@RequestMapping("/signup.do")
	public String signUp(Model model) {
		logger.info("SIGNUP SCCREEN");
		
		return "login/mvcsignup";
	}
	
	
	//ajax를 통해 selectone을 보려면 memeberNo가 필요한데
	//confirm.do에 붙여서 넣어줄 수가 없다.
	
	@RequestMapping("/signupres.do")
	public void insert(Model model,MemberDto dto,HttpServletResponse response,HttpServletRequest request) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
		logger.info("SIGNUP INSERT");
		
		int res = biz.insert(dto);
		
		if(res > 0) {
			logger.info("SIGNUP SCCUESS");
			jsResponse("회원가입 성공","loginform.do",response);
		}else {
			logger.info("SIGNUP FAILED");
			jsResponse("회원가입 실패","signup.do",response);
		}
	}
	
	private void jsResponse(String msg,String url,HttpServletResponse response) throws IOException {      
		String s = "<script type='text/javascript' charset='utf-8'>"+
				"alert('"+msg+"');"+
				"location.href='"+url+"';"+
				"</script>";
		PrintWriter out = response.getWriter();
		out.print(s);
  
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
