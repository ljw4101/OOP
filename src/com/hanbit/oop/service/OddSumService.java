package com.hanbit.oop.service;

public class OddSumService {
	public int execute(int number){
		int sum = 0;
		int[] arr = new int[number];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = (i+1);
		}
		
		for(int i=0; i<arr.length;i++){
			if(arr[i]%2 != 0){
				System.out.print(arr[i]+"\t");
				sum += arr[i];
			}
		}
		
		return sum;
	}
}
