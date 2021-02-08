package com.java.LinkedStacks;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Employee> stack;

    public LinkedStack(){
        stack = new LinkedList<>();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public void printStack(){
        ListIterator<Employee> itr = stack.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
