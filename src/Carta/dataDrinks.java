package Carta;
//Creating data of the drinks
public class dataDrinks {
    int numberDrink;
    String nameDrink;
    double priceDrink;
    public dataDrinks(int numberDrink, String nameDrink, double priceDrink){
        this.numberDrink=numberDrink;
        this.nameDrink=nameDrink;
        this.priceDrink=priceDrink;
    }
    @Override
    public String toString(){
        return numberDrink + " - " + nameDrink + "Price: S/ " + priceDrink;
    }
}
