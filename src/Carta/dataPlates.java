package Carta;
//Creating data of the plates
public class dataPlates {
    int numberPlate;
    String namePlate;
    double pricePlate;
    public dataPlates(int numberPlate, String namePlate, double pricePlate ){
        this.numberPlate=numberPlate;
        this.namePlate=namePlate;
        this.pricePlate=pricePlate;
    }
    //Implementing toString to print the data in Class Main.
    @Override
    public String toString(){
        return numberPlate + " - " + namePlate + "Price. S/" + pricePlate;
    }
}

