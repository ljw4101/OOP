package com.hanbit.oop.controller;

import java.util.Scanner;
import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;
import javax.swing.*;

public class MemberController {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		MemberBean member = new MemberBean();
		MemberService serv = new MemberService();
		
		while(true){
			//System.out.println("0.Stop, 1.Join 2.Login");
			switch(JOptionPane.showInputDialog("0.Stop, 1.Join 2.Login")){
				case "0":
					JOptionPane.showMessageDialog(null, "종료");
					return;
				case "1": 
					member.setName(JOptionPane.showInputDialog("Name"));			
					member.setId(JOptionPane.showInputDialog("ID"));					
					member.setPw(JOptionPane.showInputDialog("PASSWORD"));					
					member.setSSN(JOptionPane.showInputDialog("SSN"));
					JOptionPane.showMessageDialog(null, serv.join(member));
					break;				
				case "2": 
					MemberBean tmep = new MemberBean();
					tmep.setId(JOptionPane.showInputDialog("Login ID"));
					tmep.setPw(JOptionPane.showInputDialog("Login PW"));
					JOptionPane.showMessageDialog(null, serv.login(tmep));
					break;	
			}
		}
	}
}
