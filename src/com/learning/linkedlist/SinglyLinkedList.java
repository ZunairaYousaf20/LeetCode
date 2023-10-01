package com.learning.linkedlist;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }


    public void insertAtFront(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail= head;
        }

        size++;
    }

    public void insertAtLast(int val) {
        if(tail == null) {
            insertAtFront(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertAtFront(val);
            return;
        }

        if(index == size - 1) {
            insertAtLast(val);
            return;
        }

        Node currentNode = head;
        for (int i = 1; i < index ; i++) {
            currentNode = currentNode.next;
        }
        Node node = new Node(val, currentNode.next);
        currentNode.next = node;
        size++;
    }

    public void displayLinkedList() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("END");
    }

    public int deleteAtFront() {
        int val = head.data;
        head = head.next;

        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteAtLast() {
        if(size <= 1) {
            return deleteAtFront();
        }

        int val = tail.data;
        Node secondLast = getNode(size - 2);
        tail = secondLast;
        secondLast.next = null;

        size--;
        return val;
    }

    public int delete(int index) {
        if(index == 0) {
            return deleteAtFront();
        }

        if(index == size - 1) {
            return deleteAtLast();
        }

        Node prev = getNode(index - 1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node getNode(int index) {
        Node currentNode = head;
        for (int i = 1; i <= index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public int getSize() {
        return size;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
