package com.greedy.section01.xmlconfig;

public class PersonalAccount implements Account {

	private int bankCode;
	private String accNO;
	private String accPwd;
	private int balance;
	
	public PersonalAccount(int bankCode, String accNO, String accPwd) {
		super();
		this.bankCode = bankCode;
		this.accNO = accNO;
		this.accPwd = accPwd;
	}
	
	

	public PersonalAccount(int bankCode, String accNO, String accPwd, int balance) {
		super();
		this.bankCode = bankCode;
		this.accNO = accNO;
		this.accPwd = accPwd;
		this.balance = balance;
	}

	@Override
	public String getBalance() {
		
		return this.accNO+"계좌의 현재 잔액은"+this.balance+"원 입니다.";
	}

	@Override
	public String deposit(int money) {
		
		String str="";
		if(money>0) {
			this.balance+=money;
			str= money+" 원이 입급 되었습니다.";
		}else {
			str="입금 금액이 잘못되었습니다.";
		}
		return  str;
	}

	@Override
	public String withDraw(int money) {
		String str="";
		if(this.balance>=money) {
			this.balance-=money;
			str=money+"원이 출금되었습니다.";
		}else {
			str="금액이 잘못입력되었습니다.";
		}
		return str;
	}
	
}
