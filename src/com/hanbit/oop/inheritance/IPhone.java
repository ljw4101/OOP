package com.hanbit.oop.inheritance;

public class IPhone extends CellPhone{
	protected String data;
	
	//KIND는 스마트폰이라고 오버라이딩
	public static final String KIND = "스마트폰";
	public static final String BRAND = "아이폰";
	
	public void setData(String data){
		super.setPortable(true);
		this.data = data;
	}
	public String getData(){
		return data;
	}
	
	@Override //조상과 같은 이름이 있으면 내 스타일 기능을 바꿔서 사용하겠다.
	public String toString(){ //getter(read only)에는 데이터 값을 세팅하는 코드를 넣으면 안된다.
		//아이폰은 스마트폰이기 때문에 이동가능한 삳태로 홍길동에게 010번호로 
		//이이폰을 사용해서 안녕이라고 문자를 전송했다.
		return String.format("%s은 %s이기 때문데 %s 상태로 %s에게 %s번호로 %s를(을) 사용해서 %s(이)라고 문자를 전송했다.", 
				BRAND, KIND, move, name, phoneNo, BRAND, data);
	}
}
