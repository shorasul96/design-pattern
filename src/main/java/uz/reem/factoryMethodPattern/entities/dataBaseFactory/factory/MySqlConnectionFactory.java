package uz.reem.factoryMethodPattern.entities.dataBaseFactory.factory;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import uz.reem.factoryMethodPattern.entities.dataBaseFactory.DatabaseEntity;
import uz.reem.factoryMethodPattern.entities.dataBaseFactory.DatabaseConnectionFactory;
import uz.reem.factoryMethodPattern.entities.dataBaseFactory.connection.MySqlEntity;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class MySqlConnectionFactory extends DatabaseConnectionFactory {

    private String username;
    private String password;
    private String connectionUrl;

    @Override
    public DatabaseEntity getDatabaseConnection() {
        return new MySqlEntity(username, password, connectionUrl);
    }
}
