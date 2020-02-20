package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

//        ListNode<Integer> l1= {3, 1, 2, 3, 4, 5};
        Integer k1=3;

        ListNode<Integer> l1 = new ListNode<Integer>(3);

    }


  public static   ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        if (l == null) {
            return null;
        }

        ListNode<Integer> firstNode = null;
        ListNode<Integer> currentNode = null;
        ListNode<Integer> lastNode = null;

        ListNode<Integer> current = l;

        // iterate through the list, searching for the value k
        while (true) {
            if (current.value != k) {
                // since this node isnt k, set our variables and proceed on
                // set currentNode
                currentNode = current;
                // the set the previous nodes next = this node
                if (lastNode != null) lastNode.next = currentNode;
                // set lastNode to this current node
                lastNode = currentNode;
                // set the first node if it hasnt been set
                if (firstNode == null) firstNode = currentNode;
            }

            // when we hit the end, bail out.
            if (current.next == null) break;
            ListNode<Integer> next = current.next;
            current.next = null;
            current = next;

        }

        return firstNode;
    }

public static class ListNode<T> {
  ListNode(T x) {
    value = x;
  }
  T value;
  ListNode<T> next;
}

}


