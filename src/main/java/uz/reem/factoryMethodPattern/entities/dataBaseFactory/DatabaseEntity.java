package uz.reem.factoryMethodPattern.entities.dataBaseFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DatabaseEntity {
    private String username;
    private String password;
    private String connectionUrl;
}
