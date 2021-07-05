package nl.novi.javaprogrammeren.three;

public class MainThree {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setPhoneNumber("612345678");
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getInternationalPhoneNumber());
    }
}
// variable shadowing zorgt ervoor dat je phone even kan gebruiken voor je international