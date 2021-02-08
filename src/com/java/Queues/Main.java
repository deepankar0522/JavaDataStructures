package com.java.Queues;

public class Main {

    public static void main(String[] args) {

        Employee daneJones = new Employee("Jane", "Jones", 10);
        Employee johnDoe = new Employee("John", "Doe", 11);
        Employee marySmith = new Employee("Mary", "Smith", 12);
        Employee mikeWilson = new Employee("Mike", "Wilson", 13);

        ArrayQueue queue = new ArrayQueue(1);

        queue.add(daneJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);

        queue.printQueue();
        System.out.println(queue.remove());
      //  System.out.println(queue.peek());


    }
}
