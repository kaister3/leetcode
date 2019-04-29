/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */
class Solution {
    public int lengthOfLastWord(String s) {
        String result = deleteSpace(s);
        //System.out.println(result);
        if(s.length() == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < result.length(); i++) {
            if(result.charAt(i) != ' ') {
                res++;
            }
            else {
                res = 0;
            }
        }
        return res;
    }
    String deleteSpace(String s) {
        if (s.length() == 0) {
            return "";
        }
        while(s.length() > 1 &&s.charAt(s.length()-1) == ' ') {
            int len = s.length();
            s = s.substring(0, len-1);
        }
        return s;
    }
}

