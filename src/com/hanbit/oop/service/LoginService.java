package com.hanbit.oop.service;

public class LoginService {
		//상수선언
		public static final String USER_ID = "hanbit";
		public static final String USER_PW = "hanbit";
			
		public String execute(String id, String pw){
			String result = "";
			
			if(!id.equals(USER_ID)){
				result = "존재하지 않는 ID입니다.";
				
			}else if(!pw.equals(USER_PW)){
				result = "패스워드가 알맞지 않습니다.";
				     
			}else{
				result = "로그인 성공!!\n" + id + "님 반갑습니다.";
			}
			
			return result;
		}
}
