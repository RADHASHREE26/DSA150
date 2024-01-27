class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        int i = 0, j = i+1;
        int c = 0;
        while(j < nums.length)
        {
            if(nums[i] == nums[j]){
                c++;
            }
            else{
                i = i+1;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
        }
        
        return nums.length - c;
        
    }
}