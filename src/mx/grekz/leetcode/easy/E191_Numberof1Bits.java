package mx.grekz.leetcode.easy;

public class E191_Numberof1Bits {
    public int hammingWeight(int i) {
        int count = 0;
        while(i != 0 ){
            count += i & 1;
            i = i >>> 1;
        }
        return count;
        
    }
}
