package com.hanbit.oop.inheritance;

public class CellPhone extends Phone{
	private boolean portable;
	protected String move;
	public final static String KIND="휴대폰";		//오버라이딩
	
	
	//boolean일 경우
	public void setPortable(boolean portable){
		if(portable){
			this.setMove("이동가능");
		}else{
			this.setMove("이동 불가능");
		}
		this.portable = portable;
	}
	public boolean isPortable(){
		return portable;
	}
	
	public void setMove(String move){
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	
	@Override //조상과 같은 이름이 있으면 내 스타일 기능을 바꿔서 사용하겠다.
	public String toString(){
		return String.format("%s이기 때문데 %s 상태로  %s에게 %s번호로 %s %s를(을) 사용해서 %s(이)라고 통화했다.", 
				KIND, move, super.name, super.phoneNo, super.brand, KIND, super.call);	//super 생략가능
	}
}
