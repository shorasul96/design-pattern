package uz.reem.builderPattern;

import java.util.Date;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Task task = new TaskBuilder()
                .setId("1")
                .setDescription("Description")
                .setSummary("Task summary")
                .setDone(false)
                .setDueDate(new Date().toLocaleString())
                .build();

        System.out.println(task);
    }
}
