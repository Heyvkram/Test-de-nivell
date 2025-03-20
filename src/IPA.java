import java.util.Date;

public class IPA extends Beer implements CraftProcess{
    private double hopQuantity;

    public IPA(String name, double alcoholPercentage, String packaging, String dateOfFabrication, double hopQuantity) {
        super(name, alcoholPercentage, packaging, dateOfFabrication);
        this.hopQuantity = hopQuantity;
    }

    public double getHopQuantity() {
        return hopQuantity;
    }

    public void setHopQuantity(double hopQuantity) {
        this.hopQuantity = hopQuantity;
    }
    @Override
    public String craftProcess() {
        return " The IPA Beer uses " + hopQuantity + " hops in the crafting process!";
    }

    @Override
    public String toString() {
        return "IPA Beer " + name +
                " hopQuantity: " + hopQuantity +
                " alcoholPercentage: " + alcoholPercentage +
                " packaging: " + packaging + '\'' +
                " dateOfFabrication: " + dateOfFabrication +
                craftProcess();
    }
}
