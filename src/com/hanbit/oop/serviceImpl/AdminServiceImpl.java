package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService{

	int count;
	MemberBean member;
	MemberBean[] list;
	
	public AdminServiceImpl(int limit){
		count = 0;
		//member = new MemberBean();
		list = new MemberBean[limit];
	}
	
	@Override
	public void addMember(MemberBean member) {		
		list[count] = member;
		/*
		for(int i=0; i<(count+1);i++){
			System.out.println(list[i].toString());
		}*/
		count++;
	}

	@Override
	public MemberBean[] getMembers() {
		return list;
	}

	@Override
	public int countMembers() {
		return count;
	}

	@Override
	public MemberBean findByID(String id) {
		for(int i=0; i<count; i++){
			if(id.equals(list[i].getId())){
				member = list[i];
				break;
			}
		}
		return member;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int a = 0;	//결과 배열의 크기
		for(int i=0; i<list.length; i++){
			if(name.equals(list[i].getName())){
				a++;
			}
		}
	    
		int j=0;	//결과 배열 index
		MemberBean[] nameRes = new MemberBean[a];
	    for(int i=0; i<list.length; i++){
	        if(name.equals(list[i].getName())){
	        	nameRes[j] = list[i];
	            j++;
	        }
	        if(a==j){
            	break;
            }
	    }
	    return nameRes;
	}

	@Override
	public void upadtePw(MemberBean bean) {
		//System.out.println("bean1: "+bean.toString());
		//System.out.println("member1: "+member.toString());
		
		findByID(bean.getId());
		System.out.println("bean2: "+bean.toString());
		System.out.println("member2: "+member.toString());
		
		if(member.getId().equals(bean.getId())){
			member.setPw(bean.getPw());
		}
		
		System.out.println("bean3: "+bean.toString());
		System.out.println("member3: "+member.toString());
	}
}
