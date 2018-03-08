package mx.grekz.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class E217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length <= 1){
            return false;
        }
        Map<Integer, Boolean> values = new HashMap<Integer, Boolean>();
        for(Integer i : nums){
            if(values.containsKey(i)) return true;
            else values.put(i, Boolean.TRUE);
        }
        return false;
    }
}
