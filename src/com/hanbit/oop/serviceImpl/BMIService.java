package com.hanbit.oop.serviceImpl;

public class BMIService {
	private double height, weight, calbmi;
	private String result;
	
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	
	public void setCalbmi(){
		this.calbmi = weight/((height*0.01)*(height*0.01));
	}
	public double getCalbmi(){
		return calbmi;
	}
	
	public void setBMI(){
		if(calbmi >= 30.0){
			result = "비만";
		}else if(calbmi >= 25.0){
			result = "과제중";
		}else if(calbmi >= 18.5){
			result = "정상";
		}else{
			result = "저체중";
		}
	}
	public String getBMI(){
		return result;
	}
}
