class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();
        int left=0;
        int right=0;
        int res=0;
        for(right=0;right<fruits.length;right++)
        {
            count.put(fruits[right], count.getOrDefault(fruits[right],0)+1);
            //remove from hashmap
            while(count.size()>2)
            {
                count.put(fruits[left], count.get(fruits[left])-1);
                count.remove(fruits[left],0);
                left++;
            }
                int len=right-left+1;
                res=Math.max(res,len);
        }
        return res;
    }
}