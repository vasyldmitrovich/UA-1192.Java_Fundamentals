package com.softserve.academy.edu05.hw.test_3;

//import org.jetbrains.annotations.NotNull;

// Create class called Car with fields: type, year of production and engine capacity
public class Car implements Comparable<Car> {
    private final String type;// Why all fields is final??? If field final getters and setters do not have matter
    private final int yearOfProduction;
    private final double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getCarInfo() {
        return "Car type: " + getType() + ", year of production: " + getYearOfProduction() + ", engine capacity: " + getEngineCapacity();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + type.hashCode();
        result = 31 * result + yearOfProduction;
        long temp = Double.doubleToLongBits(engineCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return yearOfProduction == car.yearOfProduction &&
                Double.compare(car.engineCapacity, engineCapacity) == 0 &&
                type.equals(car.type);
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public int compareTo(/*@NotNull*/ Car o) {
        return this.yearOfProduction - o.yearOfProduction;
    }
}