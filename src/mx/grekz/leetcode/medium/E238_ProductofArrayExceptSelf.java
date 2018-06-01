package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E238_ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] a) {
        int  t =1;
        int p[] = new int[a.length];
        for(int i = 0 ; i < a.length ; i++){
            p[i] = t;
            t *= a[i];
        }
        t = 1;
        for(int i = a.length-1 ; i >= 0 ; i--){
            p[i] *= t;
            t *= a[i];
        }return p;
    }
}