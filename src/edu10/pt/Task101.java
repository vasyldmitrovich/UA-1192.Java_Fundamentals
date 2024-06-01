package edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Task101 {
/*
In the main() method, initialize a map named employeeMap consisting of pairs
<Integer, String>.
• Populate the employeeMap with seven pairs (ID, name) of individuals. Display the
contents of the map on the screen.
• Prompt the user to enter an ID. Find the corresponding name in the employeeMap and
display it. If the ID is not found in the map, notify the user using the containsKey()
function.
• Prompt the user to enter a name. Verify that the name exists in the employeeMap and
display the corresponding ID. If the name is not found in the map, notify the user using
the containsValue() function.
 */

    public static void execute() {
        Map<Integer, String> employeeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 8; i++) {
            employeeMap.putIfAbsent(i, getName());
        }

        System.out.println("Please enter employees ID:");
        int id = scanner.nextInt();

        if (employeeMap.containsKey(id)) {
            System.out.println("Prompted employee: " + employeeMap.get(id));
        } else {
            System.out.println("There is no such employee");
        }

        System.out.println("Please enter employees name:");
        String name = scanner.next();
        System.out.println(name);
        for (Map.Entry<Integer, String> entry: employeeMap.entrySet()){
            if(entry.getValue().equalsIgnoreCase(name)) {
                System.out.println("Emloyees ID is: " + entry.getKey());
                return;
            }
        }
        System.out.println("Employee not found");


    }

    private static String getName() {
        String[] firstNames = new String[]{"James", "Michael", "Robert", "John", "David", "William", "Richard",
                "Mary", "Patricia", "Jenifer", "Linda", "Elizabeth", "Barbara", "Susan"};
        String[] lastNames = new String[]{"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Theta", "Omicron", "Sigma", "Tau"};

        Random random = new Random();

        return firstNames[random.nextInt(0, firstNames.length - 1)];
    }

    private static void findById(int id){

    }

}
