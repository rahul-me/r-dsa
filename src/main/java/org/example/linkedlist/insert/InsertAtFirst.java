package org.example.linkedlist.insert;

import java.util.Objects;

class Node {

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    int data;
    Node next;
}

class LinkedList {
    Node head;

    void insertAtFront(int newData) {
        if(head == null) {
            head = new Node(newData);
            return;
        }

        Node temp = new Node(newData);
        temp.next = head;
        head = temp;

    }

    void print() {
        if(Objects.isNull(head)) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class InsertAtFirst {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.print();

        linkedList.insertAtFront(5);
        linkedList.print();
        linkedList.insertAtFront(4);
        linkedList.print();
        linkedList.insertAtFront(3);
        linkedList.insertAtFront(2);
        linkedList.insertAtFront(1);
        linkedList.print();
    }

}
