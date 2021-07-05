package nl.novi.javaprogrammeren.two.sub;

public class Phone {
    private String brand;
    private String owner;

    public Phone(String brand,String owner) {
        this.brand = brand;
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
