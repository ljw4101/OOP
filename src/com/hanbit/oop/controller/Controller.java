package com.hanbit.oop.controller;

import java.util.Scanner;
import com.hanbit.oop.service.CalcService;
import com.hanbit.oop.service.ClockService;
import com.hanbit.oop.service.EvenSumService;
import com.hanbit.oop.service.LeapYearService;
import com.hanbit.oop.service.LoginService;
import com.hanbit.oop.service.NumberSortService;
import com.hanbit.oop.service.OddSumService;
import com.hanbit.oop.service.SSNService;
import com.hanbit.oop.service.SigmaService;

public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CalcService serv = new CalcService();
		ClockService clock = new ClockService();
		EvenSumService even = new EvenSumService();
		LeapYearService leapyear = new LeapYearService();
		LoginService login = new LoginService();
		NumberSortService numsort = new NumberSortService();
		OddSumService odd = new OddSumService();
		SSNService ssnServ = new SSNService();
		SigmaService sigma = new SigmaService();
		
		String result = "";
		String[] resultArr;
		int resultInt = 0;
			
 		while (true) {
 			System.out.println("0.Stop, 1.BMI, 2.Clock, 3.LeapYear, 4.NumberSort, 5.Login, \n"
 					+ "6.SSN, 7.EvenSum, 8.OddSum, 9.Sigma, 10.Plus 11.Minus 12.Multi 13.Divid");
			switch (s.nextInt()) {
				case 0:
					System.out.println("stop");
					return;
					
				case 1:
					System.out.print("나의 체질량지수(BMI)는?\n");
					System.out.print("신장(cm): ");
					double height = s.nextDouble();			
					System.out.print("몸무게(kg): ");
					double weight = s.nextDouble();
		
					result = serv.calcBMI(height, weight);
					System.out.print(String.format("나의 체질량지수(BMI): %s \n", result));
					break;
				
				case 2:
					System.out.print("초를 입력하세요: ");
					int sec = s.nextInt();
					
					resultArr = clock.execute(sec);
					System.out.println(String.format("%s시간 %s분 %s초", resultArr[0], resultArr[1], resultArr[2]));
					//System.out.print(result+"\n");
					break;
					
				case 3:
					System.out.print("연도를 입력하세요\n");
					int year = s.nextInt();
					
					result = leapyear.execute(year);
					System.out.print(String.format("%s 입니다. \n", result));
					break;
					
				case 4:
					System.out.print("A 값을 입력하세요");
					int a = s.nextInt();
					System.out.print("B 값을 입력하세요");
					int b = s.nextInt();
					System.out.print("C 값을 입력하세요");
					int c = s.nextInt();
					
					resultArr = numsort.execute(a, b, c);
					System.out.println(String.format("내림차순으로 정렬된 값: %s, %s, %s", resultArr[0], resultArr[1], resultArr[2]));
					break;
					
				case 5:
					System.out.print("Login\n");
					System.out.print("ID: ");
					String id = s.next();
					System.out.print("PW: ");
					String pw = s.next();
					
					result = login.execute(id, pw);
					System.out.print(result+"\n");
					break;
				
				case 6:
					System.out.print("이름을 입력하세요\n");
					String name = s.next();
					System.out.print("주민등록변호를 입력하세요\n");
					String ssn = s.next();
					
					resultArr = ssnServ.execute(ssn);
					System.out.println(String.format("이름: %s 나이: %s 성별: %s", name, resultArr[0], resultArr[1]));
					break;
					
				case 7:
					System.out.print("숫자를 입력하세요\n");
					int numEven = s.nextInt();
					
					resultInt = even.execute(numEven); 
					System.out.print("1~"+numEven+"까지 짝수의 합은: "+resultInt+"\n");
					break;
					
				case 8: 
					System.out.print("숫자를 입력하세요\n");
					int numOdd = s.nextInt();
					
					resultInt = odd.execute(numOdd); 
					System.out.print("1~"+numOdd+"까지 홀수의 합은: "+resultInt+"\n");
					break;
				
				case 9:
					System.out.print("숫자를 입력하세요\n");
					int loopNum = s.nextInt();
					
					resultInt = sigma.execute(loopNum);
					System.out.print("1~"+loopNum+"까지 누적값은: "+resultInt+"\n");
					break;
					
				case 10: 
					System.out.print("첫번째 숫자를 입력하세요\n");	
					String plusnum1 = s.next();		
					System.out.print("두번째 숫자를 입력하세요\n");
					String plusnum2 = s.next();
					
					result = serv.calcPlus(plusnum1, plusnum2); 
					System.out.print("결과: "+result+"\n");
					break;
				
				case 11: 
					System.out.print("첫번째 숫자를 입력하세요\n");	
					String minusnum1 = s.next();		
					System.out.print("두번째 숫자를 입력하세요\n");
					String minusnum2 = s.next();
					
					result = serv.calcMinus(minusnum1, minusnum2); 
					System.out.print("결과: "+result+"\n");
					break;
				
				case 12: 
					System.out.print("첫번째 숫자를 입력하세요\n");	
					String miutinum1 = s.next();		
					System.out.print("두번째 숫자를 입력하세요\n");
					String miutinum2 = s.next();
					
					result = serv.calcMulti(miutinum1, miutinum2); 
					System.out.print("결과: "+result+"\n");
					break;
				
				case 13: 
					System.out.print("첫번째 숫자를 입력하세요\n");	
					String divnum1 = s.next();		
					System.out.print("두번째 숫자를 입력하세요\n");
					String divnum2 = s.next();
					
					result = serv.calcDivid(divnum1, divnum2); 
					System.out.print("결과: "+result+"\n");
					break;
			}
		}
	}
}