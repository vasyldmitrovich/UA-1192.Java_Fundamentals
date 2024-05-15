package com.softserve.edu07.pt.job;

//remove if jobs count isn't defined
//for example when job is entered from I/O
//then simple String would be enough
public enum PersonType {
    TEACHER("Teacher"),
    CLEANER("Cleaner"),
    STUDENT("Student");

    private String type;

    PersonType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
