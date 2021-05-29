package uz.reem.decoratorPattern.services.decorator;

import uz.reem.decoratorPattern.services.Logger;

import java.util.Base64;

public class EncryptLoggerDecorator extends LoggerDecorator{

    public EncryptLoggerDecorator(Logger logger) {
        super(logger);
    }

    public void log(String message) {
        byte[] encrypted = Base64.getEncoder().encode(message.getBytes());
        super.log(new String(encrypted));
    }
}
