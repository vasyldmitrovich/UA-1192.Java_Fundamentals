package com.softserve.edu10.pt;

import java.util.Comparator;
import java.util.Map;

public class EmployeePosComparator<K> implements Comparator<K> {

    private Map<Integer, Employee> employeeMap;

    EmployeePosComparator(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    @Override
    public int compare(K k1, K k2) {
        return employeeMap.get(k1).getPosition().toLowerCase().compareTo(employeeMap.get(k2).getPosition().toLowerCase());
    }

}
