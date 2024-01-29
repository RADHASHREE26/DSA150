class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.strip();
        int i = s.length()-1;
        int len = 0;
        
        while(i >= 0 && s.charAt(i) != ' '){
            len++;
            i--;
        }
        
        return len;
        
    }
}