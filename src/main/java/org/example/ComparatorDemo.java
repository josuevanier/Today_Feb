package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Author1> author1s = new ArrayList<Author1>();
        author1s.add(new Author1("Josue", "LALA", 25));
        author1s.add(new Author1("Joshua", "LoLA", 34));
        author1s.add(new Author1("Jose", "LLP", 13));

        Collections.sort(author1s, new AuthorAgeComparator());

        for(Author1 author1 : author1s) System.out.println(author1.getFirstname() + " " + author1.getBookName()+ " "
                + author1.getBookName());

        Collections.sort(author1s, new BookNameComparator());


        for(Author1 author1 : author1s) System.out.println(author1.getFirstname() + " " + author1.getBookName()+ " "
                + author1.getBookName());
    }
}
class Author1{
    String firstname;
    String bookName;

    int authorAge;

    public Author1(String firstname, String bookookName, int authorAge) {
        this.firstname = firstname;
        this.bookName = bookookName;
        this.authorAge = authorAge;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getBookName() {
        return bookName;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }
}

class  AuthorAgeComparator implements Comparator<Author1>{
    @Override
    public int compare(Author1 o1, Author1 o2) {
        if(o1.authorAge == o2.authorAge) return 0; // two different object so no need to refer to use getters
        else if (o1.authorAge > o2.authorAge) return 1;
        else return -1;
    }
}
class  BookNameComparator implements Comparator<Author1>{
    @Override
    public int compare(Author1 o1, Author1 o2) {
        return  o1.bookName.compareTo(o2.bookName); // no getters because we are refering to two different object
    }
}