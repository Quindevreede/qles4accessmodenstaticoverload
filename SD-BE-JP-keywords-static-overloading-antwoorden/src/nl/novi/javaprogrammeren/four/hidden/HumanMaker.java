package nl.novi.javaprogrammeren.four.hidden;

public class HumanMaker {

    private HumanMaker() {
    }

    public static Human createHuman(String name) {
        return new Human(name);
    }

    public static String getHumanName(Human h) {
        return h.getName();
    }
}
