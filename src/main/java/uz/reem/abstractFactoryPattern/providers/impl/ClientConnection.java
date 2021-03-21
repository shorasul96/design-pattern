package uz.reem.abstractFactoryPattern.providers.impl;

import uz.reem.abstractFactoryPattern.providers.ClientConnectionProvider;

public class ClientConnection implements ClientConnectionProvider {

    @Override
    public String getClientConnection() {
        return "Client Connection Provider works well";
    }
}
