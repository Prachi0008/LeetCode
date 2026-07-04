class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> result = new ArrayList<>();
        // sort array first
        Arrays.sort(nums);
        //traverse the sorted array
        for(int i=0;i<n-2;i++){
            //skip duplicates
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
        
    while(left < right){
        int sum = nums[left] + nums[i] + nums[right];
        if(sum == 0){
            result.add(Arrays.asList(nums[i],nums[left], nums[right]));
            //skip duplicates for left pointer
            while(left < right && nums[left] == nums[left+1]){
                left++;
            }
            //skip duplicates for right pointer
            while(left < right && nums[right]==nums[right-1]){
                right--;
            }
            left++;
            right--;
        }
        else if(sum < 0){
            left++;
        }
        else{
            right--;
        }
    }
}
    return result;
    }
}
//BRACKETS KA DHYAAN RAKHO !