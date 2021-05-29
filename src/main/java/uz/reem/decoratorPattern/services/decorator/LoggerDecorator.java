package uz.reem.decoratorPattern.services.decorator;

import uz.reem.decoratorPattern.services.Logger;

public abstract class LoggerDecorator implements Logger {

    private final Logger logger;

    public LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }
}
