package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

//결합도 낮 응집력 높
public interface GradeService {
	public int calcTotal(GradeBean g);
	public int calcAvg(int total);
	public String getGrade(int avg);
}
