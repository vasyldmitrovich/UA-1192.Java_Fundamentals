package com.softserve.edu10.hw;


import java.util.*;


public class HomeWorkTask {// All tasks here is nice
    private static final Scanner SCANNER = new Scanner(System.in);

    public void task1() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            set1.add(getInt("Enter number of set1", true));
        }
        for (int i = 0; i < 5; i++) {
            set2.add(getInt("Enter number of set2", true));
        }
        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union set" + unionSet);
        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println("Intersect set" + intersectSet);
    }

    public void task2() {
        Map<String, String> personMap = new LinkedHashMap<>();
        createPersons(personMap);
        System.out.println("Contents of map " + personMap);
        int count = findDuplicates(personMap);
        System.out.println("Count of duplicates " + count);
        removeByName(personMap);
        System.out.println("Map after remove: " + personMap);
    }

    public void task3() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 1));
        students.add(new Student("Iryna", 2));
        students.add(new Student("Waga", 1));
        students.add(new Student("Shor", 3));
        students.add(new Student("Kevin", 2));

        System.out.println("Students sorted by name:");
        Collections.sort(students, Student::compareByName);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Students sorted by course:");
        Collections.sort(students, Student::compareByCourse);
        for (Student student : students) {
            System.out.println(student);
        }
        printStudents(students, 1);
    }
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students enrolled in course " + course + ":");
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    private static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

    private int getInt(String prompt, boolean isInt) {
        System.out.println(prompt);
        return SCANNER.nextInt();
    }

    private void createPersons(Map<String, String> personMap) {
        personMap.put("Smith", "John");
        personMap.put("Royson", "Richard");
        personMap.put("Henks", "Tom");
        personMap.put("Cruz", "John");
        personMap.put("Eastwood", "John");
        personMap.put("Torbins", "Frodo");
        personMap.put("Gray", "Gendalf");
        personMap.put("Potter", "Harry");
        personMap.put("Wizzly", "Ronald");
        personMap.put("Dambldoor", "Albys");
    }

    private int findDuplicates(Map<String, String> personMap) {
        Set<String> firsName = new HashSet<>();
        int count = 0;
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (firsName.contains(entry.getValue())) {
                count++;
            }
            firsName.add(entry.getValue());
        }
        return count;
    }

    private Map<String, String> removeByName(Map<String, String> personMap) {

        String nameToRemove = getPrompt("Enter name to be remove: ");
        ArrayList<String> keysToRemove = new ArrayList<>();
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals(nameToRemove)) {
                keysToRemove.add(entry.getKey());
            }
        }
        for (String key : keysToRemove) {
            personMap.remove(key);
        }
        return personMap;
    }

    private String getPrompt(String prompt) {
        System.out.println(prompt);
        return SCANNER.nextLine();
    }
}
