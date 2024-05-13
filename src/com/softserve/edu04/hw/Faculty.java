package com.softserve.edu04.hw;

public class Faculty {
/*
    Create a class named Faculty and input the information about the number of students (using the console) and the
    current season (using enum). Each season must have a name in English (use the constructor). In the main() method,
    check the correctness of the code. Here, a season can signify a time of year (winter, spring, summer, autumn). In the
    context of this task, it can correspond to a certain semester. For example, autumn could be the first seme
 */
    private int students;
    private String currentSeason;

    public Faculty(int students, Season season){
        this.students=students;
        this.currentSeason=season.getPeriod();
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public String getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(String currentSeason) {
        this.currentSeason = currentSeason;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "students=" + students +
                ", currentSeason='" + currentSeason + '\'' +
                '}';
    }
}