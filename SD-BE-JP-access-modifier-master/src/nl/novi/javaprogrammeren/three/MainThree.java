package nl.novi.javaprogrammeren.three;

import nl.novi.javaprogrammeren.three.sub.Doctor;

public class MainThree {

    public static void main(String[] args) {
        Doctor andre = new Doctor(("987654321"));
        System.out.println(andre.getSofiNumber());

    }
}
