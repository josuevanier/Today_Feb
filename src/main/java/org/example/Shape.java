package org.example;

import java.util.ArrayList;

public class Shape {
    void draw(){
        System.out.println("Drawing a shape");
    }
}
class Circle extends  Shape{
    void draw(){
        System.out.println("Drawing a circle ");
    }
}
class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}
class ExampleDynamicBiding{
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Square()); // Compile timne
        shapes.add(new Circle()); // compile time since it knows which one is being add

        for(Shape shape : shapes){
            shape.draw();// Dynamic in action this is at runtime  it
            // does not not which shape which one at refereing at run time  it know which one is being called
        }
    }
}

