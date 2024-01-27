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

/*

Optimal Solution

class Solution {
    public int majorityElement(int[] arr) {
        int c=0,ele=0;

		for(int i=0;i<arr.length;i++)
		{
			if(c==0)
			ele=arr[i];
			if(ele==arr[i])
			c++;
			else
			c--;
		}
		
		return ele;
    }
}


*/