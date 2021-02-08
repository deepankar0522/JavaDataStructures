package com.java.LinkedLists;

public class Main {
    public static void main(String[] args) {

        Employee daneJones = new Employee("Jane", "Jones", 11);
        Employee johnDoe = new Employee("John", "Doe", 11);
        Employee marySmith = new Employee("Mary", "Smith", 11);
        Employee mikeWilson = new Employee("Mike", "Wilson", 11);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(daneJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        list.printList();
        System.out.println(list.isEmppty());
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}
