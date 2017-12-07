package mx.grekz.leetcode.medium;

import java.math.BigInteger;

public class E008_StringToInteger {

    public int myAtoi(String str) {
        str = str.trim();
        int len = str.length();
        if(len > 0){
            char firstChar = str.charAt(0);
            StringBuilder sb = new StringBuilder("");
            char sign = '+';
            if ( firstChar == '-' || firstChar == '+'){
                str = str.substring(1);
                sign = firstChar;
            }
            for(int i = 0; i < str.length(); i++){
                char curr = str.charAt(i);
                if(Character.isDigit(curr)){
                    sb.append(curr);
                }else {
                    break;
                }
            }
            if(sb.length() > 0){
                String numberStr = sign + sb.toString();
                BigInteger number = new BigInteger(numberStr);
                if( number.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0){
                    return Integer.MAX_VALUE;
                }else if (number.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.parseInt(numberStr);
                }
            }
        }
        return 0;
    }
}
