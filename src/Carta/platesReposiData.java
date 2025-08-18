package Carta;
import java.util.ArrayList;
import java.util.List;

public class platesReposiData {
    public static List<dataPlates> insertDataPlates(){
        List<dataPlates> plates = new ArrayList<>();
        plates.add(new dataPlates(1, "Ceviche de pescado.", 30  ));
        plates.add(new dataPlates(2, "Ceviche de conchas negras.", 35 ));
        plates.add(new dataPlates(3, "Ceviche mixto.", 35));
        plates.add(new dataPlates(4, "Chicharron de pescado.", 28 ));
        plates.add(new dataPlates(5, "Chicharron mixto", 35));
        plates.add(new dataPlates(6, "Arroz con mariscos.", 30));
        plates.add(new dataPlates(7, "Parihuela de tramboyo.", 35));
        plates.add(new dataPlates(8, "Sudado de pescado.", 35));
        plates.add(new dataPlates(9, "Causa de cangrejo.", 28));
        return plates;
    }
}
