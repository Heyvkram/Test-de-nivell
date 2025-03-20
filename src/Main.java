public class Main {
    public static void main(String[] args) {
        BeerHandler beerList = new BeerHandler();

        Larger largerBeer1 = new Larger("Murphis", 12.0, "bottle", "2025-02-15", 50);
        IPA ipaBeer1 = new IPA("Black Ipa", 4, "can", "2025-02-15", 30);
        Stout stoutBeer1 = new Stout("VollDamm", 8, "barrel", "2025-02-15", "double");

        beerList.addBeer(largerBeer1);
        beerList.addBeer(ipaBeer1);
        beerList.addBeer(stoutBeer1);

        beerList.showBeers();


    }
}