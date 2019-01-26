package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E165_CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\."), b = version2.split("\\.");
        int al = a.length, bl = b.length;
        int n = Math.max(al, bl);
        for (int i = 0; i < n; i++) {
            int c = (i < al ? Integer.parseInt(a[i]) : 0) - (i < bl ? Integer.parseInt(b[i]) : 0);
            if (c > 0) {
                return 1;
            } else if (c < 0) {
                return -1;
            }
        }
        return 0;
    }
}