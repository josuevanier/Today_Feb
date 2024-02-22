package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator {
    public static void main(String[] args) {

        // the reason we hacve author in the second part is because if author have child class so it can be upcasted
        ArrayList<Author> authors = new ArrayList<Author>();
        authors.add(new Author("Elon","Musk","Space"));
        authors.add(new Author("Bill","Gates","Ms"));
        authors.add(new Author("Elon","Musk","Apple"));
        authors.add(new Author("Elon","Musk","Space"));

        Collections.sort(authors);

        System.out.println("The sorted author by last");

        // enhanced for loop
        for(Author a : authors){
            System.out.println(a.firstName + " " + a.lastName + "[ Book' name : " + a.bookName + "]");
        }
    }
}
class Author implements Comparable<Author>{
    String firstName;
    String lastName;
    String bookName;

    public Author(String firstName, String lastName, String bookName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName = bookName;
    }
    @Override
    public int compareTo(Author o){
        return this.lastName.compareTo(o.lastName); // based on the  value we will sort
    }
}
