class Solution {
    
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
               sum+=nums[i];
               int r=sum%k;
               if (r < 0) r += k;
               if(map.containsKey(r)){
                  if(i-map.get(r)>=2){
                    return true;
                  }
               }
                  else{
                    map.put(r,i);
                  
               }
        }
        return false;
    }
}