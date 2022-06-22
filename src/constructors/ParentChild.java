package constructors;

class foo{
    void test() {
        System.out.println("hello");
    }
}

class Parent {
    private foo f;
    Parent() {
        f = new foo();
        System.out.println("Parent default constructor");
    }

    Parent(String str) {
        System.out.println("Parent arg constructor");
    }

    void test() {
        System.out.println("Test method");
    }

    void alsoTest() {
        test();
        f.test();
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child default constructor");
    }
    Child(String str){
        super(str);
        System.out.println("Child arg constructor");
    }
}

public class ParentChild {
    public static void main(String[] args) {
//        Child child = new Child();
//        Child child2 = new Child("child");

        Parent parent = new Parent();
        parent.alsoTest();
    }
}
