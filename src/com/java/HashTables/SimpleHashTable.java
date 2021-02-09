package com.java.HashTables;

public class SimpleHashTable {
    private Employee[] hashTable;

    public SimpleHashTable(){
        hashTable = new Employee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey] != null)
            System.out.println("Element already exists at index: "+ hashedKey);
        else
            hashTable[hashedKey] = employee;
    }



    private int hashKey(String key){
        return key.length()+ hashTable.length;
    }

}
