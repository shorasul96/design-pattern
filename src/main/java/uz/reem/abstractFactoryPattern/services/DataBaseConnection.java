package uz.reem.abstractFactoryPattern.services;

import uz.reem.abstractFactoryPattern.providers.ClientConnectionProvider;
import uz.reem.abstractFactoryPattern.providers.MongoDbConnectionProvider;
import uz.reem.abstractFactoryPattern.providers.PSQLConnectionProvider;
import uz.reem.abstractFactoryPattern.providers.VisaCardProvider;

public interface DataBaseConnection {

    PSQLConnectionProvider getPSQLConnection();

    MongoDbConnectionProvider getMongoDBConnection();

    ClientConnectionProvider getClientConnection();
}
