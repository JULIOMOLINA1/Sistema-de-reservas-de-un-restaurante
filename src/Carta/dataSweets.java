package Carta;
//Creating data of the sweets
public class dataSweets {
    int numberSweet;
    String nameSweet;
    double priceSweet;
    public dataSweets(int numberSweet, String nameSweet, double priceSweet){
        this.numberSweet=numberSweet;
        this.nameSweet=nameSweet;
        this.priceSweet=priceSweet;
    }
    @Override
    public String toString(){
        return numberSweet + " - " + nameSweet + " Price: S/ " + priceSweet;
    }
}
