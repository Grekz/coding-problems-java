package mx.grekz.leetcode.easy;

public class E088_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0 ) return;
        int i = m -1 , j = n - 1, ind = n + m  - 1;
        while(ind >= 0 ){
            if(i < 0) nums1[ind--] = nums2[j--]; 
            else if(j < 0) nums1[ind--] = nums1[i--]; 
            else if(nums1[i] > nums2[j]) nums1[ind--] = nums1[i--];
            else nums1[ind--] = nums2[j--]; 
        }
    }
}
