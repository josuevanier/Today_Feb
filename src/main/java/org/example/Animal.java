package org.example;

public class Animal {
    void sound (){
        System.out.println("Animal making sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog making noise");
    }
}

class TestStaticBinding{
    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound(); // Static binding
    }
}
