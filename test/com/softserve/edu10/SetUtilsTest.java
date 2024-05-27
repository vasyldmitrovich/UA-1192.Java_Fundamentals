package com.softserve.edu10;

import com.softserve.edu10.hw.SetUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SetUtilsTest {

    private static String[] names1 = {"Rajendra", "Natalia", "Caroline", "Hassan", "Emma"};
    private static String[] names2 = {"Frank", "Emma", "Antonia", "Natalia", "Natalia"};

    private static Set<String> set1;
    private static Set<String> set2;

    @BeforeClass
    public static void setUpBeforeAll() {
        set1 = new HashSet<>(List.of(names1));
        set2 = new HashSet<>(List.of(names2));
    }

    @Test
    public void unionSetsTest() {
        String[] expectedValues = {"Rajendra", "Natalia", "Caroline", "Hassan", "Emma", "Frank", "Antonia"};
        Set<String> expected = new HashSet<>(List.of(expectedValues));
        System.out.println(expected);

        Set<String> actual = SetUtils.union(set1, set2);
        System.out.println(actual);

        checkAssertions(expected, actual);
    }

    @Test
    public void intersectionSetsTest() {
        String[] expectedValues = {"Natalia", "Emma"};
        Set<String> expected = new HashSet<>(List.of(expectedValues));
        System.out.println(expected);

        Set<String> actual = SetUtils.intersect(set1, set2);
        System.out.println(actual);

        checkAssertions(expected, actual);
    }

    private void checkAssertions(Set<String> expected, Set<String> actual) {
        assertFalse(actual.isEmpty());
        assertEquals(expected.size(), actual.size());

        actual.removeAll(expected);
        assertTrue(actual.isEmpty());
    }
}
