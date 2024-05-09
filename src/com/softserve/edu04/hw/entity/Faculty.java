package com.softserve.edu04.hw.entity;

public class Faculty {
    private StudySeason studySeason;
    private int studentsCount;

    public Faculty(StudySeason studySeason, int studentsCount) {
        this.studySeason = studySeason;
        this.studentsCount = studentsCount;
    }

    public StudySeason getStudySeason() {
        return studySeason;
    }

    public void setStudySeason(StudySeason studySeason) {
        this.studySeason = studySeason;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "studySeason=" + studySeason +
                ", studentsCount=" + studentsCount +
                '}';
    }
}
