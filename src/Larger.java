import java.util.Date;

public class Larger extends Beer implements CraftProcess{
    private double fermentationTemp;

    public Larger(String name, double alcoholPercentage, String packaging, String dateOfFabrication, double fermentationTemp) {
        super(name, alcoholPercentage, packaging, dateOfFabrication);
        this.fermentationTemp = fermentationTemp;
    }

    public double getFermentationTemp() {
        return fermentationTemp;
    }

    public void setFermentationTemp(double fermentationTemp) {
        this.fermentationTemp = fermentationTemp;
    }

    @Override
    public String craftProcess() {
       return " The Larger Beer is crafted with a fermentation time of: " + fermentationTemp;
    }

    @Override
    public String toString() {
        return "Larger Beer" + name +
                " fermentationTemp: " + fermentationTemp +
                " alcoholPercentage: " + alcoholPercentage +
                " packaging: " + packaging +
                " dateOfFabrication: " + dateOfFabrication +
                craftProcess();
    }
}
