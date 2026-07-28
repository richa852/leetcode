class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int ans=0;
        int maxfreq=0;
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
             freq[s.charAt(i)-'A']++;
             maxfreq=Math.max(freq[s.charAt(i)-'A'],maxfreq);
             while((i-l+1)-maxfreq>k){
                 freq[s.charAt(l)-'A']--;
                 l++;
             }
             ans=Math.max(ans,i-l+1);

          }
          return ans;
    }
}