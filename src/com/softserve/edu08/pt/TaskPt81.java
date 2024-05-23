package com.softserve.edu08.pt;

public class TaskPt81 {
/*
     Create a class called Department that contains a name field of String type and an address
    field of Address type.
    • In the Department class, create an inner class called Address with has city and street
    fields of String type and building field of type int.
    • In main() method, create an instance for one department and initialize it.
    • Then, create one more department by cloning previously created department and change
    the city for this object.
    • Output information about all departments to the console.
 */
    public static void execute(){
        Department dep1 = new Department();
        Department dep2 = new Department();
        Department.Address address = new Department().new Address();

        address.setCity("Ney York");
        address.setStreet("15 st");
        address.setBuiling(14);
        dep1.setAddress(address);
        dep1.setName("East Side");


        try {
            dep2 = (Department) dep1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        dep2.getAddress().setCity("Detroit");

        System.out.println(dep1);
        System.out.println(dep2);
    }
}
