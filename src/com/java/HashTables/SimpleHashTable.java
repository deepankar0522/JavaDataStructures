package com.java.HashTables;

public class SimpleHashTable {
    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }

        if (occupied(hashedKey))
            System.out.println("Error! Element already exists at index: " + hashedKey);
        else
            hashTable[hashedKey] = new StoredEmployee(key, employee);
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key))
            return hashedKey;
        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }
        if (stopIndex == hashedKey)
            return -1;
        else
            return hashedKey;
    }

    public boolean occupied(int index) {
        return hashTable[index] != null;
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1)
            return null;
        else
            return hashTable[hashedKey].employee;
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void printHashtable() {
        for (StoredEmployee employee : hashTable) {
            if (employee==null)
                System.out.println("empty");
            else
                System.out.println(employee.employee);
        }
    }
}
