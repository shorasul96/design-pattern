package uz.reem.factoryMethodPattern.entities.dataBaseFactory;

import uz.reem.factoryMethodPattern.entities.dataBaseFactory.DatabaseEntity;

public abstract class DatabaseConnectionFactory {

    public abstract DatabaseEntity getDatabaseConnection();
}
