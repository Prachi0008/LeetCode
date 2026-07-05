//myanatomy

import java.util.*;
 
class Solution {
 
    public boolean checkSubarraySum(int[] nums, int k) {
 
       
        HashMap<Integer, Integer> map = new HashMap<>();
 
        // Important:
        // remainder 0 is considered at index -1
        // Helps when subarray starts from index 0
        map.put(0, -1);
 
        int prefixSum = 0;
 
        for (int i = 0; i < nums.length; i++) {
 
            // Build prefix sum
            prefixSum += nums[i];
 
            // Calculate remainder
            int remainder = prefixSum % k;
 
            // If same remainder appeared before
            if (map.containsKey(remainder)) {
 
                int prevIndex = map.get(remainder);
 
                // Length of subarray must be at least 2
                if (i - prevIndex >= 2) {
                    return true;
                }
 
            } else {
 
                // Store only first occurrence
                map.put(remainder, i);
            }
        }
 
        return false;
    }
}
 