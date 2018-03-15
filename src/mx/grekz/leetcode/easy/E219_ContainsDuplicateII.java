package mx.grekz.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author grekz
 *
 */
public class E219_ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0 || nums == null || nums.length < 2 ){
            return false;
        }
        Map<Integer, Integer> values = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(values.containsKey(nums[i]) && ( i - values.get(nums[i]) <= k ) ){
                return true;
            }
            values.put(nums[i], i);
        }
        return false;
    }
}