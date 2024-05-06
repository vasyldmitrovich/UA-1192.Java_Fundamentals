import java.util.Scanner;

enum Season {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private final String name;

    Season(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        System.out.println("Select the current season:");
        System.out.println("1. Winter");
        System.out.println("2. Spring");
        System.out.println("3. Summer");
        System.out.println("4. Autumn");
        System.out.print("Enter your choice (1-4): ");

        int seasonChoice = scanner.nextInt();
        Season currentSeason = null;

        switch (seasonChoice) {
            case 1:
                currentSeason = Season.WINTER;
                break;
            case 2:
                currentSeason = Season.SPRING;
                break;
            case 3:
                currentSeason = Season.SUMMER;
                break;
            case 4:
                currentSeason = Season.AUTUMN;
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Winter.");
                currentSeason = Season.WINTER;
        }

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        System.out.println("\nFaculty Information:");
        System.out.println("Number of Students: " + faculty.numberOfStudents);
        System.out.println("Current Season: " + faculty.currentSeason);
    }

}