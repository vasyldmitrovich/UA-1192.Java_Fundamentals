package com.softserve.edu07.hw.homework1;

public class SalariedEmployee extends Employee implements Payment {

    private String socialSecNum;
    private String name;
    private int hourlyRate;
    private int hoursWorked;

    public SalariedEmployee () {
        super("sal1");
        this.socialSecNum = "123-45-6789";
        this.name = "Ivan";
        this.hourlyRate = 80;
        this.hoursWorked = 100;
    }

   public SalariedEmployee (String employeeId, String socialSecNum, String name,
                            int hourlyRate, int hoursWorked) {
        super(employeeId);
        this.socialSecNum = socialSecNum;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
   }

    public String getSocialSecNum() {
        return socialSecNum;
    }

    public void setSocialSecNum(String socialSecNum) {
        this.socialSecNum = socialSecNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecNum='" + socialSecNum + '\'' +
                ", name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }

    @Override
    public int calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
