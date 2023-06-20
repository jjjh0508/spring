package com.greedy.section01.xmlconfig;

public class MemberDTO {
	private int id;
	private String name;
	private String addr;
	private String addr2;
	private int age;
	private char gender;
	
	public MemberDTO() {
		
	}

	public MemberDTO(int id, String name, String addr, String addr2, int age, char gender) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.addr2 = addr2;
		this.age = age;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", name=" + name + ", addr=" + addr + ", addr2=" + addr2 + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
}
