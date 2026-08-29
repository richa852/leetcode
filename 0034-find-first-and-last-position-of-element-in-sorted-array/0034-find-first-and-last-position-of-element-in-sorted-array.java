class Solution {
    public int[] searchRange(int[] nums, int target) {
       int f=findFirst(nums, target);
    int l=findlast(nums,target);
        return new int[]{f,l};
    }
    public static int findFirst(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(target==nums[mid]){
                ans=mid;
                r=mid-1;
            }
            else if(target>nums[mid]){
                l=mid+1;
            }
            else{
                    r=mid-1;
            }

        }
    return ans;

    }
    public static int findlast(int[] nums, int target) {
          int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(target==nums[mid]){
                ans=mid;
                l=mid+1;
            }
            else if(target>nums[mid]){
                l=mid+1;
            }
            else{
                    r=mid-1;
            }


        }
        return ans;
    }
}