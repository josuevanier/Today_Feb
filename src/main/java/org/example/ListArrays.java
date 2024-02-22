package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class ListArrays {
    public static void main(String[] args) {

        // Integer

        ArrayList<Integer> integers = new ArrayList<>(); // reference point a

        integers.add(1);

        integers.add(-1);

        integers.add(2);

        integers.remove(Integer.valueOf(1)); // REMOVE BY THE VALUE SINCE ITS A WRAPPER CLASS

        Collections.sort(integers); // need to import the package sort the package ddfd

        for(int intValues : integers) System.out.println( intValues + ", ");
    }
}
