package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E492_ConstructtheRectangle {
    public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area);
        while ( area%w != 0 ) w--;
        return new int[]{area/w, w};
    }
}