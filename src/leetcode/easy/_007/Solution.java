package leetcode.easy._007;

/**
 * Created by Arron on 2017/5/16.
 */
public class Solution {

    /*
     Reverse digits of an integer.
    Example1: x = 123, return 321
    Example2: x = -123, return -321
    * */


    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int temp = result * 10 + x % 10;
            x = x / 10;
            if (temp / 10 != result) {
                result = 0;
                break;
            }
            result = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-5123));
    }
}
