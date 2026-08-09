class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxEnding=nums[0];
        int minEnding=nums[0];
        int product=nums[0];

        for(int i=1;i<n;i++){
            int v1=nums[i];
            int v2=maxEnding*nums[i];
            int v3=minEnding*nums[i];
            maxEnding = Math.max(v1,Math.max(v2,v3));
            minEnding = Math.min(v1,Math.min(v2,v3));
            product=Math.max(product,Math.max(maxEnding,minEnding)); 
        }
        return product;
    }
}