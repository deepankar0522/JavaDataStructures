package com.java.MapsDemo;

import java.util.*;
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
                collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        // System.out.println(mapSort);
        // TreeMap to sort by Key
//        TreeMap<Integer, Employee> treeMap = new TreeMap<>(unsortedMap);
//        System.out.println(treeMap);
//        sortByValueJava8(unsortedMap);
//    }
//
//    private static Map<String, Employee> sortByValueJava8(Map<Integer, Employee> map) {
//        return map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.comparing(x -> x.getName())))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
//    }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
        }

    }

}
