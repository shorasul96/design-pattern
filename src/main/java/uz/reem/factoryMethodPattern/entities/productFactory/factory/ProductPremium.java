package uz.reem.factoryMethodPattern.entities.productFactory.factory;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import uz.reem.factoryMethodPattern.entities.productFactory.ProductEntity;
import uz.reem.factoryMethodPattern.entities.productFactory.ProductFactory;
import uz.reem.factoryMethodPattern.entities.productFactory.connection.ProductPremiumConnection;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class ProductPremium extends ProductFactory {

    private Long id;
    private String name;
    private String desc;
    private float price;
    private String type;

    @Override
    public ProductEntity getProductFactory() {
        return new ProductPremiumConnection(id, name, desc, price, type);
    }
}
