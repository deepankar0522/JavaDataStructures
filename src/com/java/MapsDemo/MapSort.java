package com.java.MapsDemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapSort {
    public static void main(String[] args) {
        Map<Integer, Employee> unsortedMap = new HashMap<>();
        unsortedMap.put(1, new Employee(1, "Steve", 200000));
        unsortedMap.put(5, new Employee(2, "Marry", 300000));
        unsortedMap.put(2, new Employee(3, "Mike", 240000));
        unsortedMap.put(9, new Employee(4, "Jason", 340000));

        // Comparable
        Map<Integer, Employee> mapSort = unsortedMap.entrySet().stream().

                collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));

       // System.out.println(mapSort);

        // TreeMap to sort by Key
        TreeMap<Integer, Employee> treeMap = new TreeMap<>(unsortedMap);
        System.out.println(treeMap);



    }
}
