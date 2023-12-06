import java.util.*;

public class findThePrefixCommonArray {
    public static void main(String[] ukiyo) {
        new findThePrefixCommonArray();
    }

    public findThePrefixCommonArray() {
        exe();
    }

    private void exe() {
        int A[] = { 1, 3, 2, 4 };
        int B[] = { 3, 1, 2, 4 };
        for (int each : findThePrefixCommonArray(A, B))
            System.out.println(each);
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int C[] = new int[A.length];
        for (int i = 0; i < A.length || i < B.length; i++) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list1.add(A[j]);
                list2.add(B[j]);
            }
            list1.retainAll(list2);
            C[i] = list1.size();
        }
        return C;
    }
}
