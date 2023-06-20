package com.greedy.section01.xmlconfig;

public interface MemberDAO {
	MemberDTO selectMember(int sequence);
	
	boolean insertMember(MemberDTO member);

}
