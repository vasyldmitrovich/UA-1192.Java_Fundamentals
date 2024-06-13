package com.softserve.edu14_streamapi;

import java.util.Arrays;
import java.util.List;

public class AppStream {
	public static void main(String[] args) {
		String[] arr = new String[] {"abce", "", "bc", "abcd", "", "jkl", "jkl"};
		List<String> strings = Arrays.asList(arr);
//		List<String> strings = Arrays.asList("abc", "", "bc", "abcd", "1", "jkl", "abcd", "ad*");

		System.out.println("Origin: " + strings);

/*

		//
//		List<String> filtered = strings.stream()
//			.filter(string -> !string.isEmpty())
//			.filter(string -> string.length() > 2)
//			.collect(Collectors.toList());
		List<String> filtered = strings.stream()
				.filter(string -> ((!string.isEmpty()) && (string.length() > 2)))
				.collect(Collectors.toList());
		System.out.println("Updated: " + filtered);
*/

		//
/*

		Stream<String> st = strings.stream()
				.filter(string -> !string.isEmpty());
		//
		st = st.peek(System.out::println);
		System.out.println("----------------");
		st = st.distinct()
				// .peek(x->System.out.println("+++" + x))
				// .sorted((p1, p2) -> -p1.length() + p2.length());
				.sorted(Comparator.<String, String>comparing(x -> x, (p1, p2) -> p1.length() - p2.length())
						.thenComparing((p1, p2) -> p1.compareTo(p2)));
		// st = st.peek(x->System.out.println("++++"));
		arr[1] = "0000";
		st.forEach(System.out::println);
*/

		//

//		Stream<String> st2 = strings.stream()
//				.filter(string -> !string.isEmpty());
//		List<String> filtered = st2.map(str->"_"+str+"_")
//				.collect(Collectors.toList());
//		System.out.println("After: " + filtered);
//		st.forEach(System.out::println); // Stream has already been operated upon or closed


	}
}
