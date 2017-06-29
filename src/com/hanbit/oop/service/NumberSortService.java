package com.hanbit.oop.service;

public class NumberSortService {
	public String[] execute(int a, int b, int c){
		int max=0, mid=0, min=0;
		
		if(a>b){
			if(a>c){
				max = a;
				if(b>c){
					mid = b;
					min = c;
				}else{
					mid = c;
					min = b;
				}
			}else{
				max = c;
				mid = a;
				min = b;
			}
		}else{
			if(b>c){
				max = b;
				if(a>c){
					mid = a;
					min = c;
				}else{
					mid = c;
					min = a;
				}
			}else{
				max = c;
				mid = b;
				min = a;
			}
		}
		
		String strmax = max+"";
		String strmid = mid+"";
		String strmin = min+"";
		
		String[] result = {strmax, strmid, strmin};
		return result;
	}
}
