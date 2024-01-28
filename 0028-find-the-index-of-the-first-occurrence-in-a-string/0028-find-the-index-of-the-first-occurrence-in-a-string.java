class Solution {
    public int strStr(String haystack, String needle) {
        
        int len = needle.length();
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++)
        {
            String sub = haystack.substring(i,i+len);
            
            if(sub.equalsIgnoreCase(needle))
                return i;
        }
        return -1;
        
    }
}