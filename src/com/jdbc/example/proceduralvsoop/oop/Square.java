package com.oop.proceduralvsoop.oop;

public class Square extends Shape{

	@Override
	public void rotate() {
		System.out.println("Square will rotate clockwise 360");
	}

	@Override
	public void playSound() {
		System.out.println("square sound");
	}

}
