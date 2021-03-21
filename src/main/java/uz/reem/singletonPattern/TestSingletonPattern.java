package uz.reem.singletonPattern;

public class TestSingletonPattern {
    public static void main(String[] args) {
        Object object = new Object();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        System.out.println(object);
        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);

        Singleton singleton = Singleton.Instance();
        Singleton singleton1 = Singleton.Instance();
        Singleton singleton2 = Singleton.Instance();
        Singleton singleton3 = Singleton.Instance();

        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
