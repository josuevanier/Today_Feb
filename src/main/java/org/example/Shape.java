package org.example;

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
        // Static Binding
        Shape staticShape = new Circle(); //Upcasting
        staticShape.draw();

        // Dynamic Binding
        Shape dynamicShape = getRandomShape(); // Dynamic binding, call draw() method based on the actuel object

        dynamicShape.draw();
    }

    // At run time which is being called  since we dont which
    static  Shape getRandomShape(){
        if(Math.random() < 0.5) return new Circle();
        else return  new Square();
    }
}

