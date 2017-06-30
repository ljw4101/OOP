package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

public class GradeService {
	
	
	GradeBean session;
	public GradeService(){
		session = new GradeBean();
	}
	
	public int calcTotal(GradeBean g){
		return g.getKor()+ g.getEng()+ g.getMath();
	}
	
	public int calcAvg(int total){
		return total/3;
	}
	
	public String getGrade(int avg){
	//public String getGrade(GradeBean g){
		
		String grade = "";
		switch(avg/10){
		//switch(((g.getKor()+ g.getEng()+ g.getMath())/3)/10){
			case 10: case 9:
				grade = "A : Excellent";
				break;
			case 8: 
				grade = "B : Good";
				break;
			case 7: 
				grade = "C : Not Bad";
				break;       
			case 6: 
				grade = "D : Bad";
				break;
			case 5: 
				grade = "E : Oh My God";
				break;   
			default: 
				grade = "F : Terrible";
				break;
		}
		return grade;
	}
}
