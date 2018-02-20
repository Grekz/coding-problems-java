package mx.grekz.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class E119_PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for ( int i = 0; i < rowIndex; i++ ) {
            for ( int j = res.size()-1; j > 0; j-- ) {
                res.set(j, res.get(j) + res.get(j-1));
            }
            res.add(1);
        }
        return res;
    }
}
