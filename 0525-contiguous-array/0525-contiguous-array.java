class Solution {
    public int findMaxLength(int[] nums) {
        int c0=0;
        int c1=0;
        int len=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            else{
                c1++;
            }
            
            int diff=c0-c1;
            if(diff==0){
                len=i+1;
            }
            else if(map.containsKey(diff)){
                 len=Math.max(len,(i-map.get(diff)));
            }
            else{
                map.put(diff,i);
            }
        }
        return len;
    }
}