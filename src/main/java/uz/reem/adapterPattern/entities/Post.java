package uz.reem.adapterPattern.entities;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Post implements Cloneable {
    private Long id;
    private String title;
    private String body;

    @Override
    public Post clone() throws CloneNotSupportedException {
        return (Post) super.clone();
    }
}
