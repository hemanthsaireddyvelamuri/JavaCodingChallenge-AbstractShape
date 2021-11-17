/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author Hemanth Sai Reddy Velamuri
 */
public class equilateralTriangle extends AbstractShape {

    // private attribute
    private final double length;

    // constructor
    public equilateralTriangle(double length ) {
        super("equilateralTriangle");
        this.length = length;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3)/4) * length * length ;
    }

    @Override
    public double getPerimeter() {
        return 3 * (length);
    }

    // add an executable main() method to test it
    public static void main(String[] args) {
        //double r = 1.0;
        equilateralTriangle s = new equilateralTriangle(10);

        String type = s.getShapeType();
        double area = s.getArea();
        double perimeter = s.getPerimeter();

        System.out.println("===========================================");
        System.out.println("equilateralTriangle");
        System.out.println("===========================================");
        System.out.println("A equilateralTriangle's area will be " + area);
        System.out.println("A equilateralTriangle's perimeter will be " + perimeter);
        System.out.println("===========================================");
    }

}



