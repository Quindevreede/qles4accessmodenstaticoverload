package nl.novi.javaprogrammeren.one;

public class MainOne {
    public static void main(String[] args) {
        Person henry = new Person("Henry", "Geitenbreier", " ");

        // Add code below
        henry.setFullName("Sjaak", "van der", "van der");
        // Add code above

        System.out.println(henry.getFullName());

        Person test = new Person("Test", "Testerientje");
        test.setFullName("Lizzie", "Bizzie");
        System.out.println(test.getFullName());

    }
}
