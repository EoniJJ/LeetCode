package leetcode.easy._009;

/**
 * Created by Arron on 2017/5/16.
 */
public class Solution {


//    Determine whether an integer is a palindrome. Do this without extra space. example:  52125 return true
    
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int result = 0;
        while (temp != 0) {
            result = result * 10 + temp % 10;
            temp = temp / 10;
        }
        return result == x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(-2147447412));
    }
}
