package uz.reem.factoryMethodPattern.entities.dataBaseFactory.connection;

import uz.reem.factoryMethodPattern.entities.dataBaseFactory.DatabaseEntity;

public class MySqlEntity extends DatabaseEntity {

    public MySqlEntity(String username, String password, String connectionUrl) {
        setPassword(password);
        setUsername(username);
        setConnectionUrl(connectionUrl);
    }
}
