package com.java.Concurency;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        Thread thread1 = new Thread(new EmailCampaign());
        Thread thread2 = new Thread(new DataAggregator());

        thread1.setName("EmailCampaign");
        thread2.setName("DataAggregator");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Inside main");
    }
}