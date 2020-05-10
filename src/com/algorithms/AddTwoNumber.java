package com.algorithms;


public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode c1 =l1;
        ListNode c2 =l2;
        int temp=0;
        ListNode head=new ListNode(0);
        ListNode result=head;
        while(c1.next!=null||c2.next!=null){
            int x=(c1!=null) ? c1.val :0;
            int y=(c2!=null) ? c2.val :0;
            int sum =temp+x+y;
            temp=sum/10;
            result.next=new ListNode(sum%10);
            result=result.next;
            if (c1!=null) c1=c1.next;
            if (c2!=null) c2=c2.next;
        }
        if (temp>0){
            result.next=new ListNode(temp);
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}