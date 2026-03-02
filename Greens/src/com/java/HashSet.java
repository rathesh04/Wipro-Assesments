package com.java;

import java.util.*;

public class HashSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Raja");
        set.add("Anbu");
        set.add("Kumar");
        set.add(null);
        set.add("Kumar");

        System.out.println(set);

        int size = set.size();
        System.out.println(size);

        boolean contains = set.contains("Raja");
        System.out.println(contains);

        set.remove("Kumar");
        System.out.println(set);

        // set.clear();
        // System.out.println(set);

        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        set1.addAll(set);
        System.out.println(set1);

        set1.retainAll(set);
        System.out.println(set1);

        set1.removeAll(set);
        System.out.println(set1);
    }
}