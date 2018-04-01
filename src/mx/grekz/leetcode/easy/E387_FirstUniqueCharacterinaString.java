package mx.grekz.leetcode.easy;

import java.util.Arrays;

/**
 * @author grekz
 */
public class E387_FirstUniqueCharacterinaString {

    public int firstUniqChar(String s) {
        char[] str = s.toCharArray();
        int[] inds = new int[26];
        Arrays.fill(inds, -1);
        for(int i = 0; i < str.length; i++){
            int c = str[i] - 'a';
            if(inds[c] == -1) inds[c] = i;
            else inds[c] = Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE, res = -1;
        for(int i = 0; i < 26; i++){
            if (inds[i] != -1 && inds[i] < min){
                min = inds[i];
                res = inds[i];
            }
        }
        return res;
    }
}