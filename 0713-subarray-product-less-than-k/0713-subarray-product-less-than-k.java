class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       if (k <= 1) {
            return 0;
        }
        int prod=1;
        int c=0;
        int j=0;
         for(int i=0;i<nums.length;i++)
         {
             
             prod*=nums[i];
            
             while(prod>=k){
                
                 prod=prod/nums[j];
                 j++;
             }
             c+=i-j+1;
         }   
         return c;
    }
}