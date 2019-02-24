package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E932_BeautifulArray {
    public int[] beautifulArray(int N) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        while ( res.size() < N ) {
            List<Integer> tmp = new ArrayList<>();
            for ( int i : res ) if ( i * 2 - 1 <= N ) tmp.add(i * 2 - 1);
            for ( int i : res ) if ( i * 2 <= N ) tmp.add(i * 2);
            res = tmp;
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}