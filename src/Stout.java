import java.util.Date;

public class Stout extends Beer implements CraftProcess{
    private String maltUsed;

    public Stout(String name, double alcoholPercentage, String packaging, String dateOfFabrication, String maltUsed) {
        super(name, alcoholPercentage, packaging, dateOfFabrication);
        this.maltUsed = maltUsed;
    }

    @Override
    public String craftProcess() {
        return " The Stout uses " + maltUsed + " malta in the crafting process";
    }

    @Override
    public String toString() {
        return "Stout Beer " + name +
                " maltUsed: " + maltUsed +
                " alcoholPercentage: " + alcoholPercentage +
                " packaging: " + packaging +
                " dateOfFabrication: " + dateOfFabrication +
                craftProcess();
    }
}
