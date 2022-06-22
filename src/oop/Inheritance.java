package oop;

/*
    Inheritance
    - acquire properties from the super class to the sub class.
    - reusability/ maintainability
    - extends keyword
    - inherit all non-private members (fields, methods)

    - can inherit multiple classes through the use of interfaces
    - BUT can have something like a hierarchical or multilevel inheritance (transitive)

    super keyword
    - invoke the superclass constructor
    - differentiate members with the same name from the super and sub class

    final keyword
    - dont' want class to be inherited by other classes

 */
class Animal {
    private String name;

    public void getName(){
        System.out.println("The name is: " + name);
    }

    public void setName(String name){
        this.name = name;
        System.out.println("Name has been set");
    }
}

class Dog extends Animal {
    public void displayName(){
        getName();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Lucy");
        dog.displayName();
    }
}
