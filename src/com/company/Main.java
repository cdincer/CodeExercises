package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

//        ListNode<Integer> l1= {3, 1, 2, 3, 4, 5};
        Integer k1 = 3;
        ListNode l1 = new ListNode(2);

        ListNode l2 =new ListNode(4);
        l1.next=l2;
        ListNode l3 = new ListNode(3);
        l2.next=l3;

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        l4.next=l5;

        ListNode l6 = new ListNode(4);
        l5.next=l6;



        ListNode l7 = addTwoNumbers(l1, l4);
        ListNode l8 = l7.next;
        ListNode l9 = l8.next;

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

 public static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

}


