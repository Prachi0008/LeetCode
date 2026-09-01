class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int res[] = new int[n];
        Arrays.fill(res,-1);//res[0]=-1;

        Deque<Integer> st = new ArrayDeque<>();

        for(int i=2*n-1;i>=0;i--)
        {
            int current = nums[i%n];
        /*To find the next greater element, you must pop elements that are smaller or equal*/
            while(!st.isEmpty() && st.peek()<=current) 
            {
                st.pop();

            }
            if(i<n)
            {
                if(st.isEmpty()){
                    res[i]=-1;
                }
                else
                res[i]=st.peek();
            }
            st.push(current); //imp step
        }
        return res;
    }
}