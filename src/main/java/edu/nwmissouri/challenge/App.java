package edu.nwmissouri.challenge;

/**
 * Starting point for our app.
 */
public class App {

    public static void main(String[] args) {

        // test Circle class
        double r = 1.0;
        Circle c = new Circle(r);

        String type = c.getShapeType();
        double area = c.getArea();
        double perimeter = c.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Circle");
        System.out.println("===========================================");
        System.out.println("Given radius: " + r);
        System.out.println("A circle's area will be " + area);
        System.out.println("A circle's perimeter will be " + perimeter);
        System.out.println("===========================================");

        // test more classes below
        Rectangle rect = new Rectangle(2,4.0);

        String types = rect.getShapeType();
        double areaOfRectangle = rect.getArea();
        double perimeterOfRectangle = rect.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Rectangle");
        System.out.println("===========================================");
        System.out.println("A Rectangle's area will be " + areaOfRectangle);
        System.out.println("A Rectangle's perimeter will be " + perimeterOfRectangle);
        System.out.println("===========================================");
        

        Square sq = new Square(9.0);

        String typed = sq.getShapeType();
        double areaOfSquare = sq.getArea();
        double perimeterOfSquare = sq.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Square");
        System.out.println("===========================================");
        System.out.println("A Square's area will be " + areaOfSquare);
        System.out.println("A Square's perimeter will be " + perimeterOfSquare);
        System.out.println("===========================================");
        
        
        equilateralTriangle et = new equilateralTriangle(5);

        String typeOf = et.getShapeType();
        double areaOfequilateralTriangle = et.getArea();
        double perimeterOfequilateralTriangle = et.getPerimeter();

        System.out.println("===========================================");
        System.out.println("equilateralTriangle");
        System.out.println("===========================================");
        System.out.println("A equilateralTriangle's area will be " + areaOfequilateralTriangle);
        System.out.println("A equilateralTriangle's perimeter will be " + perimeterOfequilateralTriangle);
        System.out.println("===========================================");
    }

}