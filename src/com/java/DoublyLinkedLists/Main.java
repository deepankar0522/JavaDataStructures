package com.java.DoublyLinkedLists;

public class Main {
    public static void main(String[] args) {

        Employee daneJones = new Employee("Jane", "Jones", 11);
        Employee johnDoe = new Employee("John", "Doe", 12);
        Employee marySmith = new Employee("Mary", "Smith", 13);
        Employee mikeWilson = new Employee("Mike", "Wilson", 14);
        Employee billEnd = new Employee("Bill", "End", 15);
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(daneJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        list.printList();

//        list.addToEnd(billEnd);
//        System.out.println(list.getSize());
//        list.printList();

//        list.removeFromFront();
//        System.out.println(list.getSize());
//        list.printList();

        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();
        // System.out.println(list.isEmpty());
        // list.removeFromFront();
        // System.out.println(list.getSize());
        // list.printList();
    }
}
