package uz.reem.singletonPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton Instance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
