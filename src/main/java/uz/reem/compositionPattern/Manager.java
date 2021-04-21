package uz.reem.compositionPattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{

    private List<Employee> workerList = new ArrayList<>();

    public void addWorker(Employee employee) {
        workerList.add(employee);
    }

    public void removeWorker(int index) {
        workerList.remove(index);
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("I am a manager");
        for (Employee employee : workerList) {
            employee.displayEmployeeInfo();
        }
    }
}
