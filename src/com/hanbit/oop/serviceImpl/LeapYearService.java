package com.hanbit.oop.serviceImpl;

public class LeapYearService {
	public String execute(int year){
		String result = "";
		if((year%4==0 && year%100 != 0) || year%400==0){
			result = "윤년";
		}else{
			result = "평년";
		}
		
		return result;
	}
}
