package nl.novi.javaprogrammeren.four.hidden;

public class PrisonCellOG extends InhabitantOG {

    private InhabitantOG prisoner;

    public PrisonCellOG(String prisonerName) {
        super(prisonerName);
        this.prisoner = new InhabitantOG(prisonerName);
    }

    public String getPrisonerName() {
        return prisoner.getName();

    }
}
