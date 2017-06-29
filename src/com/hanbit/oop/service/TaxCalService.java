package com.hanbit.oop.service;

public class TaxCalService {
	private String name;
	private int salary, tax;
	private double rate;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}
	
	public void setRate(){
		if(salary > 8800){
			rate = 0.35;
		}else if(salary > 4600){
			rate = 0.26;
		}else if(salary > 1200){
			rate = 0.17;
		}else{
			rate = 0.08;
		}
	}
	public int getRate(){
		return (int)(rate*100);
	}
	
	public void setTax(){
		this.tax = (int)(salary*rate);
	}
	public int getTax(){
		return tax;
	}
}
