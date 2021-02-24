package com.java.SIngleton;

public class Singleton {

    public static Singleton soleInstance = null;

    private Singleton() {
        System.out.println("creating...");
    }

    public static synchronized Singleton getInstance() {
        if (soleInstance == null) {
            soleInstance = new Singleton();
        }
        return soleInstance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().hashCode());
    }
}
