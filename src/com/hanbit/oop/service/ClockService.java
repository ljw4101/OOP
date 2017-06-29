package com.hanbit.oop.service;

public class ClockService {
	public String[] execute(int sec){
		
		int hour = (sec/60)/60;
		int min = (sec/60)%60;
		sec = sec%60;
		
		String strhour = hour+"";
		String strmin = min+"";
		String strsec = sec+"";
		
		String[] result = {strhour, strmin, strsec};
		
		return result;
	}
}
