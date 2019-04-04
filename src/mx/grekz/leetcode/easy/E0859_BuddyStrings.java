package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E0859_BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        int a = A.length(), b = B.length();
        if ( a != b ) return false;
        if ( !A.equals(B) ) {
            int xa = -1, xb = 2, ya = -1, yb = 4;
            for ( int i = 0; i < a; i++ )
                if ( A.charAt(i) != B.charAt(i) )
                    if ( xa == -1 ) {
                        xa = A.charAt(i);
                        yb = B.charAt(i);
                    }else if ( ya == -1 ) {
                        ya = A.charAt(i);
                        xb = B.charAt(i);
                    }else{
                        return false;
                    }
            return ya == yb && xa == xb;
        }else{
            int x[] = new int[26];
            for ( char y : A.toCharArray() ) x[y - 97] += 1; 
            for ( int z : x ) if ( z > 1 ) return true;
        }
        return false;
    }
}