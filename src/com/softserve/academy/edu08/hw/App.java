package com.softserve.academy.edu08.hw;

public class App {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Task 1:" +
                "        1. Create a FullName class with the firstName and lastName fields of type String, which\n" +
                "would correspond to the principle of encapsulation.\n" +
                "• Create an abstract Person class with fullName field of type FullName and age of type int.\n" +
                "• In the Person class, create:\n" +
                "o\n" +
                " a constructor public Person(FullName fullName, int age) ;\n" +
                "o\n" +
                " info() method, which will return a string in the format\n" +
                "\"First name: <firstName>, Last name: <lastName>, Age: <age>\"\n" +
                "o\n" +
                " an abstract public activity() method with a String return type." +
                "Create a Student class with an int field that matches the course the student is taking.\n" +
                "• In the Student class:\n" +
                "o create a constructor with parameters to initialize all fields in the class;\n" +
                "o override the info() method (which would also add course information to the\n" +
                "previous line);\n" +
                "o override the activity() method from the Person class. The activity() method should\n" +
                "return a string value that is the type of activity for the corresponding Person subtype,\n" +
                "for example for a student - this could be the value \"I study at university\".\n" +
                "• In the main() method, create two instances of the Student class and output information\n" +
                "about them by calling the appropriate methods info() and activity().\n" +
                "• Create one more instance of Student class by cloning the first student, change a course\n" +
                "for this object and output full information about created students.\n");
            // the statement of the task can be left as a comment, not printed to the console
        Student student1 = new Student(new FullName("John", "Doe"), 20, 1);
        Student student2 = new Student(new FullName("Jane", "Doe"), 22, 2);

        System.out.println(student1.info() + ", Activity: " + student1.activity());
        System.out.println(student2.info() + ", Activity: " + student2.activity());

        Student student3 = student1.clone();

        student3.setCourse(3);

        System.out.println(student1.info() + ", Activity: " + student1.activity());
        System.out.println(student2.info() + ", Activity: " + student2.activity());
        System.out.println(student3.info() + ", Activity: " + student3.activity());
    }
}
