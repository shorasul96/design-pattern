package uz.reem.decoratorPattern.services.decorator;

import uz.reem.decoratorPattern.services.Logger;

public class HTMLLoggerDecorator extends LoggerDecorator {

    public HTMLLoggerDecorator(Logger logger) {
        super(logger);
    }

    public void log(String message) {
        String htmlString = "some log for html:\nmessage: " + message;
        super.log(htmlString);
    }
}
