package nl.novi.javaprogrammeren.one;


public class Partner extends Person {
    private String partnerOf;
    private boolean hasExtraLover;

    public Partner(String name, String job, int age, String partnerOf, boolean hasExtraLover) {
        super(name,job, age);
        this.partnerOf = partnerOf;
        this.hasExtraLover = hasExtraLover;

    }

    public String getPartnerOf() {
        return partnerOf;
    }

    public void setPartnerOf(String partnerOf) {
        this.partnerOf = partnerOf;
    }

    public boolean isHasExtraLover() {
        return hasExtraLover;
    }

    public void setHasExtraLover(boolean hasExtraLover) {
        this.hasExtraLover = hasExtraLover;
    }

    public String toString() {
        return super.toString() + " -- Partner {" +
                " partner = '" + partnerOf+ '\'' +
                ", has an extra lover = '" + hasExtraLover + '\'' +
                " }";
    }

}