package uz.reem.decoratorPattern.services.decorator;

import uz.reem.decoratorPattern.services.Reporter;

public abstract class ReporterDecorator implements Reporter {

    private final Reporter reporter;

    public ReporterDecorator(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public void document(String report) {
        reporter.document(report);
    }
}
