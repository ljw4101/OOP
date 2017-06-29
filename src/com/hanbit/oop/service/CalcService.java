package com.hanbit.oop.service;

public class CalcService {
	public String calcBMI(double height, double weight){
		double bmi = weight/((height*0.01)*(height*0.01));
		String strRes = "";
		if(bmi >= 30.0){
			strRes = "비만";
		}else if(bmi >= 25.0){
			strRes = "과제중";
		}else if(bmi >= 18.5){
			strRes = "정상";
		}else{
			strRes = "저체중";
		}
		return strRes;
	}
	
	public String calcPlus(String a, String b){
		/* 
		String result = "";
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		result = String.valueOf(num1+num2);
		return result; */
		return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
	}
	
	public String calcMinus(String a, String b){
		return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	
	public String calcMulti(String a, String b){
		return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
	}
	
	public String calcDivid(String a, String b){
		return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
	}
	
	//public String calcTax(){}
}
