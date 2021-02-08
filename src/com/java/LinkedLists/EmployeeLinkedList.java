package com.java.LinkedLists;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmppty()) {
            return null;
        }
        EmployeeNode node = head;
        head = head.getNext();
        size--;
        node.setNext(null);
        return node;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmppty() {
        return head == null;
    }

    public void printList() {

        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
