package com.oop.proceduralvsoop.oop;

public class Triangle extends Shape{

	@Override
	public void rotate() {
		System.out.println("Triangle will rotate clockwise 360");
	}

	@Override
	public void playSound() {
		System.out.println("triangle sound");
	}

}
