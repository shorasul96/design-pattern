package uz.reem.factoryMethodPattern.entities.productFactory.connection;

import uz.reem.factoryMethodPattern.entities.productFactory.ProductEntity;

public class ProductVipConnection extends ProductEntity {
    public ProductVipConnection(Long id, String name, String desc, float price, String type) {
        setId(id);
        setName(name);
        setDesc(desc);
        setPrice(price);
        setType(type);
    }
}
