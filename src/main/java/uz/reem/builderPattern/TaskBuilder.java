package uz.reem.builderPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TaskBuilder {

    private String id;
    private String summary;
    private String description;
    private boolean done;
    private String dueDate;

    public Task build(){
        return new Task(id, summary, description, done, dueDate);
    }

}
