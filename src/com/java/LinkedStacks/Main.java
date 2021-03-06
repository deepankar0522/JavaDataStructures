package com.java.LinkedStacks;

public class Main {
    public static void main(String[] args) {
        Employee daneJones = new Employee("Jane", "Jones", 10);
        Employee johnDoe = new Employee("John", "Doe", 11);
        Employee marySmith = new Employee("Mary", "Smith", 12);
        Employee mikeWilson = new Employee("Mike", "Wilson", 13);

        LinkedStack stack = new LinkedStack();

        stack.push(daneJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);

        stack.printStack();
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

    }
}
