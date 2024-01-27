class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            int c = hs.getOrDefault(nums[i], 0);
            hs.put(nums[i], ++c);
        }
        
        int len = nums.length/2;
        
        for (Map.Entry<Integer, Integer> i : hs.entrySet()) {
            
            int val = i.getValue();
            if(val > len)
                return i.getKey();
            
        }
        return 0;
        
    }
}