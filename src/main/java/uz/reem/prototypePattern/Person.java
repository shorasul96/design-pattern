package uz.reem.prototypePattern;

import lombok.Data;
import lombok.experimental.Accessors;
//data
@Data
@Accessors(chain = true)
public class Person implements Cloneable{

    private String firstName;
    private String lastName;

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
