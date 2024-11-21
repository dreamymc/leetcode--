import java.util.Arrays;

public class leetcode2070 {
    public static void main(String[] args) {
        int items[][] = { { 1, 2 }, { 3, 2 }, { 2, 4 }, { 5, 6 }, { 3, 5 } };
        int queries[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(maximumBeauty(items, queries)));
    }

    public static int[] maximumBeauty(int[][] items, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(items, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int maxBeauty = 0;
        int j = 0;
        for (int i = 0; i < queries.length; i++) {
            while (j < items.length && items[j][0] <= queries[i]) {
                maxBeauty = Math.max(maxBeauty, items[j][1]);
                j++;
            }
            res[i] = maxBeauty;
        }
        return res;
    }
}
