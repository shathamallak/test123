package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class task2demo {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		coach theCoach2=context.getBean("myTennis",coach.class);
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		
		context.close();

	}

}
