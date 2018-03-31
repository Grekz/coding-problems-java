package mx.grekz.leetcode.easy;

import java.util.Arrays;

/**
 * @author grekz
 */
public class E350_IntersectionofTwoArraysII {

    public int[] intersect(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0, count = 0, x, y;
        while(i < a.length && j < b.length ){
            x = a[i];
            y = b[j];
            if ( x == y){
                i++;
                j++;
                count++;
            }else if( x < y){
                i++;
            }else{
                j++;
            }
        }
        int[] res = new int[count];
        count = 0;
        i = 0;
        j = 0;
        while(i < a.length && j < b.length){
            x = a[i];
            y = b[j];
            if ( x == y){
                i++;
                j++;
                res[count++] = x;
            }else if( x < y){
                i++;
            }else{
                j++;
            }
        }
        return res;
    }
}