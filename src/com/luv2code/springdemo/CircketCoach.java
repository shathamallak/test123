package com.luv2code.springdemo;

public class CircketCoach implements coach {

	
	private FortuneService fort;
	private String email;
	private String team;
	
	
	
	
	 public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("in email setter");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("in team setter");
		this.team = team;
	}

	CircketCoach()
	 {
		 System.out.println("inside no-arg const");
	 }
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice fast ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "yaaay :) "+fort.getFortune();
	}

	//setter method
	public void setFort(FortuneService fort) {
		System.out.println("inside setter method");
		this.fort = fort;
	}

}
