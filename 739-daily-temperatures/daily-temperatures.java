class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> st = new ArrayDeque<>(); // Stores indices

        for (int i = n - 1; i >= 0; i--) {
            // Pop indices of days that are cooler than or equal to current day
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            // If stack is not empty, top index is the next warmer day
            if (!st.isEmpty()) {
                answer[i] = st.peek() - i;
            }

            // Push current index onto the stack
            st.push(i);
        }
        return answer;
    }
}