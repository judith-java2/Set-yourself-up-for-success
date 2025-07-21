package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;

public class App {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> uniqueItems = new LinkedHashSet<>(list);
        return new ArrayList<>(uniqueItems);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new ArrayList<>()));
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(1)))); 
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3)))); 
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList("A", "A", "B"))));
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(1, 1, 3, 3, 5, 5)))); 
    }
}
