package mx.grekz.leetcode.easy;

public class E204_CountPrimes {
    public int countPrimes(int n) {
        if ( n < 3 )
            return 0;
        boolean[] prim = new boolean[n + 1];
        int count = 0;
        for ( int i = 2; i * i <= n; i++ ) {
            if ( !prim[i] ) {
                for ( int j = i*2; j <= n; j+=i )
                    prim[j] = true;   
            }
        }
        for (int i = 2; i < n; i++){
            if (!prim[i]) count++;
        }
        return count;
    }
}
