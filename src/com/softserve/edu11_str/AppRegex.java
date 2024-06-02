package com.softserve.edu11_str;

//import java.util.ArrayList;
//import java.util.List;


public class AppRegex {
	public static void main(String[] args) {

		//First
/*

		String pattern = "Now is the time";
		//String pattern = "[ Na-z]+"; // 1,2,....infinity
		//String pattern = "[a-z]+"; // [abcdefghijklmnop...z\\-]


		String text = "Now is the time";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		// 2. Get all parts
		m.reset(); // Reset Iterator

		while (m.find()) {
			System.out.print(" *" + text.substring(m.start(), m.end()) + "* ");
		}
*/


		//Second
/*

		//String text = "";
		//
		String pattern ="[bt]{2}";
		//String pattern ="(ab)+";
		//String pattern ="(\\w)\\1"; // Java String: \\ -> \
		//String pattern = "\\b\\w*([\\w])\\1\\w*\\b";
		String text = "letter abba work abtc";
		//

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		// 2. Get all parts
		m.reset(); // Reset Iterator

		while (m.find()) {
			System.out.print(" *" + text.substring(m.start(), m.end()) + "* ");
		}
*/



		//Third
/*

		//String pattern = "<.+>";
		String pattern = "<[^>]+>"; // All tags
		//String pattern = ">[^><]+<"; // All text
		//String pattern = "<([^>]+)>[^><]+</\\1>"; // \1 == group(1)
		String text = "<p><b>Beginning with bold text</b> next, <span>text</span> body,<i>italic text</i> end of text.</p>";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		// 2. Get all parts
		m.reset(); // Reset Iterator

		while (m.find()) {
			System.out.print(" *" + text.substring(m.start(), m.end()) + "* ");
			//System.out.print(" *" + text.substring(m.start() + 1, m.end() - 1).trim() + "* ");
		}
*/


		//Fourth is email correct
/*

		String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w{2,}";
		System.out.println("Pattern = " + pattern);
		String text = "a.bd.c@gmail.com";
		//String text = "a.b.c@gmail.com a@i.ua a.@gmail.com a@gmail.a";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		// 2. Get all parts
		m.reset(); // Reset Iterator

		while (m.find()) {
			System.out.print(" *" + text.substring(m.start(), m.end()) + "* ");

		}
*/


		//Fifth take digital from string use regex
/*

		String pattern = "\\b\\d{1,3}([,'`]\\d{3})*\\.\\d{2}\\b";
		//String pattern = "\\b(\\d{1,3}[,'])*\\d{1,3}\\.\\d{2}\\b";
		String text = "4 item(s) - $1'111,450.40 text";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		// 2. Get all parts
		m.reset(); // Reset Iterator

		while (m.find()) {
			System.out.println(" *" + text.substring(m.start(), m.end()) + "* ");

			String sNum = text.substring(m.start(), m.end());
			sNum = sNum.replaceAll("[,']", "");
			System.out.println("sNum = " + sNum);
			double num = Double.valueOf(sNum);
			System.out.println("num + 1 = " + (num + 1.11));
		}
*/


		//Sixth is email correct in list
/*

		String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w{2,}";
		System.out.println("Pattern = " + pattern);
		//String text = "a.bd.c@gmail.com";
		String text = "a.b.c@gmail.com a@i.ua a.@gmail.com a@gmail.a";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		// 2. Get all parts
		m.reset(); // Reset Iterator

		List<String> list = new ArrayList<>();

		while (m.find()) {
			System.out.print(" *" + text.substring(m.start(), m.end()) + "* ");
			list.add(text.substring(m.start(), m.end()));

		}

		System.out.println("\nLIST:");
		for (String current : list) {
			System.out.println(current);
			//double price = Double.valueOf(current.replaceAll("'|,|`", ""));
			//System.out.printf("(price+1) = %.2f",(price + 1));
		}
*/


		//Seventh take digital from string use regex
/*

		String pattern ="\"par\":\\s*\"(\\w+)\"";
		String text = "{\"key\":\"value\",\"par\":\"data1\",\"key2\":\"value2\"}";
		System.out.println("JSON = " + text);

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		// 2. Get all parts
		m.reset(); // Reset Iterator

		while (m.find()) {
			System.out.println(" *" + text.substring(m.start(), m.end()) + "* ");
			System.out.println("grop1 = " + m.group(1));
		}
*/


	}
}
