class Solution {
    public int threeSumClosest(int[] nums, int target) {
      int n=nums.length;
      Arrays.sort(nums); //T=O(n logn)
      int closestSum = nums[0] + nums[1] + nums[2];

      for(int i=0;i<n-2;i++){
        int left = i+1;
        int right = n-1;
        while(left < right){
            int sum =  nums[i] + nums[left] + nums[right]; //Write inside while loop, not only in for loop.
            if(Math.abs(sum - target) < (Math.abs(closestSum - target))){
                closestSum = sum;
            }
            else if(sum > target){
                right--;
                
            }
            else if(sum < target){
                left++;
            }
            else 
            return sum;
        }
      }
      return closestSum;
    }
}