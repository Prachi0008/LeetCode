class Solution {
    public int minSubArrayLen(int target, int[] nums) {
/*    //     int n=nums.length;
    //     int low=0;
    //     int high=0;
    //     int res=Integer.MAX_VALUE;
    //     int sum=0;

    //     while(high<n)
    //     {
    //         sum = sum+nums[high];
    //         while(sum>=target)
    //         {
    //             int len=high-low+1;
    //             res=Math.min(res,len);
    //             sum=sum-nums[low];
    //             low++;
    //             }
    //         high++;
    //         }
    //         if(res==Integer.MAX_VALUE){
    //             return 0;
    //         }
    //         else 
    //         return res;
    //     }  
    // }

//take 2
    int n=nums.length;
    int low=0;
    int high=0;
    int sum=0;
    int res=Integer.MAX_VALUE;

    while(high<n){
        sum+=nums[high];

        while(sum>=target){
            int len=high-low+1;
            res=Math.min(res,len);

            //fire
            sum=sum-nums[low];
            low++;
        }
        high++;
    }
    if(res==Integer.MAX_VALUE){
        return 0;
    }
    else
    return res;
*/
//take 3 
int low=0;
int high=0;
int res=Integer.MAX_VALUE;
int n=nums.length;
int sum=0;

for(high=0;high<n;high++){
    sum+=nums[high];

    while(sum>=target)
    {
       int len=high-low+1;
       res=Math.min(res,len);

       //fire
       sum=sum-nums[low];
       low++;
    }
}
if(res==Integer.MAX_VALUE)
{
    return 0;
}
else
{
    return res;
}
    }
}