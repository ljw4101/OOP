package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.MemberService;

public class MemberController {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		MemberService member = new MemberService();
		while(true){
			System.out.println("0.Stop, 1.Join 2.Login");
			switch(s.nextInt()){
				case 0:
					System.out.println("system 종료");
					return;
				case 1: 
					System.out.println("Join");
					System.out.println("이름: ");
					String name = s.next();
					member.setName(name);
					System.out.println("ID: ");
					String id = s.next();
					member.setId(id);
					System.out.println("PW: ");
					String pw = s.next();
					member.setPw(pw);
					System.out.println("SSN");
					String ssn = s.next();
					member.setSSN(ssn);
					System.out.println("회원가입 성공!!");
					break;	
				case 2: 
					System.out.println("Login");
					System.out.println("ID: ");
					String loginId = s.next();
					member.setLoginId(loginId);
					System.out.println("PW: ");
					String loginPw = s.next();
					member.setLoginPw(loginPw);
					
					member.setLogin();
					
					System.out.println(member.getLogin());
					break;	
			}
		}
	}
}
