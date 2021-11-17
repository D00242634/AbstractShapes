package com.dkit.oop;
//TODO
// change Rectangle declaration so that Rectangle inherits from Shape

public class Rectangle extends Shape{

    private int width,length;

    public Rectangle(int x, int y, int width, int length) {
        super(x, y); //calls the superclass constructor

        this.length=length;
        this.width=width;
    }
    //TODO
    // Rectangle requires fields 'width' and 'height'.
    // implement toString() and getters/setters.
    // area() must be implemented.

    @Override
    public double area(){
        return this.width*this.length;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        // call superclass toString method to get Shape details
        return super.toString() + "[Width=" + this.width + "]\n[Length=" + this.length + "]"+"[Area=" + this.area() + "]";
    }

    @Override
    public double perimiter() {
        return (2*this.width)+2*(this.length);
    }
}
