package mx.grekz.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author grekz
 */
public class E682_BaseballGame {
    public int calPoints(String[] ops) {
        int res = 0;
        int val = 0;
        List<Integer> rounds = new ArrayList<>();
        for ( String s : ops ) {
            int last = rounds.size() - 1;
            if(s.equals("C")){
                val = -rounds.get(last);
                rounds.remove(last);
            }else{
                if(s.equals("+"))
                    val = rounds.get(last) + rounds.get(last - 1);
                else if(s.equals("D"))
                    val = 2 * rounds.get(last);
                else
                    val = Integer.parseInt(s);
                rounds.add(val);
            }
            res += val;
        }
        return res;
    }
}