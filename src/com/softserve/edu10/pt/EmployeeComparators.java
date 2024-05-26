package com.softserve.edu10.pt;

import java.util.Comparator;
import java.util.Map;

public class EmployeeComparators {

    public static <K> Comparator<K> getIdComparator(Map<K, Employee> relatedMap) {
        return new IdComparator<>(relatedMap);
    }

    public static <K> Comparator<K> getNameComparator(Map<K, Employee> relatedMap) {
        return new NameComparator<>(relatedMap);
    }

    public static <K> Comparator<K> getPositionComparator(Map<K, Employee> relatedMap) {
        return new PositionComparator<>(relatedMap);
    }

    private static class IdComparator<K> extends EmployeeComparator<K> {

        public IdComparator(Map<K, Employee> relatedMap) {
            super(relatedMap);
        }

        @Override
        public int compare(K k1, K k2) {
            return Integer.compare(relatedMap.get(k1).getId(), relatedMap.get(k2).getId());
        }

    }

    private static class NameComparator<K> extends EmployeeComparator<K> {

        public NameComparator(Map<K, Employee> relatedMap) {
            super(relatedMap);
        }

        @Override
        public int compare(K k1, K k2) {
            return relatedMap.get(k1).getName().compareTo(relatedMap.get(k2).getName());
        }

    }

    private static class PositionComparator<K> extends EmployeeComparator<K> {

        public PositionComparator(Map<K, Employee> relatedMap) {
            super(relatedMap);
        }

        @Override
        public int compare(K k1, K k2) {
            return relatedMap.get(k1).getPosition().compareTo(relatedMap.get(k2).getPosition());
        }

    }

    private static abstract class EmployeeComparator<K> implements Comparator<K> {

        protected Map<K, Employee> relatedMap;

        public EmployeeComparator(Map<K, Employee> relatedMap) {
            this.relatedMap = relatedMap;
        }

    }

}
