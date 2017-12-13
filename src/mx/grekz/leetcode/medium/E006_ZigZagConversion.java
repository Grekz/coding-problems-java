package mx.grekz.leetcode.medium;

/**
 * https://leetcode.com/problems/zigzag-conversion
 * 
 * @author grekz
 *
 */
public class E006_ZigZagConversion {
    public String convert(String s, int rows) {
        if (rows < 2) return s;
        StringBuilder[] sb = new StringBuilder[rows];
        for (int i = 0; i < rows; i++) sb[i] = new StringBuilder();
        int i = 0, len = s.length();
        char[] c = s.toCharArray();
        while ( i < len ) {
            int j;
            for (j = 0; j < rows && i < len; j++)
                sb[j].append(c[i++]);
            for (j = rows - 2; j > 0 && i < len; j--)
                sb[j].append(c[i++]);
        }
        // return Arrays.stream(sb).map( x -> x.toString()).reduce("", (a,b) -> a.concat(b));
        StringBuilder res = new StringBuilder();
        for(StringBuilder x : sb)
            res.append(x);
        return res.toString();
    }
}
