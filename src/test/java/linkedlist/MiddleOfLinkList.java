package linkedlist;

public class MiddleOfLinkList {

    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
            next=null;
        }

    }

    public static void main(String [] args){
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);
        n1.next.next.next.next.next.next = new Node(7);

        print(n1);
        middleofList(n1);

    }

    private static void middleofList(Node n1) {
        Node slow=n1,fast=n1;int cnt=0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            //System.out.println(++cnt);
            //System.out.println(fast.data);
        }

        System.out.println(slow.data);


    }

    private static void print(Node node) {

        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
}
