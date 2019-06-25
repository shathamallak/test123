package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring config file 
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring 
		CircketCoach Circket =context.getBean("myCircket", CircketCoach.class);
		
		//call methods on the bean
		System.out.println(Circket.getDailyWorkout());
		System.out.println(Circket.getDailyFortune());
		System.out.println(Circket.getEmail());
		System.out.println(Circket.getTeam());
		
		
		
		//close the context
		context.close();

	}

}
