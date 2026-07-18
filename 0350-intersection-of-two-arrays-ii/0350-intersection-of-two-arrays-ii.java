class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        // step 1: build map
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        int[] temp = new int[nums2.length]; // FIXED
        int k = 0;

        // step 2: check nums2
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                temp[k++] = nums2[i];
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        // step 3: trim array
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = temp[i];
        }

        return res;
    }
}
