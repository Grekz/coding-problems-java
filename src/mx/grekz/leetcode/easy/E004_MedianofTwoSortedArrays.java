public class E004_MedianofTwoSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ( nums1.length > nums2.length )
            return findMedianSortedArrays(nums2, nums1);
        int a = nums1.length,
            b = nums2.length,
            l = 0, 
            h = a;
        while ( l <= h ) {
            int m1 = ( l + h ) / 2,
                m2 = ( a + b + 1 ) / 2  - m1,
                maxLeftA = m1 == 0 ? Integer.MIN_VALUE : nums1[m1 - 1],
                minRighA = m1 == a ? Integer.MAX_VALUE : nums1[m1],
                maxLeftB = m2 == 0 ? Integer.MIN_VALUE : nums2[m2 - 1],
                minRighB = m2 == b ? Integer.MAX_VALUE : nums2[m2];
            
            if (maxLeftA > minRighB) {
                h = m1 - 1;
            } else if ( maxLeftB > minRighA ) {
                l = m1 + 1;
            } else {
                if ( ( a + b ) % 2 == 0 ) {
                    return  ((double) Math.max(maxLeftA, maxLeftB) + Math.min(minRighA, minRighB)) / 2;
                }
                return ((double) Math.max(maxLeftA, maxLeftB));
            }
        }
        return -1d;
    }
}
