class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            // 1. If it's an opening bracket, push it
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // 2. If it's a closing bracket
            else {
                // If stack is empty, there is no opening bracket to pair with
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}