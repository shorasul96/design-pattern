package uz.reem.abstractFactoryPattern.providers.impl;

import uz.reem.abstractFactoryPattern.providers.MongoDbConnectionProvider;

public class MongoDbConnection implements MongoDbConnectionProvider {
    @Override
    public String getMongoDbConnection() {
        return "MongoDB connection String";
    }
}
