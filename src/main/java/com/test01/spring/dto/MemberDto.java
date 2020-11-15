package com.test01.spring.dto;

public class MemberDto {
//	MEMBERNO NUMBER PRIMARY KEY,
//	MEMBERID VARCHAR2(1000) NOT NULL,
//	MEMBERPW VARCHAR2(1000) NOT NULL,
//	MEMBERNAME VARCHAR2(1000) NOT NULL,
//	MEMBERPHONE VARCHAR2(2000) NOT NULL,
//	MEMBERADDR VARCHAR2(3000) NOT NULL
	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberPhone;
	private String memberAddr;
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int memberNo, String memberId, String memberPw, String memberName, String memberPhone,
			String memberAddr) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAddr = memberAddr;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddr() {
		return memberAddr;
	}

	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	
	
}
