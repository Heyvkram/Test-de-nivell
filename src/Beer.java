import java.util.Date;

public abstract class Beer {
    protected String name;
    protected double alcoholPercentage;
    protected String packaging;
    protected String dateOfFabrication;

    public Beer(String name, double alcoholPercentage, String packaging, String dateOfFabrication) {
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
        this.packaging = packaging;
        this.dateOfFabrication = dateOfFabrication;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

}
