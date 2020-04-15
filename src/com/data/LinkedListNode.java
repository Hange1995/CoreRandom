package com.data;

public class LinkedListNode {
    private int value;
    private LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }

    public LinkedListNode() {
    }

    public boolean checkLoop(LinkedListNode linkedListNode){
        LinkedListNode quick = linkedListNode.next.next;
        LinkedListNode slow=linkedListNode.next;
        while(quick!=slow){
            if (quick!=null) {
                quick=quick.next.next;
                slow=slow.next;
            }else return false;
        }return true;
    }

    public static void main(String[] args) {
        LinkedListNode n1 = new LinkedListNode(5);
        LinkedListNode n2 = new LinkedListNode(4);
        LinkedListNode n3 = new LinkedListNode(5);
        LinkedListNode n4 = new LinkedListNode(4);
        LinkedListNode n5 = new LinkedListNode(5);
        LinkedListNode n6 = new LinkedListNode(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n3;
        LinkedListNode linkedListNode=new LinkedListNode();
        System.out.println(linkedListNode.checkLoop(n1));
    }

}
