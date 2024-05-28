package com.softserve.edu13_func.lambda;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester3 {
	public static void main(String args[]) {
		List<String> names = new ArrayList<>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		//
		 System.out.println(names);
//		for (int i = 0; i < names.size(); i++) {
//			System.out.print(names.get(i) + "  ");
//		}
		//
		names.forEach(System.out::println);
	}
}