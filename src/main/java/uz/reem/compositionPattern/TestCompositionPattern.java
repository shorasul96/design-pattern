package uz.reem.compositionPattern;

public class TestCompositionPattern {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();

        Worker worker1 = new Worker();
        Worker worker2 = new Worker();

        manager2.addWorker(worker1);
        manager2.addWorker(worker2);

        Worker worker3 = new Worker();

        manager1.addWorker(manager2);
        manager1.addWorker(worker3);


//        manager1.removeWorker(1);
        manager1.displayEmployeeInfo();

    }
}
