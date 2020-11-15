package com.test01.spring.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardDto {
//	CREATE TABLE BOARD(
//			MYNO NUMBER PRIMARY KEY,
//			MYNAME VARCHAR2(1000) NOT NULL,
//			MYTITLE VARCHAR2(2000) NOT NULL,
//			MYCONTEXT VARCHAR2(2000) NOT NULL,
//			MYDATE DATE NOT NULL
//		);
	
	private int myno;
	private String myname;
	private String mytitle;
	private String mycontext;
	private Date mydate;
	
	public BoardDto() {
		super();
	}

	public BoardDto(int myno, String myname, String mytitle, String mycontext, Date mydate) {
		super();
		this.myno = myno;
		this.myname = myname;
		this.mytitle = mytitle;
		this.mycontext = mycontext;
		this.mydate = mydate;
	}

	public int getMyno() {
		return myno;
	}

	public void setMyno(int myno) {
		this.myno = myno;
	}

	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}

	public String getMytitle() {
		return mytitle;
	}

	public void setMytitle(String mytitle) {
		this.mytitle = mytitle;
	}

	public String getMycontext() {
		return mycontext;
	}

	public void setMycontext(String mycontext) {
		this.mycontext = mycontext;
	}

	public String getMydate(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(mydate);
	}

	public void setMydate(Date mydate) {		
		this.mydate = mydate;
			
	}
	
	
	
	
}
