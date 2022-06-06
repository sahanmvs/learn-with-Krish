package singleton;

public class SingletonExample {
    // holds only one instance of this class
    private static volatile SingletonExample singletonInstance;

    //prevent others from instantiating
    private SingletonExample() {
        // prevent reflection framework manually invoking the constructor
        if(singletonInstance!=null) {
            throw new RuntimeException("use getSingletonInstance()");
        }
    }

    // providing access to the singleton instance
    public static SingletonExample getSingletonInstance() {
        if(singletonInstance==null) {
            synchronized (SingletonExample.class) {
                if(singletonInstance==null) {
                    singletonInstance = new SingletonExample();
                    System.out.println("creating new instance");
                }
            }
        }
        return  singletonInstance;
    }

    public void print() {
        System.out.println("Inside print");
    }
}
