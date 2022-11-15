package uz.reem.factoryMethodPattern;

import uz.reem.factoryMethodPattern.entities.dataBaseFactory.DatabaseEntity;
import uz.reem.factoryMethodPattern.entities.dataBaseFactory.factory.MySqlConnectionFactory;
import uz.reem.factoryMethodPattern.entities.dataBaseFactory.factory.PostgreSQlConnectionFactory;
import uz.reem.factoryMethodPattern.entities.dataBaseFactory.DatabaseConnectionFactory;
import uz.reem.factoryMethodPattern.entities.productFactory.ProductFactory;
import uz.reem.factoryMethodPattern.entities.productFactory.factory.ProductPremium;
import uz.reem.factoryMethodPattern.entities.productFactory.ProductEntity;
import uz.reem.factoryMethodPattern.entities.productFactory.factory.ProductVip;
//int
public class TestFactoryMethodPattern {
    public static void main(String[] args) {
        DatabaseConnectionFactory mySqlFactory = new MySqlConnectionFactory()
                .setUsername("db username")
                .setPassword("db password")
                .setConnectionUrl("Connection Url");

        DatabaseEntity databaseEntity = mySqlFactory.getDatabaseConnection();
        System.out.println(databaseEntity.toString());


        DatabaseConnectionFactory postgresql = new PostgreSQlConnectionFactory()
                .setUsername("postgres username")
                .setPassword("postgres password")
                .setConnectionUrl("Connection Url postgres");

        DatabaseEntity postgresConnection = postgresql.getDatabaseConnection();
        System.out.println(postgresConnection.toString());

        ProductFactory premiumProduct = new ProductPremium()
                .setId(1L).setName("name").setDesc("desc").setPrice(99.99f).setType("Premium");

        ProductEntity entity = premiumProduct.getProductFactory();
        System.out.println(entity.toString());

        ProductFactory vipProduct = new ProductVip()
                .setId(1L).setName("vip product").setDesc("too much expansive").setPrice(99.99f).setType("VIP");

        ProductEntity vipProEntity = vipProduct.getProductFactory();
        System.out.println(vipProEntity.toString());
    }
}
