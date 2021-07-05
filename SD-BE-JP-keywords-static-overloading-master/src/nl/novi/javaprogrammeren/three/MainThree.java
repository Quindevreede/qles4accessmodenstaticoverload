package nl.novi.javaprogrammeren.three;

public class MainThree {
    public static void main(String[] args) {
        Beer amstelBier = new Beer("Amstel");
        Beer brandBier = new Beer("Brand");
        Beer heinekenBier = new Beer("Heineken");

        System.out.println("Dit is biertje nummer: " + Beer.getTappedBeersAmount());
        System.out.println("Aantal biertjes getapt (2): " + heinekenBier.getAmountOfBeersTapped());
        System.out.println("Aantal biertjes getapt (3): " + amstelBier.getAmountOfBeersTapped());



    }
}
