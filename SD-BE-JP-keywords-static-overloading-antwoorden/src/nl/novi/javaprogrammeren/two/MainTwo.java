package nl.novi.javaprogrammeren.two;

public class MainTwo {

    public static void main(String[] args) {
        Animal a = new Dog(4, "Lassie");
        System.out.println(a.getName());
        System.out.println(a.getAmountOfLegs());
        a.pet();
    }
}
