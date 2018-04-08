package mx.grekz.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author grekz
 */
public class E448_FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] n) {
        List<Integer> res = new ArrayList<>();
        for( int x : n ){
            int val = Math.abs(x);
            n[ val - 1 ] = -Math.abs(n[ val - 1 ]);
        }
        for(int i = 0; i < n.length; i++){
            if ( n[ i ] > 0)
                res.add(i + 1);
        }
        return res;
    }
}