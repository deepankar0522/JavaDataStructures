package com.java.Concurency;

import java.util.Random;

public class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
        System.out.println(this.message.read());
    }

    @Override
    public void run() {
        Random random = new Random();
//        System.out.println("read: "+message.read());
        for (String latestMessage = message.read(); !latestMessage.equals("finished"); latestMessage = message.read()){
            System.out.println(latestMessage);
            try{
                Thread.sleep(random.nextInt(2000));
            }catch (InterruptedException e){

            }
        }
    }
}
