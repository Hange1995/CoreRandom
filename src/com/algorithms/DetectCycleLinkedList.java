package com.algorithms;

import com.generics.List;

public class DetectCycleLinkedList {
    static class ListNode{
        int value;
        ListNode next;


        public ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode getMeetPoint(ListNode head) {
        ListNode slow = head;
        ListNode quick=head;
        while (quick!=null && quick.next!=null  ){
            slow=slow.next;
            quick=quick.next.next;
            if (slow==quick) return slow;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        if (head==null) return null;
        ListNode meetPoint= getMeetPoint(head);
        if (meetPoint==null) return null;
        ListNode a1 = head;
        ListNode a2=meetPoint;
        while (a1!=a2){
            a1=a1.next;
            a2=a2.next;
        }
        return a1;
    }


        public static void main(String[] args) {
        ListNode a1=new ListNode(-1);
        ListNode a2=new ListNode(-7);
        ListNode a3=new ListNode(7);
        ListNode a4=new ListNode(-4);
        ListNode a5=new ListNode(19);
        ListNode a6=new ListNode(6);
        ListNode a7=new ListNode(-9);
        ListNode a8=new ListNode(-5);
        ListNode a9=new ListNode(-2);
        ListNode a10=new ListNode(-5);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=a6;
        a6.next=a7;
        a7.next=a8;
        a8.next=a9;
        a9.next=a10;
        a10.next=a7;
        DetectCycleLinkedList detectCycleLinkedList=new DetectCycleLinkedList();
        System.out.println(detectCycleLinkedList.detectCycle(a1).value);
    }
}
