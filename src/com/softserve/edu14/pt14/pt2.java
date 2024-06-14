package com.softserve.edu14.pt14;
import java.util.Arrays;
import java.util.List;
import java.util.IntSummaryStatistics;

public class pt2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics stats = primes.stream().mapToInt(Integer::intValue).summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Sum: " + stats.getSum());
    }
}
