package nl.novi.javaprogrammeren.three;

public class Amstel {
    private String brandA;
    private static int amountOfBeers = 0;
    //static is zodat we geen object hoeven aan te maken in Main

    public Amstel(String brandA) {
        this.brandA = brandA;
        System.out.println("Er is weer een Amstel biertje getapt!");
        amountOfBeers++;
        System.out.println("Dit is Amstel biertje nummer: " + amountOfBeers);
    }

    public static int getTappedBeersAmountAmstel() { return amountOfBeers; }

    public int getAmountOfBeersTappedAmstel() { return amountOfBeers;}

}