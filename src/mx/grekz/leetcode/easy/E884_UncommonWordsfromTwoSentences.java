package mx.grekz.leetcode.easy;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
/**
 * @author grekz
 */
public class E884_UncommonWordsfromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> m = new HashMap<>();
        for ( String x : A.split(" ") )
            m.put(x, m.getOrDefault(x, 0) + 1 );
        for ( String x : B.split(" ") )
            m.put(x, m.getOrDefault(x, 0) + 1 );
        ArrayList<String> res = new ArrayList<>();
        for ( Map.Entry<String, Integer> e : m.entrySet() )
            if ( e.getValue() == 1 ) {
                res.add(e.getKey());
            }
        return res.toArray(new String[0]);
}