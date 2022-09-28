package com.oop.proceduralvsoop.oop;

public class Amoeba extends Shape{
	
	private int x;
	private int y;
	
	public Amoeba(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void rotate() {
		//Use x, y calculate rotate point
        System.out.println("amoeba will rotate clockwise 360 from " + x + " " + y);
	}

	@Override
	public void playSound() {
		System.out.println("amoeba sound");
	}

}
