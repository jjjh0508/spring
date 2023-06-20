package com.greedy.section01.javaconfig;

public interface MemberDAO {
	MemberDTO selectMember(int sequence);
	
	boolean insertMember(MemberDTO member);

}
