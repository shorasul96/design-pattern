package uz.reem.decoratorPattern.services.decorator;

import uz.reem.decoratorPattern.services.Reporter;

public class HTMLReporterDecorator extends ReporterDecorator {


    public HTMLReporterDecorator(Reporter reporter) {
        super(reporter);
    }

    @Override
    public void document(String report) {
        String doc = "html report: " + report;
        super.document(doc);
    }
}
