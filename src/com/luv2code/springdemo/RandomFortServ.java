package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortServ implements FortuneService {
	private String [] fort= {"good luck !! ","you got it ","wow :) high score "};
	private Random rand = new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = rand.nextInt(3);
		return fort[index];
	}

}
