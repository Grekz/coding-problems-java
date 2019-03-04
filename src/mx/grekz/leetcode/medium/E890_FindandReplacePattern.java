package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E890_FindandReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for ( String x : words ) {
            if ( check(x, pattern) ) {
                res.add(x);
            }
        }
        return res;
    }
    private boolean check(String a, String b) {
        int i = 0;
        Map<Character, Character> tmp = new HashMap<>();
        for ( char x : a.toCharArray() ) {
            char p = b.charAt(i++);
            tmp.putIfAbsent(x, p);
            if ( tmp.get(x) != p )
                return false;
        }
        boolean cs[] = new boolean[26];
        for ( char x : tmp.values() ) {
            if ( cs[x - 97] )
                return false;
            cs[x-97] = true;
        }     
        return true;
    }
}