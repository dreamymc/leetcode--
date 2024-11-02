import java.util.*;

public class LC2022 {
    public static void main(String[] args) {
        int original[] = { 3 };
        int m = 1;
        int n = 2;
        int[][] result = construct2DArray(original, m, n);

        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) 
            return new int[0][0];
        int[][] res = new int[m][n];
        Queue<Integer> q = new LinkedList<>();
        for (int num : original)
            q.add(num);
        for (int j = 0; j < m; j++) 
            for (int i = 0; i < n; i++)
                res[j][i] = q.poll();
        return res;
    }
}
