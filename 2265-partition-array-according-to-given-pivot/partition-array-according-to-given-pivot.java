class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int temp[] = new int[nums.length];
        int k=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                temp[k++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                temp[k++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                temp[k++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        return nums;
    }
}