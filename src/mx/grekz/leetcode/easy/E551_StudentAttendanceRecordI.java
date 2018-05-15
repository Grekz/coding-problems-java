package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E551_StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        return !s.contains("LLL") && s.indexOf("A") == s.lastIndexOf("A");
    }
}