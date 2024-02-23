package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ClassExcercies {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  ArrayList<Integer> integers = new ArrayList<>();
        //int count = 0;
        /// while (count != 10) {
        //      System.out.println("Enter integer  10 integer max: ");
        //    if (integers.add(sc.nextInt()))
        //       count++;
        //}

        //    Collections.sort(integers);
        //int n = 0;
        //  for (int i = 0; i < integers.size() + n; i++) {
        // for (int j = 1; j < integers.size() + n; j++) {
        //    if (integers.get(i) == integers.get(j)) {
        //    integers.remove(i);
        //    n--;
        //  }
        // }

       // System.out.println(integers);

        System.out.println("How many element do you want to insert: ");
        int numOfelements = sc.nextInt();

        int[] container = new int[numOfelements];

        int counterOfElements = 0;
        while (counterOfElements != numOfelements) {
            System.out.println("Enter your  " + counterOfElements + " :");
            container[counterOfElements] = sc.nextInt();

            counterOfElements++;
        }

        ArrayList<Integer> integeres4 = new ArrayList<>();
        for (int i = 0; i < container.length; i++) {
            if (!integeres4.contains(container[i])) {
                integeres4.add(container[i]);
            }
        }
        System.out.println("Your unique integer is : " + integeres4);
    }

}
