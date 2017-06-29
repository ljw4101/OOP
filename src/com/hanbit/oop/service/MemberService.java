package com.hanbit.oop.service;

public class MemberService {
	private String id, pw, loginId, loginPw, ssn, gender, name, login;
	private int age, year;
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	
	public void setPw(String pw){
		this.pw = pw;
	}
	public String getPw(){
		return pw;
	}
	
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	public String getLoginId(){
		return loginId;
	}
	
	public void setLoginPw(String loginPw){
		this.loginPw = loginPw;
	}
	public String getLoginPw(){
		return loginPw;
	}
	
	public void setSSN(String ssn){
		this.ssn = ssn;
	}
	public String getSSN(){
		return ssn;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setYear(){
		this.year = Integer.parseInt(ssn.substring(0,2));
	}
	public int getYear(){
		return year;
	}
	
	public void setAge(){
		setYear();
		this.age = ((17-year)>=0)?2017-(year+2000)+1:2017-(year+1900)+1;		
	}
	public int getAge(){
		return age;
	}
	
	public void setGender(){
		switch(ssn.charAt(7)){
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
	}
	public String getGender(){
		return gender;
	}
	
	
	
	public void setLogin(){
		if(!loginId.equals(this.id)){
			login = "존재하지 않는 ID입니다.";
			System.out.print("1");
			
		}else if(!loginPw.equals(this.pw)){
			login = "패스워드가 알맞지 않습니다.";
			System.out.print("2");
			     
		}else{
			System.out.print("3");
			setGender();
			setAge();
			login = toString();
		}
	}
	public String getLogin(){
		return login;
	}
	
	public String toString(){
		return "Welcome "+name+"("+gender+", "+age+"세)"; 
	}
}
