package uz.reem.decoratorPattern;

import uz.reem.decoratorPattern.factory.ReporterFactory;
import uz.reem.decoratorPattern.services.Reporter;
import uz.reem.decoratorPattern.services.decorator.EncryptLoggerDecorator;
import uz.reem.decoratorPattern.services.decorator.EncryptReporterDecorator;
import uz.reem.decoratorPattern.services.decorator.HTMLLoggerDecorator;
import uz.reem.decoratorPattern.factory.LoggerFactory;
import uz.reem.decoratorPattern.services.Logger;
import uz.reem.decoratorPattern.services.decorator.HTMLReporterDecorator;
import uz.reem.decoratorPattern.services.impl.ConsoleLogger;
import uz.reem.decoratorPattern.services.impl.ConsoleReporter;
import uz.reem.decoratorPattern.services.impl.FileLogger;
import uz.reem.decoratorPattern.services.impl.FileReporter;

public class TestDecoratorPattern {
    public static void main(String[] args) {
//        LoggerFactory<?> factory = new LoggerFactory<>(FileLogger.class);
//        Logger logger = factory.getLogger();
//
//        HTMLLoggerDecorator htmlLoggerDecorator = new HTMLLoggerDecorator(logger);
//        htmlLoggerDecorator.log("HTML Logger message");
//
//        EncryptLoggerDecorator encryptLoggerDecorator = new EncryptLoggerDecorator(logger);
//        encryptLoggerDecorator.log("Encrypt logger message ");
//
//        factory = new LoggerFactory<>(ConsoleLogger.class);
//        logger = factory.getLogger();
//
//        htmlLoggerDecorator = new HTMLLoggerDecorator(logger);
//        htmlLoggerDecorator.log("HTML logger message");
//
//        encryptLoggerDecorator = new EncryptLoggerDecorator(logger);
//        encryptLoggerDecorator.log("Encrypt logger message");

        ReporterFactory<?> factory = new ReporterFactory<>(FileReporter.class);
        Reporter reporter = factory.getReporter();

        HTMLReporterDecorator htmlReporterDecorator = new HTMLReporterDecorator(reporter);
        htmlReporterDecorator.document("HTML Logger message");

        EncryptReporterDecorator encryptReporterDecorator = new EncryptReporterDecorator(reporter);
        encryptReporterDecorator.document("Encrypt logger message ");

        factory = new ReporterFactory<>(ConsoleReporter.class);
        reporter = factory.getReporter();

        htmlReporterDecorator = new HTMLReporterDecorator(reporter);
        htmlReporterDecorator.document("HTML logger message");

        encryptReporterDecorator = new EncryptReporterDecorator(reporter);
        encryptReporterDecorator.document("Encrypt logger message");

    }
}
