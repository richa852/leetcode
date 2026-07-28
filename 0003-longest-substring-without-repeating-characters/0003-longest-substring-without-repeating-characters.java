class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int j=0;
        int length=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch)>1){
                  char ch1=s.charAt(j);
               map.put(ch1,map.get(ch1)-1);
               if(map.get(ch1)==0){
                map.remove(ch1);
               }
               j++;
            }
             length=Math.max(i-j+1,length);
        }
        return length;
    }
}