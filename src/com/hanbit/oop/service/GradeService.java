//소스 자체는 HDD에 저장됨
package com.hanbit.oop.service;

public class GradeService {
	//Field -> RAM에 저장됨
	
	private int kor, eng, math, total, avg; //<- 필드에 존재하느 변수 : 인스턴스변수 = porperty
	private String grade, name, major;
	//인스턴스 변수에 받아온 값을 넘겨준다.
	//return x : hold된 상태 : 결과값을 다음 연산을 위해 임시저장하기 위함(클래스가 일시정지 같은격)
	//return o : 완전히 종료되며 값이 날라감
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	
	//인스턴스 변수에 저장된 값을 가져오는 방법 : 읽기전용
	//area 안에 같은 이름이 없으면 가까운 더 넓은 영역에서 찾는다.
	public int getKor(){
		return kor;
		//return this.kor; : this 생략가능
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
	}
	
	public void setTotal(){
		this.total = kor+eng+math;
	}
	
	public int getTotal(){
		return total;
	}
	
	public void setAvg(){
		this.avg = total/3;
	}
	public int getAvg(){
		return avg;
	}
	
	public void setGrade(){ 
		//controller에서 호출대신 여기서 호출
		setTotal(); 
		setAvg(); 
		
		//Area:데이터 값의 변화가 있는 곳 -> 데이터 값의 변화는 CPU에서 제어 
		switch(avg/10){
			case 10: case 9:
				grade = "A : Excellent";
				break;
			case 8: 
				grade = "B : Good";
				break;
			case 7: 
				grade = "C : Not Bad";
				break;       
			case 6: 
				grade = "D : Bad";
				break;
			case 5: 
				grade = "E : Oh My God";
				break;   
			default: 
				grade = "F : Terrible";
				break;
		}

	}
	public String getGrade(){
		return grade;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setMajor(String major){
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
	
	//결과만 보여주는 역할 -> 암묵적 이름: toString
	public String toString(){
		return "========================\n"
			   +"이름	전공     	성적\n"
			   +"========================\n"
			   +name+"\t"+major+"\t"+grade;
	}
}
