package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator {
    public static void main(String[] args) {

        ArrayList<Laptop> laptops = new ArrayList<Laptop>();

        laptops.add(new Laptop("Mac", 2,3));
        laptops.add(new Laptop("Hd", 3,2));
        laptops.add(new Laptop("Mac", 4,1));

        Collections.sort(laptops);

        for(Laptop laptop : laptops) System.out.println(laptop.name + " " + laptop.price +
                " " + laptop.ram);

    }
}
class Laptop implements Comparable<Laptop>{
    String name;
    int ram;

    int price;

    public Laptop(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop o) {
        // Sort based on the access random Memory
        if(this.ram == o.getRam()) return 0;
        else if (this.ram >  o.getRam()) {
            return 1;
        }
        else return  -1;
    }
}