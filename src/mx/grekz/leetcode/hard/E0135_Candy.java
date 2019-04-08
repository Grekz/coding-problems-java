package mx.grekz.leetcode.hard;

/**
 * @author grekz
 */
public class E0135_Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] tmp = new int[n];
        Arrays.fill(tmp, 1);
        for ( int i = 1; i < n; i++ )
            if ( ratings[i] > ratings[i-1] )
                tmp[i] = tmp[i - 1] + 1;
        int res = tmp[n - 1];
        for ( int i = n - 2; i >= 0; i-- ){
            if ( ratings[i] > ratings[i+1] )
                tmp[i] = Math.max(tmp[i], tmp[i+1] + 1);
            res += tmp[i];
        }
        return res;
    }
}