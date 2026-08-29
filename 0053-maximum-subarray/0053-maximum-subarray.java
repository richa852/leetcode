class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int b=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=b+nums[i];
            int v2=nums[i];
            b=Math.max(v1,v2);
            ans=Math.max(b,ans);
        }
        return ans;
    }
}