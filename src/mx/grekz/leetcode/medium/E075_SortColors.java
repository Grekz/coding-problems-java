package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E075_SortColors {
    public void sortColors(int[] nums) {
        int j = 0, k = nums.length - 1;
        for ( int i = 0; i <= k; i++ ) {
            if ( nums[i] == 0 )
                swap(i, j++, nums);
            else if ( nums[i] == 2 )
                swap(i--, k--, nums);
        }
    }
    private void swap( int a, int b, int[] n ) {
        int tmp = n[a];
        n[a] = n[b];
        n[b] = tmp;
    }
}