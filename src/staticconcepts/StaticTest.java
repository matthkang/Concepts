package staticconcepts;

public class StaticTest {
    static int count;
    String name;

    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        st.count = 3;
        st.name = "Lucy";

        StaticTest st1 = new StaticTest();
        System.out.println(st1.count);
        System.out.println(st1.name);

    }
}
