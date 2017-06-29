package com.hanbit.oop.service;

public class SSNService {
	public String[] execute(String ssn){

		int age=0, year=0;
		String sYear="", gender="";	
		
		sYear = ssn.substring(0,2);
		year = Integer.parseInt(sYear);

		//문자열에서 주어진 인덱스값에 위치하는 문자를 추출 
		char ch = ssn.charAt(7);
		switch(ch){
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

		age = ((17-year)>=0)?2017-(year+2000)+1:2017-(year+1900)+1;
		
		String strage = age+"";
		String strgender = gender+"";
		
		String[] result = {strage, strgender};
		return result;
	}
}
