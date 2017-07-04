package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public interface MemberService {
	//기능만 정의
	//interface파일 자체가 abstract을 의미하므로 abstract 키워드를 제거해도 인지함
	public abstract String getGender(MemberBean member);
	public abstract String getAge(MemberBean member);
	public abstract String join(MemberBean member);
	public abstract String login(MemberBean member);
}
