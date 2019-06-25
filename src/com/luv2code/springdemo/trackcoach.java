package com.luv2code.springdemo;

public class trackcoach implements coach {

    private FortuneService fort;
    
    trackcoach()
    {
    	
    }
	
    trackcoach(FortuneService obj)
	{
		fort=obj;
	}
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "WOW "+fort.getFortune();
	}

}
