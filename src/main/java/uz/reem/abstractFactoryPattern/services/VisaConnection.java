package uz.reem.abstractFactoryPattern.services;

import uz.reem.abstractFactoryPattern.providers.AloqaBankCardProvider;
import uz.reem.abstractFactoryPattern.providers.VisaCardProvider;

public interface VisaConnection {
    VisaCardProvider getVisaCardConnection();

    AloqaBankCardProvider getAloqaBankConnection();

}
