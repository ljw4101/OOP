package com.hanbit.oop.controller;


import javax.swing.*;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;

public class GradeController {
	public static void main(String[] args) {

		GradeBean bean = new GradeBean();
		GradeService serv = new GradeService();
				
 		while (true) {
			switch (JOptionPane.showInputDialog("0.Stop, 1.Grade")) {
				case "0":
					JOptionPane.showMessageDialog(null, "종료");
					return;
				case "1":
					bean.setName(JOptionPane.showInputDialog("Name"));
					bean.setMajor(JOptionPane.showInputDialog("Major"));
					bean.setKor(Integer.parseInt(JOptionPane.showInputDialog("Kor")));
					bean.setEng(Integer.parseInt(JOptionPane.showInputDialog("Eng")));
					bean.setMath(Integer.parseInt(JOptionPane.showInputDialog("Math")));
					
					//JOptionPane.showMessageDialog(null, serv.getGrade(bean));
					JOptionPane.showMessageDialog(null, serv.getGrade(serv.calcAvg(serv.calcTotal(bean))));
					break;
			}
		}
	}
}