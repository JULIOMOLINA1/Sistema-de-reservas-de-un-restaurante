package Main;

import Reservas.ManageReservations;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.List;
import Carta.dataPlates;
import Carta.dataDrinks;
import Carta.dataSweets;
import Carta.platesReposiData;
import Carta.drinksReposiData;
import Carta.sweetsReposiData;

public class Main {
    public static int recogInt(Scanner in){
        while (!in.hasNextInt()){
            System.out.println("Invalid option. Please try again...");
            in.next();
        }
        return in.nextInt();
    }
    public static void main(String[] args) {
        boolean follow0 = true;
        Scanner in = new Scanner(System.in);
        ManageReservations manager = new ManageReservations();

        while(follow0){
            System.out.println("***** Welcome to Cevicheria: El Rey *****");
            System.out.println("Our options:");
            System.out.println("1. Make a reservation.");
            System.out.println("2. Show a registered reservation.");
            System.out.println("3. Show the menu.");
            System.out.println("4. Exit.");
            System.out.println("Enter an option:");
            int option = recogInt(in);
            switch(option){
                case 1:
                    while(true) {
                        in.nextLine();
                        System.out.println("Enter your Full name or write 'exit' to quit: ");
                        String fullName = in.nextLine();
                        if(fullName.equalsIgnoreCase("exit"))break;

                        System.out.println("Enter your DNI:");
                        int idNumber = in.nextInt();
                        in.nextLine();

                        System.out.println("Enter the year of your reservation(yyyy): ");
                        int year = recogInt(in);
                        System.out.println("Enter the month of your reservation(from 1 to 12):");
                        int month = recogInt(in);
                        System.out.println("Enter the day of your reservation(from 1 to 31):");
                        int day = recogInt(in);

                        System.out.println("Enter the hour of your reservation(from 8 to 23h):");
                        int hour = recogInt(in);
                        System.out.println("Enter the minutes:");
                        int minute = recogInt(in);
                        in.nextLine();

                        System.out.println("Enter the number of people in your group(from 1 to 10):");
                        int numPeople = recogInt(in);

                        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, minute);

                        manager.AddReservations(fullName, idNumber, dateTime, numPeople);
                    }
                    break;
                case 2:
                    System.out.println("Enter your DNI to show you a reservation.");
                    int idLookFor = recogInt(in);
                    manager.SeeReservationForId(idLookFor);
                    break;
                case 3:
                    System.out.println("Hello this is our Food and Drink Menu.");
                    System.out.println("1. Entrees");
                    System.out.println("2. Desserts");
                    System.out.println("3. Drinks");
                    System.out.println("4. Exit");
                    System.out.println("Please enter the option what would you like to review:");
                    int numberCarta = recogInt(in);
                    boolean follow2 = true;
                    switch (numberCarta){
                        case 1:
                            System.out.println("These are our entrees:");
                            List<dataPlates> plates = platesReposiData.insertDataPlates();
                            for(dataPlates plates1 : plates){
                                System.out.println(plates1);
                            }
                            break;
                        case 2:
                            System.out.println("These are our desserts:");
                            List<dataSweets> sweets = sweetsReposiData.insertDataSweets();
                            for(dataSweets sweets1 : sweets){
                                System.out.println(sweets1);
                            }
                            break;
                        case 3:
                            System.out.println("These are our drinks:");
                            List<dataDrinks> drinks = drinksReposiData.insertDataDrinks();
                            for(dataDrinks drinks1 : drinks){
                                System.out.println(drinks1);
                            }
                            break;
                        case 4:
                            System.out.println("Thank you for your visit.");
                            follow2 = false;
                            break;
                        default:
                            System.out.println("Error. Invalid option.");
                            follow2 = false;
                    }
                    break;
                case 4:
                    System.out.println("Good bye. Come back soon.");
                    follow0 = false;
                    break;
                default:
                    System.out.println("Error. The number must be between 1 and 4.");
            }
        }
    }
}