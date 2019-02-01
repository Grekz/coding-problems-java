package mx.grekz.leetcode.hard;

/**
 * @author grekz
 */
public class E982_TripleswithBitwiseANDEqualToZero {
    public int countTriplets(int[] A) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>(A.length+1);
        for ( int a : A )
            for ( int b : A )
                map.put( (a&b) , map.getOrDefault( (a&b), 0 ) + 1);
        for ( Map.Entry<Integer,Integer> a : map.entrySet() )
            for ( int b : A )
                if ( ( a.getKey() & b ) == 0 ) 
                    res += a.getValue();
        return res;
    }
}