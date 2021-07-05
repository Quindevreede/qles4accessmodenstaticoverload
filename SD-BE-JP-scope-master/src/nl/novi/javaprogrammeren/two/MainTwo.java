package nl.novi.javaprogrammeren.two;

import java.util.Random;

public class MainTwo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int totalsum = 0;
            Random random = new Random();
            totalsum = totalsum + random.nextInt();
        }
    }
}
