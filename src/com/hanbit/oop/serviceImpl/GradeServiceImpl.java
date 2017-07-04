package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;

public class GradeServiceImpl implements GradeService{

	GradeBean session;
	public GradeServiceImpl(){
		session = new GradeBean();
	}
	
	@Override
	public int calcTotal(GradeBean g) {
		return g.getKor()+ g.getEng()+ g.getMath();
	}

	@Override
	public int calcAvg(int total) {
		return total/3;
	}

	@Override
	public String getGrade(int avg) {
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
