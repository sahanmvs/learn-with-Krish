package singleton;

public class SingletonApp {
    public static void main(String[] args) {

        SingletonExample singleton = SingletonExample.getSingletonInstance();
        singleton.print();
        SingletonExample singleton1 = SingletonExample.getSingletonInstance();
        singleton1.print();
        SingletonExample singleton2 = SingletonExample.getSingletonInstance();
        singleton2.print();

        //SingletonExample singletonExample = new SingletonExample();
        //'SingletonExample()' has private access in 'singleton.SingletonExample'
    }
}
