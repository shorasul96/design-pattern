package uz.reem.decoratorPattern.services.impl;

import uz.reem.decoratorPattern.services.Reporter;

public class FileReporter implements Reporter {
    @Override
    public void document(String report) {
        System.out.println("File report: " + report);
    }
}
