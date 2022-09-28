package com.oop.proceduralvsoop.oop;

public class Circle extends Shape{

	@Override
	public void rotate() {
		System.out.println("Circle will rotate clockwise 360");
	}

	@Override
	public void playSound() {
		System.out.println("circle sound");
	}

}
