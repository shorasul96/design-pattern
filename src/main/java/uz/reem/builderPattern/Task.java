package uz.reem.builderPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    private String id;
    private String summary;
    private String description;
    private boolean done;
    private String dueDate;

}
