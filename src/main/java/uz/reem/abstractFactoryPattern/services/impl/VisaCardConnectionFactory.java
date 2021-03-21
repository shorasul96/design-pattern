package uz.reem.abstractFactoryPattern.services.impl;

import uz.reem.abstractFactoryPattern.providers.AloqaBankCardProvider;
import uz.reem.abstractFactoryPattern.providers.VisaCardProvider;
import uz.reem.abstractFactoryPattern.providers.impl.AloqaBankConnection;
import uz.reem.abstractFactoryPattern.providers.impl.VisaCardConnection;
import uz.reem.abstractFactoryPattern.services.VisaConnection;

public class VisaCardConnectionFactory implements VisaConnection {

    @Override
    public VisaCardProvider getVisaCardConnection() {
        return new VisaCardConnection();
    }

    @Override
    public AloqaBankCardProvider getAloqaBankConnection() {
        return new AloqaBankConnection();
    }
}
