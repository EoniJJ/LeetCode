package leetcode.easy._014;

/**
 * Created by Arron on 2017/6/5.
 */
public class Solution {

    /*
    *
    * Write a function to find the longest common prefix string amongst an array of strings.
    *
    * */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String longest = strs[0];
        for (int i = 0; i < strs.length; i++) {
            int temp = 0;
            while(temp < longest.length() && temp < strs[i].length() && longest.charAt(temp) == strs[i].charAt(temp)) {
                temp++;
            }
            longest = longest.substring(0, temp);
        }
        return longest;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"aa", "ab"}));
    }
}
