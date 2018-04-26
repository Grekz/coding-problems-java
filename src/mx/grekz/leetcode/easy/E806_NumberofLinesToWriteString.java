package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E806_NumberofLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int lastLength = 0;
        int lines =0;
        for (char letter: S.toCharArray()){
            int curWidth = widths[letter - 97];
            if (lastLength + curWidth > 100){
                lines+=1;
                lastLength = curWidth;
            } else {
                lastLength += curWidth;
            }
        }
        if ( lastLength < 100 ) {
            lines+=1;
        }
        return new int[]{lines, lastLength};
    }
}