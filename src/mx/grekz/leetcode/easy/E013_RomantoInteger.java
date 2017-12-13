package mx.grekz.leetcode.easy;

public class E013_RomantoInteger {
    public int romanToInt(String s) {
        int t[] = new int[s.length()], i = 0, res = 0;
        
        for (char c : s.toCharArray()) {
            int val = 0;
            switch(c) {
                case 'M': val = 1000; break;
                case 'D': val = 500; break;
                case 'C': val = 100; break;
                case 'L': val = 50; break;
                case 'X': val = 10; break;
                case 'V': val = 5; break;
                case 'I': val = 1; break;
                default: break; 
            }
            t[i++] = val;
        }
        for ( i = 0;  i < t.length - 1; i++)
            res += t[i] * ( t[i] < t[i+1] ? -1 : 1 ) ;
        return res + t[t.length - 1];
    }
}
