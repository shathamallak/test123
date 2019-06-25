package com.luv2code.springdemo;

public class Tennis implements coach {

	private FortuneService  fort ;
	Tennis (FortuneService obj){
		fort=obj;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "high score :) it's my game ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fort.getFortune();
	}

}
