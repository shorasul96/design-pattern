package uz.reem.factoryMethodPattern.entities.productFactory.connection;

import uz.reem.factoryMethodPattern.entities.productFactory.ProductEntity;

public class ProductPremiumConnection extends ProductEntity {
    public ProductPremiumConnection(Long id, String name, String desc, float price, String type) {
        setId(id);
        setName(name);
        setDesc(desc);
        setPrice(price);
        setType(type);
    }
}
