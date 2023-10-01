package com.learning.linkedlist;

public class MainSLL {
    public static void main(String[] args) {

/*        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertAtFront(74);
        linkedList.insertAtFront(15);
        linkedList.insertAtFront(36);
        linkedList.insertAtFront(47);
        linkedList.insertAtFront(18);
        linkedList.insertAtLast(63);
        linkedList.insert(99, 4);
        linkedList.displayLinkedList();
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.deleteAtFront());
        linkedList.displayLinkedList();
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.deleteAtLast());
        linkedList.displayLinkedList();
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.delete(3));
        linkedList.displayLinkedList();
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.delete(3));
        linkedList.displayLinkedList();
        System.out.println(linkedList.getSize());*/

        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insertAtFront(74);
        DLL.insertAtFront(15);
        DLL.insertAtFront(36);
        DLL.insertAtFront(47);
        DLL.insertAtFront(18);
        DLL.insertAtLast(23);
        DLL.insertAtLast(25);
        DLL.insert(18, 81);
        DLL.displayDLL();
    }
}
