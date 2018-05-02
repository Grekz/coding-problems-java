package mx.grekz.leetcode.easy;

import java.util.stream.IntStream;

/**
 * @author grekz
 */
public class E762_PrimeNumberofSetBitsinBinaryRepresentation {
    public int countPrimeSetBits(int L, int R) {
        return IntStream.range(L, R+1).map(i -> 665772 >> Integer.bitCount(i) & 1).sum();
    }
}