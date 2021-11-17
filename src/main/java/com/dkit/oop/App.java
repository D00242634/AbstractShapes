package com.dkit.oop;

import java.util.ArrayList;

/**
 * Abstract class Shape
 * oop-abstract-class-shape
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Abstract Class Shape" );
        App app = new App();
        app.start();
    }

    public void start() {

        //  Shape s1 = new Shape(2,3);  // compiler will complain. Cannot create an object of an Abstract class.

        Circle c1 = new Circle(1,2,5);
        System.out.println(c1.toString());

        //TODO
        // implement the Rectangle class (see skeleton Rectangle class).
        // instantiate a Rectangle object r1, and output its details.

        Rectangle r1 = new Rectangle (2,3 , 4, 5);
        System.out.println(r1.toString());

        //TODO
        // create an ArrayList and populate it with two Circles and two Rectangles.
        // write a displayList() method that accepts the list and display all elements.
        // using a for loop, sum the area of all the shapes and output that sum.

        Circle c2 = new Circle(2,1,12);
        System.out.println(c2.toString());

        Rectangle r2 = new Rectangle (15,6 , 7, 1);
        System.out.println(r2.toString());

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r1);
        shapes.add(r2);

        Displaylist(shapes);


        //TODO
        // The senior architect informs you that all shapes MUST have a method
        // called perimeter() that returns the perimeter of the shape.
        // Make the appropriate changes to the Shape, Circle and Rectangle classes.
    }
    public void Displaylist(ArrayList<Shape> shapes){
    for(Shape s:shapes){
        System.out.println("--------------------");
        System.out.println(s);
    }
}
}
