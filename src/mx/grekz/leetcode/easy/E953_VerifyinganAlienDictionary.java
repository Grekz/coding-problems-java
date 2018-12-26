package mx.grekz.leetcode.easy;

import java.util.Map;
/**
 * @author grekz
 */
public class E953_VerifyinganAlienDictionary {
    private Map<Character, Integer> getMap(String order) {
        Map<Character, Integer> map = new HashMap<>();
        for ( int i = 0; i < order.length(); i++ ) 
            map.put(order.charAt(i), i); 
        return map;
    }
    private int compare(String a, String b, Map<Character, Integer> dict) {
        int res = 0, aLen = a.length(), bLen = b.length();
        for ( int i = 0; i < aLen && i < bLen && res == 0; i++ ) {
            res =  dict.get(a.charAt(i)) - dict.get(b.charAt(i));
        }
        return res == 0 ? aLen - bLen : res;
    }
    public boolean isAlienSorted(String[] words, String order) {
        if ( words.length < 2 ) return true;
        Map<Character, Integer> dict = getMap(order);
        String prev = words[0];
        for ( String w : words ) {
            if ( compare(prev, w, dict) > 0 )
                return false;
            prev = w;
        }
        return true;
    }
}