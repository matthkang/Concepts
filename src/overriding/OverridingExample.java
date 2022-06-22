package overriding;

class Parent {
    protected void test(){
        System.out.println("Parent method called");
    }
}

class Child extends Parent {
    public void test(){
        System.out.println("Child method called");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.test();

        Parent parent2 = new Child();
        parent2.test();
    }
}
