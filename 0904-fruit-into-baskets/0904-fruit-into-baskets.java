class Solution {
    public int totalFruit(int[] fruits) {
        int len=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int j=0;
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            if(map.size()>2){
                map.put(fruits[j],map.get(fruits[j])-1);
                if(map.get(fruits[j])==0){
                    map.remove(fruits[j]);
                }
                j++;
                
                
            }
            len=Math.max(i-j+1,len);
        
        }
        return len;
    }
}