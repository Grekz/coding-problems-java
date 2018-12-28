package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E929_UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for ( String e : emails ) { 
            String[] parts = e.split("[+@]");
            set.add(parts[0].replaceAll(".","") + parts[parts.length - 1]);
        }
        return set.size();
    }
}