package Carta;
import java.util.ArrayList;
import java.util.List;

public class sweetsReposiData {
    public static List<dataSweets> insertDataSweets(){
        List<dataSweets> sweets = new ArrayList<>();
        sweets.add(new dataSweets(1, "Torta de chocolate.", 15 ));
        sweets.add(new dataSweets(2, "Torta de zanahoria.", 15));
        sweets.add(new dataSweets(3, "Tres leches.", 16));
        sweets.add(new dataSweets(4, "Torta helada.", 14));
        sweets.add(new dataSweets(5, "Leche asada.", 18));
        return sweets;
    }
}
