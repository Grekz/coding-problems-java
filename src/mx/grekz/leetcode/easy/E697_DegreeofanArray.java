package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E697_DegreeofanArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>(), ini = new HashMap<>();
        int i = 0, max = 0, res = nums.length;
        for (int x : nums) {
            ini.putIfAbsent(x, i);
            int cur = counts.getOrDefault(x, 0) + 1;
            int curIni = ini.get(x);
            counts.put(x, cur);
            if (max < cur) {
                max = cur;
                res = i - curIni + 1;
            } else if (max == cur) {
                res = Math.min(res, i - curIni + 1);
            }
            i++;
        }
        return res;
    }
}