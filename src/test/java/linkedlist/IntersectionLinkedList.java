package linkedlist;

import java.util.HashSet;

public class IntersectionLinkedList {

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
        n1.next = new Node (2);
        n1.next.next = new Node (3);
        n1.next.next.next = new Node (4);
        n1.next.next.next.next = new Node (5);
        n1.next.next.next.next.next = new Node (6);
        n1.next.next.next.next.next.next = new Node (7);


        Node n2 = new Node(10);
        n2.next = new Node(9);
        n2.next.next = new Node(8);
        n2.next.next.next=n1.next.next.next;
        print(n1);
        print(n2);
        System.out.println(megaNode(n1,n2).data);
    }

    private static Node megaNode(Node n1, Node n2) {
        HashSet<Node> set = new HashSet<>();
        while(n1!=null){
            set.add(n1);
            n1 = n1.next;
        }

        while(n2!=null){

            if(set.contains(n2))
                return n2;
            set.add(n2);
            n2 = n2.next;
        }
    return null;

    }

    private static void print(Node n1) {
        Node cur = n1;

        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}
