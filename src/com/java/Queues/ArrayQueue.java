package com.java.Queues;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (back == queue.length) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];
            //    cyclic resize problem
            //     System.arraycopy(queue, 0, newArray, 0, queue.length);

            //solution
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, 0);
            queue = newArray;
            front = 0;
            back = numItems;
        }
        queue[back] = employee;
        back++;
    }

    public Employee remove() {
        if (size() == 0)
            throw new NoSuchElementException();
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            back = 0;
            front = 0;
        } else if (front == queue.length) {
            front = 0;
        }
        return employee;
    }

    public Employee peek() {
        if (size() == 0)
            throw new NoSuchElementException();
        return queue[front];
    }

    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++)
                System.out.println(queue[i]);
            for (int i = 0; i < back; i++)
                System.out.println(queue[i]);
        }
    }

    public int size() {
        if (front <= back)
            return back - front;
        else
            return back - front + queue.length;
    }

}
