package DataStructure.LinkList;


public class LinkList {

    public static class Node {
        int data;
        Node next;

        public Node () {
            this.next = null;
        }

        public Node (int data){
            this.data = data;
            this.next = null;
        }

    }

    public Node head;

    public static LinkList addFront (int data, LinkList list) {
        Node newNode = new Node(data);
        if (list.head == null) {list.head = newNode; return list;};
        newNode.next = list.head;
        list.head = newNode;
        return list;
    }

    public static LinkList addLast (int data, LinkList list) {
        Node newNode = new Node(data);
        if (list.head == null) {list.head = newNode; return list;};
        Node current = list.head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return list;
    }

    public static LinkList addInorder (int data, LinkList list) {
        Node newNode = new Node(data);
        if (list.head == null || list.head.data > data) {
            newNode.next = list.head;
            list.head = newNode; 
            return list;
        };
        Node current;
        Node prev = current = list.head;
        while(current != null && current.data < data) {
            prev = current;
            current = current.next;
        }
        newNode.next = current;
        prev.next = newNode;
        return list;
    }

    public static void printList(LinkList list) {
        Node current = list.head;
        while(current != null) {
            System.out.print(current.data  + " ");
            current = current.next;
        }
    }

    public static LinkList reverseList(LinkList list) {
        LinkList newList = new LinkList();
        Node current = list.head;
        while(current != null) {
            newList = addLast(current.data, newList);
            current = current.next;
        }
        return newList;
    }

    public static LinkList delete (int data, LinkList list) {
        if (list.head == null) {return list;}
        if (list.head.data == data) { list.head = list.head.next;}
        Node prev, current;
        prev = current = list.head;
        while(current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        if(current != null) {
            prev.next = current.next;
        }
        return list;
    }
    

    public static void main(String []args){
        LinkList list = new LinkList();
        list = addFront(1, list);
        list = addFront(2, list);
        list = addLast(100, list);
        printList(list);
    }
    
}
