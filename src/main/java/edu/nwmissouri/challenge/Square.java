/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author Hemanth Sai Reddy Velamuri
 */
public class Square extends AbstractShape {

    // private attribute
    private final double length;

    // constructor
    public Square(double length ) {
        super("Square");
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * (length);
    }

    // add an executable main() method to test it
    public static void main(String[] args) {
        //double r = 1.0;
        Square s = new Square(10);

        String type = s.getShapeType();
        double area = s.getArea();
        double perimeter = s.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Square");
        System.out.println("===========================================");
        System.out.println("A Square's area will be " + area);
        System.out.println("A Square's perimeter will be " + perimeter);
        System.out.println("===========================================");
    }

}

