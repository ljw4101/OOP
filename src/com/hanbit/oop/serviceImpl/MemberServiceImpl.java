package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;

public class MemberServiceImpl implements MemberService{
	
	MemberBean session;
	public MemberServiceImpl(){
		session = new MemberBean();
	}
	
	@Override
	public String getGender(MemberBean member) {
		String gender = "";
		switch(member.getSSN().charAt(7)){
			case '1': 
			case '3': 
				gender = "남";
				break;
			case '2': 
			case '4': 
				gender = "여";
				break;
			case '5': 
			case '6': 
				gender = "외국인";
				break;
			default:
				gender = "Wrong";
				break;
		}
		return gender;
	}

	@Override
	public String getAge(MemberBean member) {
		int year = Integer.parseInt(member.getSSN().substring(0,2));
		String age = String.valueOf(((17-year)>=0)?2017-(year+2000)+1:2017-(year+1900)+1);		
		
		return age;
	}

	@Override
	public String join(MemberBean member) {
		session = member;
		return "환영합니다."+session.getName();
	}

	@Override
	public String login(MemberBean member) {
		return (session.getId().equals(member.getId())&&session.getPw().equals(member.getPw()))?
				session.getName()+"("+getGender(session)+", "+getAge(session)+"세)":"로그인실패";
	}
	
}
