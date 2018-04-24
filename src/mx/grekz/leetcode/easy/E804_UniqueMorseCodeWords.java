package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E804_UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        String[] cc = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> s = new HashSet<>();
        for ( String w : words ) {
            String x = "";
            for ( char c : w.toCharArray()){
                x+=cc[c-97];
            }
            s.add(x);
        }
        return s.size();
    }
}