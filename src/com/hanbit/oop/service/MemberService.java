package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public class MemberService {
	//business logic만 정의
	
	//MemberBean member = new MemberBean; 
	//초기화 :안하는 이유: CPU가 실행하는 영역은 area인데 이곳은 Ram이 활동하는 fleid영역
	
	//field에 값을 두지 않는다(변수선언X) 
	//그러나 instance변수 초기화가 필요하는 경우엔 생성자를 사용한다.
	
	//DB가 없으므로 field에 정의 필요 
	MemberBean session;
	//RAM->임시storage. 연산은 CPU만 한다.
	//생성자 : instance 변수를 initalizing
	public MemberService(){
		session = new MemberBean();
	}

	public String getGender(MemberBean member){
		//MemberBean member = new MemberBean; 
		//초기화 :안하는 이유: getGender호출하면서 ram에 담겨있는 값이 초기화되면서 날라감.
		
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
	
	public String getAge(MemberBean member){
		int year = Integer.parseInt(member.getSSN().substring(0,2));
		String age = String.valueOf(((17-year)>=0)?2017-(year+2000)+1:2017-(year+1900)+1);		
		
		return age;
	}
	
	public String join(MemberBean member){
		//session 에다가 회원가입시 입력한 정보를 저장하는 소스 
		session = member; //주소값을 넘겨준거라 로그인 값으로 변경됨 
						  //따라서 초기화 필요 MemberController.java의 38 line
		return "환영합니다."+session.getName();
	}

	public String login(MemberBean member){
		return (session.getId().equals(member.getId())&&session.getPw().equals(member.getPw()))?
				session.getName()+"("+getGender(session)+", "+getAge(session)+"세)":"로그인실패";
	}
}
