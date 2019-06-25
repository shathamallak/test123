package com.luv2code.springdemo;

public class baseballcoach implements coach {
	//dep injection constructor 
	
	private FortuneService fort;
	
	baseballcoach(FortuneService obj)
	{
		fort=obj;
	}
	
	
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fort.getFortune();
	}

	

}
