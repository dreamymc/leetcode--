import java.util.Collections;
import java.util.PriorityQueue;

public class leetcode1046 {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[] { 2, 7, 4, 1, 8, 1 }));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int weight : stones)
            max_heap.add(weight);
        while (max_heap.size() != 1) {
            int y = max_heap.poll();
            int x = max_heap.poll();
            if (x != y)
                max_heap.add(y - x);
        }
        if (max_heap.size() == 1)
            return max_heap.peek();
        return 0;
    }
}
