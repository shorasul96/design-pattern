package uz.reem.abstractFactoryPattern.services.impl;

import uz.reem.abstractFactoryPattern.providers.ClientConnectionProvider;
import uz.reem.abstractFactoryPattern.providers.MongoDbConnectionProvider;
import uz.reem.abstractFactoryPattern.providers.PSQLConnectionProvider;
import uz.reem.abstractFactoryPattern.providers.VisaCardProvider;
import uz.reem.abstractFactoryPattern.providers.impl.ClientConnection;
import uz.reem.abstractFactoryPattern.providers.impl.MongoDbConnection;
import uz.reem.abstractFactoryPattern.providers.impl.PsqlConnection;
import uz.reem.abstractFactoryPattern.providers.impl.VisaCardConnection;
import uz.reem.abstractFactoryPattern.services.DataBaseConnection;

public class DataBaseDataBaseConnectionFactory implements DataBaseConnection {

    @Override
    public PSQLConnectionProvider getPSQLConnection() {
        return new PsqlConnection();
    }

    @Override
    public MongoDbConnectionProvider getMongoDBConnection() {
        return new MongoDbConnection();
    }

    @Override
    public ClientConnectionProvider getClientConnection() {
        return new ClientConnection();
    }


}
