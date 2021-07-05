package nl.novi.javaprogrammeren.two;

import java.util.Random;

public class MainTwo {
    public static void main(String[] args) {
        int totalsum = 0;

        for (int i = 0; i < 10; i++) {
            Random random = new Random((int)(Math.random() * 11));
            totalsum = totalsum + random.nextInt();
        }
        System.out.println("De som van alle random-getallen is: " + totalsum);
    }
}
