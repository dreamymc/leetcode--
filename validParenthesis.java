import java.util.Stack;

public class validParenthesis {
    public static void main(String[] ukiyo) {
        System.out.println(isValid("()"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("( { { { {} } } ) )"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                if (c == ')' && stack.pop() != '(' || c == ']' && stack.pop() != '['
                        || c == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
