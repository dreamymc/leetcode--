import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

    public static void main(String[] ukiyo) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }



    public static List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }


    public static void backtrack(List<String> result,String currentString, int openN, int closedN, int n) {
        if(currentString.length() == n*2){
            result.add(currentString);
            System.out.println(currentString);
            return;
        }
        if(openN < n) backtrack(result, currentString+"(", openN+1, closedN, n);
        if(closedN < openN) backtrack(result, currentString+")", openN, closedN+1, n);
    }
}
