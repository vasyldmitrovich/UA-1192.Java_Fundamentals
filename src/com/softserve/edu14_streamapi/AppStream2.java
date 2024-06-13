package com.softserve.edu14_streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class AppStream2 {

	public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// Optional.orElse - returns the value if present otherwise returns
		// the default value passed.
		Integer value1 = a.orElse(0);
		// Optional.get - gets the value, value should be present
		Integer value2 = b.get();
		return value1 + value2;
		// return a.orElse(0) + b.orElse(0);
	}

	public static Integer sum1(Integer v1, Integer v2) {
		if (v1 == null) {
			v1 = 0;
		}
		if (v2 == null) {
			v2 = 0;
		}
		return v1 + v2;
	}

	public static void main(String[] args) {
/*

		List<Integer> lst = new Random().ints()
			.limit(10)
			.sorted()
			//.forEach(System.out::println);
			.boxed()
			.collect(Collectors.toList());
		System.out.println(lst);
*/


		//


		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<String> squaresList = numbers.stream()
				.distinct()
				.map(i -> String.valueOf(i * i) + "*")
				.collect(Collectors.toList());
		squaresList.forEach(System.out::print);

/*

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		Map<String, String> squaresMap = numbers.stream()
				.distinct()
				.map(i -> String.valueOf(i) +"*="+ String.valueOf(i * i))
				.collect(Collectors.toMap(s -> s.substring(0,1),
						s -> s.substring(1)));
		squaresMap.forEach((key, value) -> System.out.print("\n" + key + ": " + value));
*/

/*

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		long count = numbers.stream()
				.filter(num -> num > 2)
				.count();
		System.out.println("\ncount = " + count);
*/

/*

		List<String> parents = Arrays.asList("Petro", "Ivan", "Ira", "Adriy");
		//List<String> parents = Arrays.asList("Petro");
		//List<String> parents = Arrays.asList();
		String res = parents.stream()
		    .sorted()
			.reduce((p1, p2) -> p1 + " * " + p2)
			.orElse("ERROR");
			//.ifPresent(System.out::println);
		System.out.println(res);
*/


/*
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		Integer ageSum = numbers.stream()
				.distinct()
		        .reduce(0, (sum, p) -> sum += p);
		System.out.println("\nageSum = " + ageSum);
*/

/*

		long startTime = System.currentTimeMillis(); // from 1.01.1970 00:00.0
		List<Integer> numbers = new Random().ints()
				.limit(2000000)
				.distinct()
				.boxed()
				.collect(Collectors.toList());
		//
		Integer ageSum = numbers.stream()
		//Integer ageSum = numbers.parallelStream()
				.sorted()
		        .reduce(0, (sum, p) -> sum += p);
		long endTime = System.currentTimeMillis();
		System.out.printf("\nageSum = " + ageSum 
				+ "\ntime = %.3f", ((endTime - startTime) / 1000.0));
*/


/*
		List<String> strings = Arrays.asList("abc", "", "bc", "eg", "abd", "", null, "jkl");
		List<String> filtered = strings.stream()
			.filter(string -> string != null)
			.filter(string -> !string.isEmpty())
			.collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);
*/

/*

		List<String> strings = Arrays.asList("abc", "", "bc", "eg", "abd", "", null, "jkl");
		String mergedString = strings.stream()
			.filter(string -> string != null)
			.filter(string -> !string.isEmpty())
			.filter(string -> string.length() > 2)
			.collect(Collectors.joining(" * "));
		System.out.println("Merged String: " + mergedString);
*/


/*
		List<String> nums = Arrays.asList("3", "2", "2", "3", "7", "3", "5");
		IntSummaryStatistics stats = nums.stream()
				//.flatMap(s -> s) // Function.identity()
				.mapToInt(x -> Integer.valueOf(x))
				.summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
*/

/*

		Integer value1 = null; // 1;
		Integer value2 = 12; // null;
		// Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.ofNullable(value1);
		// Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);
		//
		System.out.println("First parameter is present: " + a.isPresent());
		a.ifPresent(s -> System.out.println("ifPresetn a = " + a.get()));
		System.out.println("Second parameter is present: " + b.isPresent());
		b.ifPresent(s -> System.out.println("ifPresetn b = " + b.get()));
		System.out.println("sum = " + sum(a, b)); // sum1(value1, value2)
		System.out.println("sum1 = " + sum1(value1, value2));
*/


	}
}
