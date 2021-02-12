package com.java.HashTables;

public class Main {
    public static void main(String[] args) {

        Employee daneJones = new Employee("Jane", "Jones", 11);
        Employee johnDoe = new Employee("John", "Doe", 12);
        Employee marySmith = new Employee("Mary", "Smith", 13);
        Employee mikeWilson = new Employee("Mike", "Wilson", 14);


        ChainedHashtable hashTable = new ChainedHashtable();
//        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Jones", daneJones);
        hashTable.put("Doe", johnDoe);
        hashTable.put("Smith", marySmith);
        hashTable.put("wilson", mikeWilson);

        hashTable.printHashtable();
        System.out.println("#####after get#####");
        System.out.println(hashTable.get("Doe"));
        hashTable.remove("Jones");
        hashTable.remove("Smith");
        System.out.println("#####after remove#####");
        hashTable.printHashtable();
        hashTable.put("Jones", daneJones);
        hashTable.put("Smith", marySmith);
        System.out.println("#####after add#####");
        hashTable.printHashtable();


    }
}
