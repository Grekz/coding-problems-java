package mx.grekz.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author grekz
 */
public class E811_SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> res = new HashMap<>();
        for ( String dom : cpdomains ) {
            String[] cur = dom.split(" ");
            int count = Integer.valueOf(cur[0]);
            String sd = cur[1];
            res.put(sd, res.getOrDefault(sd,0) + count);
            int idx = sd.indexOf(".");
            while ( idx > -1 ) {
                sd = sd.substring(idx + 1);
                res.put(sd, res.getOrDefault(sd, 0) + count);
                idx = sd.indexOf(".");
            }
        }
        List<String> resultList = new ArrayList<>();
        for ( Map.Entry<String, Integer> entry : res.entrySet() ) {
            resultList.add(entry.getValue() + " " + entry.getKey());
        }
        return resultList;
    }
}