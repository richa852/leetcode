class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int sum=0;
        int length=Integer.MAX_VALUE;;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                 length=Math.min(i-j+1,length);
                sum-=nums[j];
                j++;
            }
        }
       if (length == Integer.MAX_VALUE) {
    return 0;
} else {
    return length;
}

    }
}