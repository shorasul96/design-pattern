package uz.reem.decoratorPattern.services.impl;

import uz.reem.decoratorPattern.services.Reporter;

public class ConsoleReporter implements Reporter {
    @Override
    public void document(String report) {
        System.out.println("Console report: " + report);
    }
}
