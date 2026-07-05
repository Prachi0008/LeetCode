//myanatomy

class Solution {
    public int maxSubArray(int[] nums) {
 
        //Initialize both current and maximum sum
        int currentSum = nums[0];
        int maxSum=nums[0];
 
        //Traverse array from second element
        for(int i =1; i<nums.length; i++){
 
            //Either start a new subarray
            // or continue existing
            currentSum= Math.max(nums[i], currentSum + nums[i]);
            //Update global maximum
            maxSum=Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
