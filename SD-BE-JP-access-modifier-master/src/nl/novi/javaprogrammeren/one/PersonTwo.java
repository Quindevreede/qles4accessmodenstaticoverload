package nl.novi.javaprogrammeren.one;

public class PersonTwo extends Person {
    private String hobby;
    private boolean hasPartner;

    public PersonTwo(String name, String job, int age, String hobby, boolean hasPartner) {
    super(name,job, age);
    this.hobby = hobby;
    this.hasPartner = hasPartner;

    }
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public boolean isHasPartner() {
        return hasPartner;
    }

    public void setHasPartner(boolean hasPartner) {
        this.hasPartner = hasPartner;
    }

    public String toString() {
        return super.toString() + " -- Other Details {" +
                                  " hobby = '" + hobby+ '\'' +
                                  ", has a partner = '" + hasPartner + '\'' +
                                  " }";
    }

}