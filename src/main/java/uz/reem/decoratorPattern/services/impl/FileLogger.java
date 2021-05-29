package uz.reem.decoratorPattern.services.impl;

import uz.reem.decoratorPattern.services.Logger;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("File logger: " + message);
    }
}
