package mx.grekz.leetcode.medium;

import java.util.Arrays;

public class E016_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        int len = nums.length - 1 ;
        for ( int i = 0; i < len - 1; i++ ) {
            int l = i + 1, h = len,  cur = nums[i];
            if (i > 0 && cur == nums[i - 1]) {
		        continue;
		    }
            while ( l < h ) {
                int tmp = cur + nums[l] + nums[h];
                if ( tmp == target ) 
                    return tmp;
                if ( Math.abs(target - tmp) < Math.abs(target - res) )
                    res = tmp;
                if ( tmp > target )
                    h--;
                else
                    l++;
            }
                
        }
        return res;
    }
}
