package com.jdbc.example;

public class bassLayer {
	
	private dbManager db;
	
	public bassLayer() {
		db = new dbManager();
	}
	
	public void selectData() {
		db.selectRecord();
	}
	
	public void InsertData(int id, String name, String address) {
		String cmd = "Insert into abc (id, name, address) values ('"+id+"','"+name+"', '"+address+"')";
		if(db.manupulateRecord(cmd)) {
			System.out.println("Saved successfully");
		}else{
			System.out.println("not saved");
		};
	}
	
	public void UpdateData(int id, String address) {
		String cmd = "Update abc set address = '"+address+"' where id = '"+id+"'";
		if(db.manupulateRecord(cmd)) {
			System.out.println("updated successfully");
		}else{
			System.out.println("not updated");
		};
	}
	
	public void DeleteData(int id) {
		String cmd = "Delete from abc where id = '"+id+"'";
		if(db.manupulateRecord(cmd)) {
			System.out.println("Deleted successfully");
		}else{
			System.out.println("not Deleted");
		};
	}

}
