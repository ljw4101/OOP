package com.hanbit.oop.service;

public class SigmaService {
	public int execute(int number){
		int sum = 0, i=0;
		
		while(i<number){
			i++;
			sum += i;
		}
		
		return sum;
	}
}
