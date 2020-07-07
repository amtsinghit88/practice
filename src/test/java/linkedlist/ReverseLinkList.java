package linkedlist;

public class ReverseLinkList {

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
        reverseList(n1);

    }

    private static void reverseList(Node n1) {
        Node prev=null,next=null,cur=n1;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        print(prev);

    }

    private static void print(Node node) {

        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
}
