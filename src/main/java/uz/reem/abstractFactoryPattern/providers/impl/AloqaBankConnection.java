package uz.reem.abstractFactoryPattern.providers.impl;

import uz.reem.abstractFactoryPattern.providers.AloqaBankCardProvider;

public class AloqaBankConnection implements AloqaBankCardProvider {
    @Override
    public String getAloqaBackConnection() {
        return "Connection with Aloqa bank was successful";
    }
}
