package com.learning.linkedlist;

public class DoublyLinkedList {
    Node head;

    public void insertAtFront(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtLast(int val) {
        Node newNode = new Node(val);
        Node last = head;

        newNode.next = null;

        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;

    }

    public void insert(int after, int val) {
        Node prevNode = find(after);


        if(prevNode == null) {
            System.out.println("After Node does not found");
            return;
        }

        Node newNode = new Node(val);
        Node nextOfPrev = prevNode.next;
        prevNode.next = newNode;
        newNode.next = nextOfPrev;
        newNode.prev = prevNode;

        if(nextOfPrev != null) {
            nextOfPrev.prev = newNode;
        }
    }

    public Node find(int val) {
        Node currentNode = head;

        while(currentNode != null) {

            if(currentNode.data == val) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void displayDLL() {
        Node tempNode = head;
        Node last = null;

        while (tempNode != null) {
            last = tempNode;
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("END");

        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
