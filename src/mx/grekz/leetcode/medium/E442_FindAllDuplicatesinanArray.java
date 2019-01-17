package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E442_FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            int val = Math.abs(n[i]) - 1;
            if (n[val] < 0)
                res.add(val + 1);
            n[val] = -n[val];
        }
        return res;
    }
}