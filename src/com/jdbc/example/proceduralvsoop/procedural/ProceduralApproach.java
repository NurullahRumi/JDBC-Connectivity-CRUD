package com.oop.proceduralvsoop.procedural;

public class ProceduralApproach {

	public static void main(String[] args) {
		String shape1 = "square";
        //String shape2 = "circle";
        //String shape3 = "triangle";
        String shape4 = "amoeba";

        rotate(shape1,0,0);
        playSound(shape1);
        rotate(shape4, 5, 5);
        playSound(shape4);

	}
	
	public static  void rotate(String shapeName, int x, int y){
        if(shapeName.equals("amoeba")){
            //Calculate the rotation point with x and y
            System.out.println(shapeName + " will rotate clockwise 360");
        }else{
            //Calculate the center point
            System.out.println(shapeName + " will rotate clockwise 360");
        }
    }

    public static void playSound(String shapeName){
        if(shapeName.equals("square")){
            System.out.println("Square sound.");
        }else if(shapeName.equals("circle")){
            System.out.println("circle sound.");
        }else if(shapeName.equals("amoeba")){
            System.out.println("amoeba sound.");
        }else{
            System.out.println("triangle sound.");
        }
    }

}
