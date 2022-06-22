package oop;

/*
    Polymorphism
    - create methods or variables which will behave differently depending on the context
    - "one name with many forms"
    - compile-time polymorphism
        - method call resolved at compile-time
        - compiler binds the appropriate methods to the object
        - it has all the info and knows what to method to run
        - method OVERLOADING - methods with diff num of parameters

    - run-time polymorphism
        - method call resolved at run-time

        - upcasting - the parent's reference variable refers to the object of the child class
        - A a = new B();

 */

class Mammal {
    public void sound() {
        System.out.println("Some sound");
    }
}

class Lion extends Mammal {
    public void sound() {
        System.out.println("Roar");
    }
}

public class Polymorphism {
    public static void sound(Mammal mammal){
       mammal.sound();
    }
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.sound(); // Some sound
        Mammal lion = new Lion(); // upcasting
        lion.sound(); // Roar
        sound(mammal);
        sound(lion);
    }
}
