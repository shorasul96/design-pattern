package uz.reem.abstractFactoryPattern.providers.impl;

import uz.reem.abstractFactoryPattern.providers.VisaCardProvider;

public class VisaCardConnection implements VisaCardProvider {

    @Override
    public String getVisaCardConnection() {
        return "Visa card connection was successful";
    }
}
