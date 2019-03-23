class Solution {
    public String next(String a){
        String result = "";
        int i = 0;
        while (i < a.length()) {
            char cur_ch = a.charAt(i);
            int cnt = 0;
            while (i < a.length() && cur_ch == a.charAt(i)) {
                cnt++;
                i++;
            }
            result += cnt;
            result += cur_ch;
        }
        return result;
    }

    public String countAndSay(int n) {
        String num = "1";
        while (--n > 0) {
            num = next(num);
        }
        return num;
    }
}