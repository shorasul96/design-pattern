package uz.reem.decoratorPattern.factory;

import uz.reem.decoratorPattern.services.Reporter;

public class ReporterFactory<T> {
    private final Class<T> type;

    public ReporterFactory(Class<T> type) {
        this.type = type;
    }

    public Reporter getReporter() {
        try {
            return (Reporter) type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
