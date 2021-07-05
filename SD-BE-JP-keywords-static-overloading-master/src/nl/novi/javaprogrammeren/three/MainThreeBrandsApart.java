package nl.novi.javaprogrammeren.three;

public class MainThreeBrandsApart {
    public static void main(String[] args) {
        Amstel amstelBier = new Amstel("Amstel");
        Amstel amstelBier1 = new Amstel("Amstel");
        Amstel amstelBier2 = new Amstel("Amstel");

        Brand brandBier = new Brand("Brand");

        Heineken heinekenBier = new Heineken("Heineken");
        Heineken heinekenBier1 = new Heineken("Heineken");
        Heineken heinekenBier2 = new Heineken("Heineken");
        Heineken heinekenBier3 = new Heineken("Heineken");
        Heineken heinekenBier4 = new Heineken("Heineken");
        System.out.println("---");
        System.out.println("Aantal Amstel biertjes: " + Amstel.getTappedBeersAmountAmstel());
        System.out.println("Aantal Brand biertjes: " + Brand.getTappedBeersAmountBrand());
        System.out.println("Aantal Heineken biertjes: " + Heineken.getTappedBeersAmountHeineken());
        System.out.println("---");
        System.out.println("Totaal aantal biertjes : " + (amstelBier.getAmountOfBeersTappedAmstel() + brandBier.getAmountOfBeersTappedBrand() + heinekenBier.getAmountOfBeersTappedHeineken()));
        System.out.println("Totaal aantal biertjes methode twee : " + (Amstel.getTappedBeersAmountAmstel() + Brand.getTappedBeersAmountBrand() + Heineken.getTappedBeersAmountHeineken()));



    }
}

