class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k=0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == val)
            {
                nums[i] = -1;
            }
            else
                k++;
        }
        
        if(k == 0)
            return k;
        else
        {
        
        int i = 0, j = nums.length-1;
        
        while(i <= j)
        {
            if(nums[j] == -1)
                j--;
            else if(nums[j] != -1 && nums[i] == -1)
                nums[i++] = nums[j--];
            else
                i++;
                
            
        }
        
        return k;
        }
    }
}