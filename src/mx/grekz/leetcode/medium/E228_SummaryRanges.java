package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length, i = 0;
        String arrow = "->";
        List<String> res = new ArrayList<>();
        while ( i < n ) {
            int j = i;
            while ( j + 1 < n && nums[j + 1] - nums[j] == 1 ) {
                j++;
            }
            res.add(Integer.toString(nums[i]) + ( j == i ? "" : arrow + Integer.toString(nums[j]) ) );
            i = j + 1;
        }
        return res;
    }
}