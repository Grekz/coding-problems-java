package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E841_KeysandRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean seen[] = new boolean[rooms.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        seen[0] = true;
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            for (int n : rooms.get(cur))
                if (!seen[n]) {
                    seen[n] = true;
                    stack.push(n);
                }
        }
        for (boolean x : seen)
            if (!x)
                return false;
        return true;
    }
}