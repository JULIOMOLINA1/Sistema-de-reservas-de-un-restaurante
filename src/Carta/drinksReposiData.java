package Carta;
import java.util.ArrayList;
import java.util.List;

public class drinksReposiData {
    public static List<dataDrinks> insertDataDrinks(){
        List<dataDrinks> drinks = new ArrayList<>();
        drinks.add(new dataDrinks(1, "Shot de tequila.", 23));
        drinks.add(new dataDrinks(2, "Pisco sour.", 23));
        drinks.add(new dataDrinks(3, "Margarita.", 22));
        drinks.add(new dataDrinks(4, "Machu picchu.", 25));
        drinks.add(new dataDrinks(5, "Cuba libre.", 20));
        drinks.add(new dataDrinks(6, "Soda.", 15));
        return drinks;
    }
}
