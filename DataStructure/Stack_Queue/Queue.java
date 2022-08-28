package DataStructure.Stack_Queue;

import java.util.*;
public class Queue {
    
    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            next =null;
        }
    }

    Node head;

    public Queue(){
        head = null;
    }

    //addLast
    public void enQueue(int item) {
        Node newNode = new Node(item);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public int deQueue() {
        if(head != null) {
            Node temp = head;
            head = head.next;
            return temp.data;
        }
        return -1;
    }

    public static void main(String []args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(12);
        queue.enQueue(122);
        Node curr = queue.head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        queue.deQueue();
        Node curr2 = queue.head;
        while(curr2 != null){
            System.out.print(curr2.data + " ");
            curr2 = curr2.next;
        }
    }
}
