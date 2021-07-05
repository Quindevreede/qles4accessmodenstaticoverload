package nl.novi.javaprogrammeren.three;

public class Beer {
    private String brand;
    private static int amountOfBeers = 0;
    //static is zodat we geen object hoeven aan te maken in Main

    public Beer(String brand) {
        this.brand = brand;
        System.out.println("Er is weer een biertje getapt!");
        amountOfBeers++;
        System.out.println("Dit is biertje nummer: " + amountOfBeers);
    }

    public static int getTappedBeersAmount() { return amountOfBeers; }

    public int getAmountOfBeersTapped() { return amountOfBeers;}

}
