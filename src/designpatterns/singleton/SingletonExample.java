package designpatterns.singleton;

public class SingletonExample {
    private SingletonExample() {

    }

    /*static {
        _instance = new SingletonExample();
    }*/

    private static SingletonExample _instance;

    public SingletonExample getInstance(){
        if (_instance == null){
            _instance = new SingletonExample();
        }

        return _instance;
    }

    public static void main(String[] args) {

    }
}
