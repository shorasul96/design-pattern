package uz.reem.factoryMethodPattern.entities.dataBaseFactory.connection;

import uz.reem.factoryMethodPattern.entities.dataBaseFactory.DatabaseEntity;

public class PostgreSqlEntity extends DatabaseEntity {

    public PostgreSqlEntity(String username, String password, String connectionUrl) {
        setUsername(username);
        setPassword(password);
        setConnectionUrl(connectionUrl);
    }
}
