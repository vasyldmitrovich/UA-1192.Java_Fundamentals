package com.softserve.edu16_io.ser;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;

//import com.google.gson.Gson;

//import com.google.gson.Gson;

public class DemoSerialization {
/*

	//Binary
	public static void main(String[] args) {
		//
		Student student = new Student("ComputerScience", 1, "Ivanov", "12345");
		System.out.println(student);
		// save object in file
		File fw = new File("C:/Tools/1/demo.cer");
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
			ostream.writeObject(student);
			ostream.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		//
		// change value of static field
		Student.bachelor = "Mathematic";
		//
		File fr = new File("C:/Tools/1/demo.cer");
		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
			Student unknown = (Student) istream.readObject();
			istream.close();
			System.out.println("DESERIALIZATION:\n" + unknown);
		} catch (ClassNotFoundException | IOException e) {
			System.err.println(e.getMessage());
		}
		//
	}
*/



/*

	//Json
	public static void main(String[] args) {
		Gson gson = new Gson();
		Student student = new Student("ComputerScience", 1, "Ivanov", "12345");
		System.out.println("Origin Student = " + student);
		String ser = gson.toJson(student); // Serialization
		System.out.println("ser = " + ser);
		//
		ser = ser.substring(0, ser.length() - 1) + ",\"password\":\"" + "qwerty54321" + "\"}";
		System.out.println("ser + Password = " + ser);
		//
		Student unknown = gson.fromJson(ser, Student.class);  // Deserialization
		System.out.println("After DeSerialization unknown = " + unknown);
	}
*/


}
