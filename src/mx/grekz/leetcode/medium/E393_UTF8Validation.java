package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E393_UTF8Validation {
    public boolean validUtf8(int[] data) {
        int c = 0;
        for ( int d : data ) {
            if ( d >= 128 && d <= 191 ) {
                if ( c == 0 )
                    return false;
                c -= 1;
            }else{
                if ( c != 0 )
                    return false;
                if ( d >= 128 ){
                    if (d < 224)
                        c = 1;
                    else if (d < 240)
                        c = 2;
                    else if (d < 248)
                        c = 3;
                    else
                        return false;   
                }
            }
        }
        return c == 0;
    }
}