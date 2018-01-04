package mx.grekz.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E018_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<>();
        if ( nums.length < 4 ) return res;
        Arrays.sort(nums);
        int len = nums.length;
        int max = nums[len - 1];
        int maxSum = max * 3;
        for ( int i = 0; i < len - 3; i++ ) {
            int curr = nums[i];
            if ( curr << 2 > target ) return res;
            if ( i > 0 && curr == nums[ i - 1 ] ) continue;
            if ( curr + maxSum < target ) continue;
            for ( int j = i + 1; j < len - 2; j++) {
                if (curr + nums[j] * 3 > target ) break;
                if (j > i +1 && nums[j] == nums[j-1] ) continue;
                int cc = curr + nums[j];
                int l = j + 1;
                int h = len - 1;
                while ( l < h ) {
                    int tmp = cc + nums[l] + nums[h];
                    if ( tmp < target )
                        l++;
                    else if ( tmp > target )
                        h--;
                    else {
                        res.add(Arrays.asList(curr, nums[j], nums[l], nums[h]));
                        while ( l < h && nums[l] == nums[l+1] ) l++;
                        while ( l < h && nums[h] == nums[h-1] ) h--;
                        h--;
                        l++;
                    }
                }
            }
        }        
		return res;
    }
}
