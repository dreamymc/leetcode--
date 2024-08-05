import java.util.*;

public class LC2053 {
    public static void main(String[] args) {
        String[] arr = { "d","b","c","b","c","a" };
        int k = 2;
        System.out.println(kthDistinct(arr, k));

    }

    public static String kthDistinct(String[] arr, int k) { //19ms (mine)
        List<String> duplicates = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            if (!map.containsKey(arr[i]))
                map.put(arr[i], i);
            else
                duplicates.add(arr[i]);
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.removeAll(duplicates);
        if (list.size() < k)
            return "";
        else
            return list.get(k - 1);
    }
}

//6ms
// public String kthDistinct(String[] arr, int k) {
//     Map<String, Integer> countMap = new HashMap<>();

//     // Count occurrences of each string
//     for (String s : arr) {
//         countMap.put(s, countMap.getOrDefault(s, 0) + 1);
//     }

//     // Identify distinct strings in order and find the kth distinct
//     int distinctCount = 0;
//     for (String s : arr) {
//         if (countMap.get(s) == 1) {
//             distinctCount++;
//             if (distinctCount == k) {
//                 return s;
//             }
//         }
//     }

//     // If there are fewer than k distinct strings, return an empty string
//     return "";
// }