package org.example;
import java.util.ArrayList;

public class ListArrays {
    public static void main(String[] args) {
        // When remove item the index shrink since the size shrink
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(0,1);
        System.out.println(integers.get(0));
        integers.set(0,2);
        integers.add(3);

        integers.remove(0);

        System.out.println(integers.size());

        for(int i = 0; i < integers.size();i++){
            System.out.println(integers.get(i) + " ");
        }

    }
}
