package nl.novi.javaprogrammeren.two;

public class MainTwo {

    public static void main(String[] args) {
        Animal dog = new Dog(5, "Naamaals");
        System.out.println("HIER! " + dog.getName());
        dog.pet();
    }
}
