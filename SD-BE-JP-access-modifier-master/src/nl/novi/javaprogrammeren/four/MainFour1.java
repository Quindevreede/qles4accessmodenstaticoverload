package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.PrisonCell1;

public class MainFour1 {
    public static void main(String[] args) {
        PrisonCell1 prisonCell = new PrisonCell1("Arjen");
        System.out.println(prisonCell.getPrisonerName());
    }
}
