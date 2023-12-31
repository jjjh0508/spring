package com.greedy.section01.constinjection.javaconfig;

public class RandomNumberGenerator implements RandomGenerator{
	private int startNum;
	private int endNum;
	
	public RandomNumberGenerator(int startNum, int endNum) throws Exception{
		if(startNum>= endNum) {
			throw new Exception("시작값이 종룍밧 보다 클 수 없다.");
		}else if(startNum<=0 && endNum <=0) {
			throw new Exception("양의 정수만 입력해주세요");
		}
		
		
		this.startNum= startNum;
		this.endNum = endNum;
	}
	
	
	
	
	@Override
	public int getRandomNumber() {
		
		return (int)(Math.random()*(endNum-startNum+1))+ startNum;
	}
	

	
	public int getStartNum() {
		return startNum;
	}
	
	public int getEndNum() {
		return endNum;
	}
	
	
	
	
}
