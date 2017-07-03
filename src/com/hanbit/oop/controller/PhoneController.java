package com.hanbit.oop.controller;

import javax.swing.*;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.IPhone;
import com.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args){
		
		Phone phone = new Phone();
		CellPhone nokia = new CellPhone();
		IPhone iphone = new IPhone();
		AndroidPhone android = new AndroidPhone();
		
		while(true){
			switch(JOptionPane.showInputDialog("0.Stop, 1.집전화, 2.휴대폰, 3.아이폰, 4.Android")){
				case "0":
					JOptionPane.showMessageDialog(null, "bye");
					return;
				case "1":
					phone.setName(JOptionPane.showInputDialog("Name"));
					phone.setPhoneNo(JOptionPane.showInputDialog("Phone Number"));
					phone.setBrand(JOptionPane.showInputDialog("Brand"));
					phone.setCall(JOptionPane.showInputDialog("Call"));
					
					JOptionPane.showMessageDialog(null, phone.toString());
					break;
				case "2":
					nokia.setPortable(true);
					nokia.setName(JOptionPane.showInputDialog("Name"));
					nokia.setPhoneNo(JOptionPane.showInputDialog("Phone Number"));
					nokia.setBrand(JOptionPane.showInputDialog("Brand"));
					nokia.setCall(JOptionPane.showInputDialog("Call"));
					
					JOptionPane.showMessageDialog(null, nokia.toString());
					break;
				case "3":
					iphone.setName(JOptionPane.showInputDialog("Name"));
					iphone.setPhoneNo(JOptionPane.showInputDialog("Phone Number"));
					iphone.setData(JOptionPane.showInputDialog("Call"));
					
					JOptionPane.showMessageDialog(null, iphone.toString());
					break;
				case "4":
					android.setSize(JOptionPane.showInputDialog("Size"));
					android.setName(JOptionPane.showInputDialog("Name"));
					android.setPhoneNo(JOptionPane.showInputDialog("Phone Number"));
					android.setData(JOptionPane.showInputDialog("Call"));
					android.setAppl("카톡");
					
					JOptionPane.showMessageDialog(null, android.toString());
					break;
			}
			
		}
	}
}
