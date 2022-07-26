package com.jdbc.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bassLayer bass =  new bassLayer();
		bass.selectData();
		
		bass.InsertData(1, "Ananta", "Santinagor");
		bass.selectData();
		
		bass.UpdateData(1, "Santinagor, kendua");
		bass.selectData();
		
		bass.DeleteData(1);
		bass.selectData();

	}

}
