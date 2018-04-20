package mx.grekz.leetcode.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author grekz
 */
public class E575_DistributeCandies {
    public int distributeCandies(int[] candies) {
        int n = candies.length / 2;
        int m = Arrays.stream(candies).boxed().collect(Collectors.toSet()).size();
        return Math.min(n, m);
    }
}