public class Solution20 {
    public boolean isValid(String s) {
        char[] stack;
        int top = -1;
        if (s.length() > 1 && s.length() <= 10000) {
            stack = new char[s.length()];
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    stack[++top] = s.charAt(i);
                } else {
                    if (top >= 0 && stack[top] == '(' && s.charAt(i) == ')') {
                        top--;
                    } else if (top >= 0 && stack[top] == '[' && s.charAt(i) == ']') {
                        top--;
                    } else if (top >= 0 && stack[top] == '{' && s.charAt(i) == '}') {
                        top--;
                    } else return false;
                }
            }
            return top == -1;
        }
        return false;
    }
}

