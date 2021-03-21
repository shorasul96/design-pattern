package uz.reem.abstractFactoryPattern.services.impl;

import lombok.Data;
import uz.reem.abstractFactoryPattern.providers.ClientConnectionProvider;
import uz.reem.abstractFactoryPattern.providers.MongoDbConnectionProvider;
import uz.reem.abstractFactoryPattern.providers.PSQLConnectionProvider;
import uz.reem.abstractFactoryPattern.services.DataBaseConnection;


@Data
public class DataBaseConnectionClient {
    private PSQLConnectionProvider psqlConnectionProvider;
    private MongoDbConnectionProvider mongoDbConnectionProvider;
    private ClientConnectionProvider clientConnectionProvider;

    public DataBaseConnectionClient(DataBaseConnection connection){
        psqlConnectionProvider = connection.getPSQLConnection();
        mongoDbConnectionProvider = connection.getMongoDBConnection();
        clientConnectionProvider = connection.getClientConnection();
    }

    public String getPsqlConnection() {
        return psqlConnectionProvider.getPsqlConnection();
    }

    public String getMongoDBConnection() {
        return mongoDbConnectionProvider.getMongoDbConnection();
    }

    public String getClientConnection() {
        return clientConnectionProvider.getClientConnection();
    }

}
