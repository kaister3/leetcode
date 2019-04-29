/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

 //小陷阱就是跑完循环之后记得把最后一个字符也加上，因为之前只是计数而已
 class Solution {
    static String countAndSay(int n) {
        StringBuilder res = new StringBuilder();
        if(n <= 0) {
            res.append("Fuck");
        }
        else if(n == 1) {
            res.append("1");
        }
        else {
            //main program
            String last = countAndSay(n-1);
            char cur = last.charAt(0);
            int count = 0;
            for (int i = 0; i < last.length(); i++) {
                if(cur == last.charAt(i)) {
                    count++;
                }
                else {
                    //res.concat(Integer.toString(count).concat(Character.toString(cur)));
                    res.append(count);
                    res.append(cur);
                    count = 1;
                    cur = last.charAt(i);
                }
            }
            res.append(count);
            res.append(cur);
        }
        //System.out.println(res);
        return res.toString();
    }
}

