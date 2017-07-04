package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public interface AdminService {
	//setter
	public void addMember(MemberBean member);
	public void upadtePw(MemberBean member);
	//getter
	public MemberBean[] getMembers();	//목록: MemberBean을 배열로 담음
	public int countMembers();
	public MemberBean findByID(String id);
	public MemberBean[] findByName(String name);
}
