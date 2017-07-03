package com.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone{
	//BRAND 갤럭시노트
	//data 오버라이딩 해서 카톡 메시지라고 출력
	public static final String BRAND = "갤럭시노트";
	
	private String size, appl;
	
	public void setSize(String size){
		super.setPortable(true);
		this.size = size;
	}
	public String getSize(){
		return size;
	}
	public void setAppl(String appl){
		this.appl = appl;
	}
	public String getAppl(){
		return appl;
	}
	

	@Override //조상과 같은 이름이 있으면 내 스타일 기능을 바꿔서 사용하겠다.
	public String toString(){ //getter(read only)에는 데이터 값을 세팅하는 코드를 넣으면 안된다.
		//갤럭시노트는 스마트폰이기 때문에 이동가능한 삳태로 홍길동에게 010번호로 
		//갤럭시노트 6인치 사용해서 안녕이라고 카톡을 전송했다.
		return String.format("%s은 %s이기 때문데 %s 상태로 %s에게 %s번호로 %s %s를(을) 사용해서 %s(이)라고 %s을 전송했다.", 
				BRAND, KIND, move, name, phoneNo, BRAND, size, data, appl);
	}
}
