package com.softserve.edu10.pt;

import java.util.Comparator;
import java.util.Map;

public class EmployeeNameComparator<K> implements Comparator<K> {// Make inner

    private Map<Integer, Employee> employeeMap;

    EmployeeNameComparator(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    @Override
    public int compare(K k1, K k2) {
        return employeeMap.get(k1).getName().toLowerCase().compareTo(employeeMap.get(k2).getName().toLowerCase());
    }
}
