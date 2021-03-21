package uz.reem.abstractFactoryPattern.providers.impl;

import uz.reem.abstractFactoryPattern.providers.PSQLConnectionProvider;

public class PsqlConnection implements PSQLConnectionProvider {

    @Override
    public String getPsqlConnection() {
        return "Psql connection String";
    }

}
