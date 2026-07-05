class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        //Make new arrays and put integers accordingly
        for (int num : nums){
            if(num >= 0){
                pos.add(num);
            }
            else
            neg.add(num);
        }

        //Case 1: No negative numbers = positive array + square
        if (neg.size()==0){ //do not use .length for lists
            for(int i=0; i<pos.size();i++){
                pos.set(i, pos.get(i)* pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        //Case 2: No positive numbers = negative array + squaring then reversing.
        if(pos.size()==0){
            for(int i=0;i<neg.size();i++){
                neg.set(i, neg.get(i) * neg.get(i));
            }
            Collections.reverse(neg); //REVERSE OUTSIDE FOR LOOP
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        //Case 3: Both positive and negative integers
        //use 2 pointers
        int i=0,j=0,id=0;
        int n1=neg.size();
        int n2=pos.size();
        int res[] = new int[n1 + n2];

    //square negative and reverse them 
    for(i=0;i<n1;i++){
        neg.set(i, neg.get(i)*neg.get(i));
    }
    Collections.reverse(neg); //REVERSE OUTSIDE FOR LOOP

    //square positives
    for(i=0;i<n2;i++){
        pos.set(i, pos.get(i)* pos.get(i));
    }

    //merge the sorted arrays
    i=0;
    j=0;
    while(i < n1 && j < n2){
        if(neg.get(i) <= pos.get(j)){
            res[id++] = neg.get(i++); //involves 3 steps
            //res[id]=neg[i];
            //id++;
            //i++;
        }
        else 
        res[id++]=pos.get(j++);
    }
    while(i < n1){
        res[id++]=neg.get(i++);
    }

    while(j < n2){
        res[id++]=pos.get(j++);
    }
    return res;
    }
}