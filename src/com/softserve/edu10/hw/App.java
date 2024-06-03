package com.softserve.edu10.hw;

import java.util.*;

public class App {

    private static final String[] FIRST_NAMES = {"Nancy", "Thomas", "Martin", "Joao", "Rina", "Hiroshi",
            "Ghulam", "Mei", "Victor", "Michel"};
    private static final String[] LAST_NAMES = {"Suzuki", "Perez", "Ni", "Mandal", "Sow", "Wu", "Soares",
            "Pawar", "Akhter", "Mendes", "Jackson", "Niu", "Teixeira", "Gan", "Jing"};

    private static final Scanner SC = new Scanner(System.in);
    private static final Random RAND = new Random();

    public static void main(String[] args) {// Nice tasks is good
        System.out.println("Task 1");
        demonstrateSetTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateMapTask();
        System.out.println();

        System.out.println("Task 3");
        demonstrateStudentTask();
    }

    private static void demonstrateSetTask() {
        System.out.println("Generate set 1:");
        System.out.print("Input count of names: ");
        int count = Integer.parseInt(SC.nextLine());
        Set<String> set1 = randomNames(count);
        System.out.println(set1);

        System.out.println("Generate set 2:");
        System.out.print("Input count of names: ");
        count = Integer.parseInt(SC.nextLine());
        Set<String> set2 = randomNames(count);
        System.out.println(set2);

        System.out.println("Union:");
        System.out.println(SetUtils.union(set1, set2));

        System.out.println("Intersection:");
        System.out.println(SetUtils.intersect(set1, set2));
    }

    private static void demonstrateMapTask() {
        System.out.print("Input count of persons: ");
        int count = Integer.parseInt(SC.nextLine());
        Map<String, String> map = randomPersons(count);
        printMap(map);

        System.out.println("Count of duplicate names: " + getDuplicateNamesCount(map));

        System.out.print("Input first name for removing: ");
        String firstName = SC.nextLine();
        removePersonByFirstName(map, firstName);
        printMap(map);
    }

    private static void demonstrateStudentTask() {
        System.out.print("Input count of students: ");
        int count = Integer.parseInt(SC.nextLine());
        List<Student> students = randomStudents(count);
        Student.printStudents(students);

        System.out.println("Filter by course");
        System.out.print("Input course number: ");
        int course = Integer.parseInt(SC.nextLine());
        Student.printStudents(students, course);

        System.out.println("Sort by name");
        students.sort(Student::compareByName);
        Student.printStudents(students);

        System.out.println("Sort by course");
        students.sort(Student::compareByCourse);
        Student.printStudents(students);
    }

    private static Set<String> randomNames(int count) {
        Set<String> names = new HashSet<>(count);

        for (int i = 0; i < count; i++) {
            names.add(FIRST_NAMES[RAND.nextInt(FIRST_NAMES.length)]);
        }

        return names;
    }

    private static Map<String, String> randomPersons(int count) {
        Map<String, String> personMap = new HashMap<>(count);

        for (int i = 0; i < count; i++) {
            String firstName = FIRST_NAMES[RAND.nextInt(FIRST_NAMES.length)];
            String lastName = LAST_NAMES[RAND.nextInt(LAST_NAMES.length)];
            personMap.put(lastName, firstName);
        }

        return personMap;
    }

    private static void printMap(Map<String, String> map) {
        System.out.println("Map{");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("\t" + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("}");
    }

    private static int getDuplicateNamesCount(Map<String, String> map) {
        int count = 0;
        Set<String> firstNames = new HashSet<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (firstNames.contains(entry.getValue())) {
                count++;
            }
            firstNames.add(entry.getValue());
        }

        return count;
    }

    private static void removePersonByFirstName(Map<String, String> map, String firstName) {
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            if (entry.getValue().equals(firstName)) {
                iter.remove();
            }
        }
    }

    private static List<Student> randomStudents(int count) {
        List<Student> students = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            String firstName = FIRST_NAMES[RAND.nextInt(FIRST_NAMES.length)];
            String lastName = LAST_NAMES[RAND.nextInt(LAST_NAMES.length)];
            int course = RAND.nextInt(4) + 1;
            students.add(new Student(firstName, lastName, course));
        }

        return students;
    }
}
