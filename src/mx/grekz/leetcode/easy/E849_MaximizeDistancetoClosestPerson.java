package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E849_MaximizeDistancetoClosestPerson {

    public int maxDistToClosest(int[] seats) {
        int i = 0, res = 0, n = seats.length;
        for (int j = 0; j < n; j++) {
            if (seats[j] == 1) {
                if (i == 0) 
                    res = Math.max(res, j - i);
                else 
                    res = Math.max(res, (j - i + 1) / 2);
                i = j + 1;
            }
        }
        res = Math.max(res, n - i);
        return res;
    }
}