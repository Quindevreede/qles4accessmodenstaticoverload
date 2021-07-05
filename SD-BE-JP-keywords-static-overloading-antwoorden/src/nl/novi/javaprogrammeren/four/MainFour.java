package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.Human;
import nl.novi.javaprogrammeren.four.hidden.HumanMaker;

public class MainFour {
    public static void main(String[] args) {
        Human createdHuman = HumanMaker.createHuman("Nick");

        System.out.println("Het nieuwe mensje heet: " + HumanMaker.getHumanName(createdHuman));
    }
}
