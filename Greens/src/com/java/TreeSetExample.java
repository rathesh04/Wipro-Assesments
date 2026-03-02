package com.java;

import java.util.*;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<String> cities = new TreeSet<>();

        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        
        cities.add("Chennai");  

        System.out.println(cities);

        int size = cities.size();
        System.out.println(size);

        boolean contains = cities.contains("Chennai");
        System.out.println(contains);

        cities.remove("Hyderabad");
        System.out.println(cities);

        Set<String> newCities = new TreeSet<>();
        newCities.add("Delhi");
        newCities.add("Mumbai");
        newCities.add("Pune");

        newCities.addAll(cities);
        System.out.println(newCities);

        newCities.retainAll(cities);
        System.out.println(newCities);

        newCities.removeAll(cities);
        System.out.println(newCities);
    }
}