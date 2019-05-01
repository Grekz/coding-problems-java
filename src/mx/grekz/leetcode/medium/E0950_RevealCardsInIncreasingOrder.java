package mx.grekz.leetcode.medium;

/**
 * @author grekz
 */
public class E0950_RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Deque<Integer> queue = new LinkedList<>();
        for(int i = 0; i<n; ++i)
            queue.add(i);
        int[] res = new int[n];
        Arrays.sort(deck);
        for ( int card : deck ) {
            res[queue.pollFirst()] = card;
            if ( !queue.isEmpty() ) {
                queue.add(queue.pollFirst());
            }
        }
        return res;
    }
}