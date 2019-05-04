package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E0880_DecodedStringatIndex {
    public String decodeAtIndex(String S, int K) {
        long size = 0;
        int N = S.length();
        for (char c : S.toCharArray() )
            if (Character.isDigit(c))
                size *= c - '0';
            else
                size++;
        for (int i = N-1; i >= 0; --i) {
            char c = S.charAt(i);
            K %= size;
            if (K == 0 && Character.isLetter(c))
                return Character.toString(c);

            if (Character.isDigit(c))
                size /= c - '0';
            else
                size--;
        }
        return "";
    }
}