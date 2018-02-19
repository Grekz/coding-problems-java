package mx.grekz.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class E118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for ( int i = 0; i < numRows; i++ ) {
            for ( int j = cur.size() - 1; j > 0; j-- )
                cur.set(j, cur.get(j) + cur.get(j-1));
            cur.add(1);
            res.add(new ArrayList<Integer>(cur));
        }
        return res;
    }
}
