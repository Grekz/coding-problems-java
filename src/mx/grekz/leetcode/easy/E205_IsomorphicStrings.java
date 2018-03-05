package mx.grekz.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class E205_IsomorphicStrings {

    public boolean isIsomorphic(String a, String b) {
        if (a == null || b == null) return false;
        if (a.length() != b.length() ) return false;
        Map<Character, Character> iso = new HashMap<>();
        for(int i = 0; i < a.length(); i++){
            char x = a.charAt(i), y = b.charAt(i);
            if (iso.containsKey(x)){
                if ( iso.get(x) != y ) return false;
            }else {
                if ( iso.containsValue(y) ) return false;
                iso.put(x,y);
            }
        }
        return true;
    }
}
