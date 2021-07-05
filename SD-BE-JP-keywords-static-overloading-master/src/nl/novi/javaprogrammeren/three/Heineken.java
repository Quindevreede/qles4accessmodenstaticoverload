package nl.novi.javaprogrammeren.three;

public class Heineken {
    private String brandH;
    private static int amountOfBeers = 0;
    //static is zodat we geen object hoeven aan te maken in Main

    public Heineken(String brandH) {
        this.brandH = brandH;
        System.out.println("Er is weer een Heineken biertje getapt!");
        amountOfBeers++;
        System.out.println("Dit is Heineken biertje nummer: " + amountOfBeers);
    }

    public static int getTappedBeersAmountHeineken() { return amountOfBeers; }

    public int getAmountOfBeersTappedHeineken() { return amountOfBeers;}

}