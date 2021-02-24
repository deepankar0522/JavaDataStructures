package com.java.Concurency;

public class DataAggregator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if(i==5)
                System.out.println(Thread.currentThread().getName());
        }
    }
}
