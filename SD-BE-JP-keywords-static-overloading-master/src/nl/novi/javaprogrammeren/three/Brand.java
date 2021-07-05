package nl.novi.javaprogrammeren.three;

public class Brand {
    private String brandB;
    private static int amountOfBeers = 0;
    //static is zodat we geen object hoeven aan te maken in Main

    public Brand(String brandB) {
        this.brandB = brandB;
        System.out.println("Er is weer een Brand biertje getapt!");
        amountOfBeers++;
        System.out.println("Dit is Brand biertje nummer: " + amountOfBeers);
    }

    public static int getTappedBeersAmountBrand() { return amountOfBeers; }

    public int getAmountOfBeersTappedBrand() { return amountOfBeers;}

}