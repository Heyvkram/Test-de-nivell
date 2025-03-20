import java.util.ArrayList;
import java.util.List;

public class BeerHandler {
    private List<Beer> beerList = new ArrayList<>();

    public void addBeer(Beer beer){
        beerList.add(beer);
    }

    public void showBeers(){
        beerList.forEach(System.out::println);
    }

    public void sortBeerByAlcoholPercentage(){

    }

}
