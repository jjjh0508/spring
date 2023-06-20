package com.greedy.section01.xmlconfig;

public class MemberDTO {
	
	private int code;
	private String name;
	private String gender;
	private String phone;
	
	
	public MemberDTO() {
	}
	public MemberDTO(int code, String name, String gender, String phone) {
		super();
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	public int getcode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MemberDTO [code=" + code + ", name=" + name + ", gender=" + gender + ", phone=" + phone
				+ "]";
	}
	
	
}
