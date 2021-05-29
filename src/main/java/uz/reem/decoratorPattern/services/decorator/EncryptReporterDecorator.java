package uz.reem.decoratorPattern.services.decorator;

import uz.reem.decoratorPattern.services.Reporter;

import java.util.Base64;

public class EncryptReporterDecorator extends ReporterDecorator {
    public EncryptReporterDecorator(Reporter reporter) {
        super(reporter);
    }

    @Override
    public void document(String report) {
        byte[] encrypt = Base64.getEncoder().encode(report.getBytes());
        super.document(new String(encrypt));
    }
}
