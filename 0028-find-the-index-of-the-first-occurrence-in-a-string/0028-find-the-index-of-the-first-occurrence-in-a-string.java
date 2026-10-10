class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        
        // Loop up to the point where the needle can still physically fit
        for (int i = 0; i <= hLen - nLen; i++) {
            // Check if the current window matches the needle
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i; // Found the first occurrence!
            }
        }
        
        return -1; // Needle not found
    }
}
