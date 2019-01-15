package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E973_KClosestPointstoOrigin {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparing(x -> x[0] * x[0] + x[1] * x[1]));
        return Arrays.copyOfRange(points, 0, K);
    }
}