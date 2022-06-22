package oop;

/*
    Encapsulation
    - information hiding - through access control modifiers
    - implementation hiding - through use of implementing an interface. hide the logic from the client
    and can change the logic without affecting the client.
    private members variables of a class accessed through a public method
*/

/*
    Abstraction
    - use of interfaces
        - 100% abstraction
    - use of abstract classes
        - 0-100% of abstraction, can have concrete methods
        - cant create objects of an abstract class
 */

abstract class Shape {
    String nameOfShape;

    // abstract methods
    public abstract double calculateArea();
    public abstract String toString();

    //constructor
    public Shape(String nameOfShape) {
        System.out.println("Inside the Constructor of Shape class");
        this.nameOfShape = nameOfShape;
    }

    //non-abstract method
    public String getNameOfShape() {
        return nameOfShape;
    }
}

class Circle extends Shape {
    double radius;
    public Circle(String nameOfShape, double radius) {
        super(nameOfShape);
        System.out.println("Inside the Constructor of Circle class");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        return "Name of the shape is " + super.nameOfShape +
                " and its area is: " + calculateArea();
    }
}

class Square extends Shape {
    double length;
    public Square(String nameOfShape, double length) {
        //calling Shape constructor
        super(nameOfShape);
        System.out.println("Inside the Constructor of Square class ");
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }
    @Override
    public String toString() {
        return "Name of the Shape is " + super.nameOfShape +
                " and its area is: " + calculateArea();
    }
}




public class Abstraction {
    public static void main(String[] args) {
        Shape shapeObject1 = new Circle("Circle", 6.5);
        System.out.println(shapeObject1.toString());

        Shape shapeObject2 = new Square("Square", 8);
        System.out.println(shapeObject2.toString());
    }
}