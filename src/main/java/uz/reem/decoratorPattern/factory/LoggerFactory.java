package uz.reem.decoratorPattern.factory;

import uz.reem.decoratorPattern.services.Logger;

public class LoggerFactory<T> {
    private final Class<T> type;

    public LoggerFactory(Class<T> type) {
        this.type = type;
    }

    public Logger getLogger() {
        try {
            return (Logger) type.getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
