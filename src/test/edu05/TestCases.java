package test.edu05;

import com.softserve.edu05.hw.task1.FindDaysValueT1;
import com.softserve.edu05.hw.task1.NumbersT2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCases {

    @Test
    public void testGetDaysInMonth() {
        assertEquals(31, FindDaysValueT1.getDaysInMonth(1));
        assertEquals(28, FindDaysValueT1.getDaysInMonth(2));
        assertEquals(31, FindDaysValueT1.getDaysInMonth(3));
        assertEquals(30, FindDaysValueT1.getDaysInMonth(4));
        assertEquals(31, FindDaysValueT1.getDaysInMonth(5));
        assertEquals(30, FindDaysValueT1.getDaysInMonth(6));
        assertEquals(31, FindDaysValueT1.getDaysInMonth(7));
        assertEquals(31, FindDaysValueT1.getDaysInMonth(8));
        assertEquals(30, FindDaysValueT1.getDaysInMonth(9));
        assertEquals(31, FindDaysValueT1.getDaysInMonth(10));
        assertEquals(30, FindDaysValueT1.getDaysInMonth(11));
        assertEquals(31, FindDaysValueT1.getDaysInMonth(12));
    }

    @Test
    public void testGetDaysInMonthInvalidMonth() {
        assertThrows(IllegalArgumentException.class, () -> FindDaysValueT1.getDaysInMonth(0));
        assertThrows(IllegalArgumentException.class, () -> FindDaysValueT1.getDaysInMonth(13));
    }


    @Test
    public void testGetPositiveSumValidInput() {
        int[] integers = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        assertEquals(15, NumbersT2.getPositiveSum(integers));
    }

    @Test
    public void testGetPositiveSumInvalidInput() {
        int[] integers = {-1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        assertThrows(IllegalArgumentException.class, () -> NumbersT2.getPositiveSum(integers));
    }

    @Test
    public void testGetProductOfNegativesValidInput() {
        int[] integers = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        assertEquals(-120, NumbersT2.getProductOfNegatives(integers));
    }

    @Test
    public void testGetProductOfNegativesInvalidInput() {
        int[] integers = {1, 2, 3, 4, 5, 1, -2, -3, -4, -5};
        assertThrows(IllegalArgumentException.class, () -> NumbersT2.getProductOfNegatives(integers));
    }

}
