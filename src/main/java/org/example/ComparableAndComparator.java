package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator {
    public static void main(String[] args) {

        int [] arr =  {1, 24, 4 ,5, 45 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] names = {"asi", "Canada", "Montreal ",};

        System.out.println(Arrays.toString(names));

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");

        fruits.add("apple");

        fruits.add("aPple");// will be printed before the apple without capilator

        Collections.sort(fruits); // for a list collection sort method

        System.out.println(fruits); //
    }
}
