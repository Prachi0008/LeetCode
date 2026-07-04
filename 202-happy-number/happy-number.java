class Solution {
    int fun(int a){
        int sum=0;
        while(a>0){
            int d=a%10;
            sum=sum+(d*d);
            a=a/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=fun(slow);
            fast=fun(fast);
            fast=fun(fast);
            if(slow==fast && slow!=1){
                return false;
            }
        }
        return true;
    }
}