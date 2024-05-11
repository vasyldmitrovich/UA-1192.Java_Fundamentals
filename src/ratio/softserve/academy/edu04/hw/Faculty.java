package ratio.softserve.academy.edu04.hw;

//    4.* Create a class named Faculty and input the information about the number of students (using the console) and the
//    current season (using enum).
//    Each season must have a name in English (use the constructor).
//    In the main() method, check the correctness of the code.
//    Here, a season can signify a time of year (winter, spring, summer, autumn).
//    In the context of this task, it can correspond to a certain semester.
//    For example, autumn could be the first semester, spring -
//    the second, and summer - the vacation period. Winter may correspond to the period of winter exams.
public class Faculty {
    private final int numberOfStudents;
    private final Season season;

    public Faculty(int numberOfStudents, Season season) {
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }


    @Override
    public String toString() {
        return "Faculty{" +
                "numberOfStudents=" + numberOfStudents +
                ", season=" + season +
                '}';
    }
}
