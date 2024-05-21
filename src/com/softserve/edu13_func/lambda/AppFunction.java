package com.softserve.edu13_func.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class AppFunction {
	public static void main(String[] args) {


		Predicate<String> predicate1 = (s) -> s.length() > 1;
		//List<String> names = Arrays.asList(new String[] {"Angela", "Aaron", "Bob", "Claire", "David"});
		List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David", "A");
		Predicate<String> predicate = name -> name.startsWith("A");
		System.out.println("Origin: " + names);
		List<String> namesWithA = names.stream()
				//.filter(name -> name.startsWith("A"))
				.filter(predicate)
				.filter(predicate1)
				.collect(Collectors.toList());
		System.out.println("Modify: " + namesWithA);



		//
/*

		Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
		String s = "123";
		int i = stringToInt.apply(s) + 2;
		System.out.println("i = " + i);
*/

		//

/*

		List<String> names = Arrays.asList("John", "Freddy", "Samuel");
		names.forEach(name -> System.out.println("Hello, " + name));
*/


		//
/*

		Supplier<Person> personSupplier = Person::new;
		Person p = personSupplier.get();
		p.setName("Ivan");
		System.out.println("name = " + p.getName());
*/


		//Unary
/*

		List<String> names = Arrays.asList("bob", "josh", "megan");
		System.out.println("Original List = " + names);
//		List<String> names2 = new ArrayList<>();
//		for (String current : names) {
//			names2.add(current.toUpperCase());
//		}
		// names.clear();
		// names.addAll(names2);
//		names = new ArrayList<>(names2);
		names.replaceAll(name -> name.toUpperCase());
		System.out.println("Updated List = " + names);

*/

		//
/*

		List<String> names = Arrays.asList("bob", "josh", "megan");
		System.out.println("Original List = " + names);
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String current = it.next();
			System.out.print("current = " + current + " ");
			current = current.toUpperCase();
			System.out.println(current);
		}
*/

	}
}
