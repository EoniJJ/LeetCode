package leetcode.medium._006;

/**
 * Created by Arron on 2017/5/16.
 */
public class Solution {

    /*
    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

    P   A   H   N
    A P L S I I G
    Y   I   R
    And then read line by line: "PAHNAPLSIIGYIR"
    Write the code that will take a string and make this conversion given a number of rows:

    string convert(string text, int nRows);
    convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".



    0       4       8
    1   3   5   7   9
    2       6


    0           6           12
    1       5   7       11  13
    2   4       8   10      14
    3           9           15
    */

    public String convert(String s, int numRows) {
        if (s == null || s == "" || s.length() < numRows || numRows < 2) {
            return s;
        }
        int sectionSize = 2 * numRows - 2;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += sectionSize) {
                result.append(s.charAt(j));
                if (i != 0 && i != numRows - 1) {
                    //不是第一行也不是最后一行
                    int temp = j + (numRows - i - 1) * 2;
                    if (temp < s.length()) {
                        result.append(s.charAt(temp));
                    }
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("PAYPALISHIRING", 4));
    }

}
