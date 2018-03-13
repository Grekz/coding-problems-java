package mx.grekz.leetcode.easy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author grekz
 *
 */
public class E412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(i -> {
            if (i % 3 == 0 && i % 5 == 0) {
                return "FizzBuzz";
            } else if (i % 3 == 0) {
                return "Fizz";
            } else if (i % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(i);
            }
        }).collect(Collectors.toList());
    }

}