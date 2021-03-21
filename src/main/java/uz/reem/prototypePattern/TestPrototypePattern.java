package uz.reem.prototypePattern;

public class TestPrototypePattern {
    public static void main(String[] args) {
        Person person1 = new Person()
                .setFirstName("Shorasul")
                .setLastName("Shoazimov");

        try {
            Person person2 = person1.clone();
            person2.setFirstName("Shoakbar");
            System.out.println(person1);
            System.out.println(person2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
