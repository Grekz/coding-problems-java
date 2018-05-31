package mx.grekz.leetcode.medium;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author grekz
 */
public class E049_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for ( String s : strs ) {
            String key = getKey(s);
            List<String> l = m.getOrDefault(key, new ArrayList<String>());
            l.add(s);
            m.put(key, l);
        }
        return new ArrayList(m.values());
    }
    private String getKey(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}