package nl.novi.javaprogrammeren.one;

public class MainOne {

    public static void main(String[] args) {

        Person seanArcher = new Person("Castor Troy");
        seanArcher.setAge(30);
        seanArcher.ageOneYear();
        System.out.println(seanArcher.getName());
        System.out.println("Leeftijd: " + seanArcher.getAge());
    }
}
