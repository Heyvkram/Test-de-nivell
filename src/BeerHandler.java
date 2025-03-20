import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BeerHandler {
    private List<Beer> beerList = new ArrayList<>();

    public void addBeer(Beer beer){
        beerList.add(beer);
    }

    public void showBeers(){
        beerList.forEach(System.out::println);
    }

    public List<Beer> filterBeersByAlcoholPercentage(double maxAlcoholPercentage) {
        return beerList.stream()
                .filter(beer -> beer.getAlcoholPercentage() > maxAlcoholPercentage)
                .collect(Collectors.toList());
    }
}
