package nl.novi.javaprogrammeren.four.hidden;

public class PrisonCell1 extends Inhabitant1 {

    public Inhabitant1 prisoner;

    public PrisonCell1(String prisonerName) {
        super(prisonerName);
        this.prisoner = new Inhabitant1(prisonerName);
    }
        public String getPrisonerName () {
            return prisoner.getName();

        }
    }
