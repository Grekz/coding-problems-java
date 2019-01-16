package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E338_CountingBits {
    public int[] countBits(int num) {
        int[] results = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            results[i] = results[i / 2];
            if (i % 2 == 1)
                results[i]++;
        }
        return results;
    }
}