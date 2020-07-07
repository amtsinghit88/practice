package linkedlist;

public class NthNodeFromEnd {

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
        nthNodeEnd(n1,3);

    }

    private static void nthNodeEnd(Node n1, int cnt) {
        Node temp = n1,slow=n1,fast=n1;
        while(temp!=null && fast.next!=null) {

            while (cnt > 0) {
                fast = fast.next;
                cnt--;
            }
            fast = fast.next;
            slow = slow.next;

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
