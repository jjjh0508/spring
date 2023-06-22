package com.greedy.section01.advice.annotation;

public class AchievementResult {

	private int uderstandingScore;
	private int satisfactionScore;
	private double employeementRate;

	public AchievementResult(int uderstandingScore, int satisfactionScore, double employeementRate) {
		super();
		this.uderstandingScore = uderstandingScore;
		this.satisfactionScore = satisfactionScore;
		this.employeementRate = employeementRate;
	}

	
	public int getUderstandingScore() {
		return uderstandingScore;
	}
	

	public void setUderstandingScore(int uderstandingScore) {
		this.uderstandingScore = uderstandingScore;
	}
	

	public int getSatisfactionScore() {
		return satisfactionScore;
	}

	
	public void setSatisfactionScore(int satisfactionScore) {
		this.satisfactionScore = satisfactionScore;
	}
	

	public double getEmployeementRate() {
		return employeementRate;
	}
	

	public void setEmployeementRate(double employeementRate) {
		this.employeementRate = employeementRate;
	}
	

	@Override
	public String toString() {
		return "AchievementResult [uderstandingScore=" + uderstandingScore + ", satisfactionScore=" + satisfactionScore
				+ ", employeementRate=" + employeementRate + "]";
	}

}
