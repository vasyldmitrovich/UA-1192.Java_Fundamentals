package com.softserve.edu08_nest.pt;

public class PT8 {
    public static void execute() {
        try {
            // Create an instance of Department
            Department dept1 = new Department("Human Resources", "New York", "5th Avenue", 101);

            // Clone the first department
            Department dept2 = dept1.clone();

            // Change the city for the cloned department
            dept2.getAddress().setCity("Los Angeles");

            // Output information about all departments
            System.out.println(dept1);
            System.out.println(dept2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}



