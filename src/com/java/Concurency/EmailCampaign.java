package com.java.Concurency;

public class EmailCampaign implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i == 5)
                Thread.currentThread().yield();
        }
    }
}
