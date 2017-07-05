package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService{

	int count;
	MemberBean member;
	MemberBean[] list, nameList;
	
	public AdminServiceImpl(int limit){
		count = 0;
		member = new MemberBean();
		list = new MemberBean[limit];
	}
	
	@Override
	public void addMember(MemberBean member) {		
		//list[count] = member;
		//count++;
		setCount();
		list[getCount()-1]=member;
		
	}

	@Override
	public MemberBean[] getMembers() {
		return list;
	}

	@Override
	public int countMembers() {
		return count;
	}
	
	public void setCount(){
		count++;
	}
	
	public int getCount(){
		if(count>list.length){
			count=list.length;
		}
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
		member = findByID(bean.getId());
		System.out.println("bean2: "+bean.toString());
		System.out.println("member2: "+member.toString());
		
		//if(member.getId().equals(bean.getId())){
			member.setPw(bean.getPw());
		//}
		
		System.out.println("bean3: "+bean.toString());
		System.out.println("member3: "+member.toString());
	}

	@Override
	public void delMember(String id) {
		member = findByID(id);
		
		for(int i=0; i<count; i++){
			if(id.equals(list[i].getId())){
				list[i]=list[count-1];
				list[count-1] = null;
				count--;
			}
		}
	}
}
