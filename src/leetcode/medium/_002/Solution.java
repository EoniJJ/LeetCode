package leetcode.medium._002;

/**
 * Created by Arron on 2017/5/16.
 */
public class Solution {
    /*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    */
//    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            l1 = new ListNode(0);
        } else if (l2 == null) {
            l2 = new ListNode(0);
        }
        int val = (l1.val + l2.val) % 10;
        int temp = (l1.val + l2.val) / 10;
        ListNode listNode = new ListNode(val);
        if (temp > 0) {
            if (l1.next == null) {
                l1.next = new ListNode(temp);
            } else {
                l1.next.val += temp;
            }
        }
        listNode.next = addTwoNumbers(l1.next, l2.next);
        return listNode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = solution.new ListNode(2);
        listNode.next = solution.new ListNode(4);
        listNode.next.next = solution.new ListNode(3);
        ListNode listNode2 = solution.new ListNode(5);
        listNode2.next = solution.new ListNode(6);
        listNode2.next.next = solution.new ListNode(4);
        ListNode result = solution.addTwoNumbers(listNode, listNode2);
        while (true) {
            System.out.print(result.val + "\t");
            result = result.next;
            if (result == null) {
                break;
            }
        }
    }
}
