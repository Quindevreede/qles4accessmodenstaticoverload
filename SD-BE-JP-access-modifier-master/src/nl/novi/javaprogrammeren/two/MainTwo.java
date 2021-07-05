package nl.novi.javaprogrammeren.two;

import nl.novi.javaprogrammeren.two.sub.Phone;

public class MainTwo {
    public static void main(String[] args) {

        Phone phone = new Phone("Nokia", "unknown");
        System.out.println(phone.getBrand());

        Phone phone2 = new Phone("Samsung", "Samson");
        System.out.println(phone2.getBrand());
        System.out.println(phone2.getOwner());
        System.out.println(phone2.getBrand());
    }
}

