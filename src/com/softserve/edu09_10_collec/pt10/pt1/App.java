package com.softserve.edu09_10_collec.pt10.pt1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EmployeeMap employeeMap = new EmployeeMap();
        employeeMap.populateMap();

        // Display contents of the map
        employeeMap.displayEmployeeMap();

        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an ID and find corresponding name
        System.out.print("\nEnter an ID to find corresponding name: ");
        int idToFind = scanner.nextInt();

        if (employeeMap.containsId(idToFind)) {
            String name = employeeMap.findNameById(idToFind);
            System.out.println("Name for ID " + idToFind + ": " + name);
        } else {
            System.out.println("ID " + idToFind + " not found in the employee map.");
        }

        scanner.nextLine(); // Consume newline left-over

        // Prompt user to enter a name and find corresponding ID
        System.out.print("\nEnter a name to find corresponding ID: ");
        String nameToFind = scanner.nextLine();

        if (employeeMap.containsName(nameToFind)) {
            int id = employeeMap.findIdByName(nameToFind);
            System.out.println("ID for name " + nameToFind + ": " + id);
        } else {
            System.out.println("Name '" + nameToFind + "' not found in the employee map.");
        }

        scanner.close();
    }
}
